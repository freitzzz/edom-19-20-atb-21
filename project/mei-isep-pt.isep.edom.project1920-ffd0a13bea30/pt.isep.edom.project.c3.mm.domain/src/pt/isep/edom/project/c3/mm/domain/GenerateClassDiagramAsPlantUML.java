package pt.isep.edom.project.c3.mm.domain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

//This class will generate a PlantUML file with the representation of a domain model instance as a class diagram
//The instance file path should be defined as the first argument
//The generated PlantUML file path should be defined as the second argument
//The generator takes in account spaces found in identifiers and wraps them with quotes
public class GenerateClassDiagramAsPlantUML {

	public static void main(String[] args) {
		String instancePath = args[0];
		String generatedPUMLPath = args[1];
		
		File instanceAsFile = new File(instancePath);
		File generatedPUMLAsFile = new File(generatedPUMLPath);
		
		loadModel(instanceAsFile, generatedPUMLAsFile);
	}
	
	public static void initOCL() {
		//-----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		
		OCLDelegateDomain.initialize(null);
		
		EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		//-------------		
	}

	public static void loadModel(File requirementsInstanceAsFile, File generatedPUMLAsFile) {
		
		initOCL();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		DomainPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		DomainFactory factory = DomainFactory.eINSTANCE;

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createURI(requirementsInstanceAsFile.getAbsolutePath()), true);
		
		// now load the content.
		PrintWriter writer=null;
		try {
			resource.load(Collections.EMPTY_MAP);

			EObject root = resource.getContents().get(0);
			DomainModel loadedModel=(DomainModel)root;
			
			System.out.println(root.toString());
			
			Diagnostic diag=Diagnostician.INSTANCE.validate(loadedModel);
	        if (diag.getSeverity() == Diagnostic.ERROR) {
	        	
	        	System.out.println(diag.getMessage());
	        	
	        	List<Diagnostic> l=diag.getChildren();
	        	
	        	for (Diagnostic d: l) {
	        		System.out.println(d.getMessage());
	        	}
	        	
	        	throw new IllegalStateException("Domain Model has failed OCL validations");
	        }
			
			FileWriter w = new FileWriter(generatedPUMLAsFile);
			
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        
	        writer.println(domainModelToPUML(loadedModel));
	        
	        writer.println("@enduml");		
	        writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(writer != null) {
				writer.close();
			}
		}
	}
	
	private static String domainModelToPUML(DomainModel model) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("title ").append(model.getName()).append('\n');
		
		List<Entity> entities = model.getEntities();
		
		for(Entity entity : entities) {
			
			builder.append(entityToPUML(entity)).append('\n');
			
		}
		
		return builder.append('\n').toString();
	}
	
	private static String entityToPUML(Entity entity) {
		StringBuilder builder = new StringBuilder();
		
		String entityNameWithQuotes = quoteString(entity.getName());
		
		builder.append("class ").append(entityNameWithQuotes).append('{').append('\n');
		
		List<Field> fields = entity.getFields();
		
		for(Field field : fields) {
			
			builder.append(fieldToPUML(field)).append('\n');
			
		}
		
		builder.append('}').append('\n');
		
		List<SubEntity> subEntities = entity.getSubentities();
		
		for(SubEntity subEntity : subEntities) {
			
			String composedEntityNameWithQuotes = quoteString(subEntity.getEntity().getName());
			
			builder
			.append(entityNameWithQuotes) // Meal
			.append(" \"1\" ").append(" *-- ").append('"').append(subEntity.getUpperBound()).append('"') // Meal "1" *-- "*"
			.append(composedEntityNameWithQuotes) // Meal "1" *-- "*" Ingredient
			.append(" : ").append(subEntity.getName()).append(" >").append('\n'); // Meal "1" *-- "*" Ingredient : composed by >
			
		}
		
		List<Reference> references = entity.getReferences();
		
		for(Reference reference : references) {
			
			String referencedEntityNameWithQuotes = quoteString(reference.getEntity().getName());
			
			builder
			.append(entityNameWithQuotes) // Meal
			.append(" \"1\" ").append(" -- ").append('"').append(reference.getUpperBound()).append('"') // Meal "1" -- "1"
			.append(referencedEntityNameWithQuotes) // Meal "1" -- "1" MealType
			.append(" : ").append(reference.getName()).append(" >").append('\n'); // Meal "1" -- "1" MealType: has a >
			
		}
		
		return builder.toString();
	}
	
	private static String fieldToPUML(Field field) {
		StringBuilder builder = new StringBuilder();
		
		builder.append('\t').append(field.getName()).append(" : ").append(field.getType().toString());
		
		return builder.toString();
	}
	
	// Quotes a string (e.g. quoteString("abc") -> "abc"
	private static String quoteString(String stringToQuote) {
		return new StringBuilder().append('"').append(stringToQuote).append('"').toString();
	}
	
}
