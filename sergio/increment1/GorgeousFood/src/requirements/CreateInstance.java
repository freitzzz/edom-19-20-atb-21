package requirements;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import gorgeousFood_Increment1.Comment;
import gorgeousFood_Increment1.GorgeousFood_Increment1Factory;
import gorgeousFood_Increment1.Model;
import gorgeousFood_Increment1.Requirement;
import gorgeousFood_Increment1.RequirementGroup;
import gorgeousFood_Increment1.Resolution;
import gorgeousFood_Increment1.State;
import gorgeousFood_Increment1.Version;

public class CreateInstance {
	public static void main(String[] args) {
		createInstance();
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
		
		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		//-------------		
	}
	
	public static String readFilename() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the requirements file name:");
		
		String fileName = scanner.nextLine();
		scanner.close();
		return fileName;
	}
	
	public static void createInstance() {
		initOCL();
		
		// Associate the "mindmap" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("requirements", new XMIResourceFactoryImpl());
		
		// Initialize the model
		gorgeousFood_Increment1.GorgeousFood_Increment1Package.eINSTANCE.eClass();
		
		// Retrieve the default factory singleton
		GorgeousFood_Increment1Factory factory = GorgeousFood_Increment1Factory.eINSTANCE;
		
		// Create a model
		Model model = factory.createModel();
		model.setTitle("Gorgeous Food");
		
		// Unserved meals requirement group
		RequirementGroup reqGroup1 = factory.createRequirementGroup();
		reqGroup1.setId("req_group_1");
		reqGroup1.setName("Unserved meals");
		reqGroup1.setDescription("Unserved meals requirements");
		
		Version version = factory.createVersion();
		version.setMajor(1);
		version.setMinor(0);
		version.setService(0);
		
		// Create requirement add meal to inventory
		Requirement requirement1 = factory.createRequirement();
		requirement1.setTitle("Add meal to inventory");
		requirement1.setDescription("Adds unserved meal to software inventory");
		requirement1.setAuthor("Sérgio Ferreira");
		requirement1.setCreated(new Date(1570053040460L));
		requirement1.setVersion(version);
		requirement1.setId("req_1");
		
		reqGroup1.getRequirements().add(requirement1);
		model.getGroups().add(reqGroup1);
		
		// Meals requirement group
		RequirementGroup reqGroup2 = factory.createRequirementGroup();
		reqGroup2.setId("req_group_2");
		reqGroup2.setName("Meals to serve");
		reqGroup2.setDescription("Meals to serve requirements");
			
		Version version2 = factory.createVersion();
		version2.setMajor(1);
		version2.setMinor(0);
		version2.setService(0);
		
		// Create requirement list all meals
		Requirement requirement2 = factory.createRequirement();
		requirement2.setTitle("List all meals");
		requirement2.setDescription("List all meals of the inventory");
		requirement2.setAuthor("Sérgio Ferreira");
		requirement2.setCreated(new Date(1570053040460L));
		requirement2.setVersion(version2);
		requirement2.setId("req_2");
		reqGroup2.getRequirements().add(requirement2);
		
		Version version3 = factory.createVersion();
		version3.setMajor(1);
		version3.setMinor(0);
		version3.setService(0);
		
		// Create requirement list meal
		Requirement requirement3 = factory.createRequirement();
		requirement3.setTitle("List a meal");
		requirement3.setDescription("List a specific meal");
		requirement3.setAuthor("Sérgio Ferreira");
		requirement3.setCreated(new Date(1570053040460L));
		requirement3.setVersion(version3);
		requirement3.setId("req_3");
		requirement3.setParent(requirement2);
		
		//reqGroup2.getRequirements().add(requirement3);
		
		Comment comment = factory.createComment();
		comment.setAuthor("Sergio Ferreira");
		comment.setBody("All the specificities of the meal should be listed");
		comment.setSubject("Comment");
		comment.setCreated(new Date(1570053040460L));
		
		Comment comment2 = factory.createComment();
		comment2.setAuthor("Antonio");
		comment2.setBody("Do not forget to include the meal nutritional data");
		comment2.setSubject("Comment");
		comment2.setCreated(new Date(1570053040460L));
		
		comment.getChildren().add(comment2);
		
		requirement3.getComment().add(comment);
		
		Version version4 = factory.createVersion();
		version4.setMajor(1);
		version4.setMinor(0);
		version4.setService(0);
		// Create requirement pay meal
		Requirement requirement4 = factory.createRequirement();
		requirement4.setTitle("Pay meal");
		requirement4.setDescription("Pay a meal");
		requirement4.setAuthor("Sérgio Ferreira");
		requirement4.setCreated(new Date(1570053040460L));
		requirement4.setVersion(version4);
		requirement4.setId("req_4");
		
		Comment comment1 = factory.createComment();
		comment1.setAuthor("Sergio");
		comment1.setBody("The user who purchased the meal should be recorded");
		comment1.setSubject("Requirement specificity");
		comment1.setCreated(new Date(1570053040460L));
		
		requirement4.getComment().add(comment1);

		reqGroup2.getRequirements().add(requirement4);
		model.getGroups().add(reqGroup2);
		
		RequirementGroup reqGroup3 = factory.createRequirementGroup();
		reqGroup3.setId("reqgroup3");
		reqGroup3.setName("Gorgeous Food location");
		reqGroup3.setDescription("Location helpers for Gorgeous Food");
		
		Version version5 = factory.createVersion();
		version5.setMajor(1);
		version5.setMinor(0);
		version5.setService(0);
		
		Requirement requirement5 = factory.createRequirement();
		requirement5.setTitle("Set Gorgeous Food location");
		requirement5.setDescription("Set the gorgeous food location for the next 24 hours");
		requirement5.setAuthor("Sérgio Ferreira");
		requirement5.setCreated(new Date(1570053040460L));
		requirement5.setVersion(version5);
		requirement5.setId("req_5");

		Version version6 = factory.createVersion();
		version6.setMajor(1);
		version6.setMinor(0);
		version6.setService(0);
		
		Requirement requirement6 = factory.createRequirement();
		requirement6.setTitle("List Gorgeous Food location");
		requirement6.setDescription("List Gorgeous Food current location");
		requirement6.setAuthor("Sérgio Ferreira");
		requirement6.setCreated(new Date(1570053040460L));
		requirement6.setVersion(version6);
		requirement6.setId("req_6");
		
		requirement6.getDependencies().add(requirement5);
		
		reqGroup3.getRequirements().add(requirement5);
		reqGroup3.getRequirements().add(requirement6);
		
		model.getGroups().add(reqGroup3);

		// Add a call to validation...
        // See: https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
        // See: generated code for MindmapValidator.java
        // See: https://mattsch.com/2012/05/31/how-to-use-ocl-when-running-emf-standalone/
        // See: https://wiki.eclipse.org/OCL/OCLinEcore
        System.out.println("Diagnostic:");
        Diagnostic diag=Diagnostician.INSTANCE.validate(model);
        if (diag.getSeverity()!=Diagnostic.OK) {
        	System.out.println(diag.getMessage());
        	List<Diagnostic> l=diag.getChildren();
        	for (Diagnostic d: l) {
        		System.out.println(d.getMessage());
        	}
        }
        else {
        	System.out.println("Requirements model is valid!");
        }
        
        if (diag.getChildren().size() > 0) {
        	System.out.println("OCL validation failed. Exiting...");
        	System.exit(0);
        }
        
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        String filename = readFilename();
        // create a resource
        Resource resource = resSet.createResource(URI.createURI("instances/" + filename + ".xmi"));

        resource.getContents().add(model);
        
        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println("File saved succesfully in instances/" + filename + ".xmi");
        } catch (IOException e) {
        	System.out.println("There was an error while saving the instance");
        } 
	}
}
