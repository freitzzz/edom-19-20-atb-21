package requirements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenerateRequirementsPUML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String requirementsInstancePath = args[0];
		File requirementsInstanceAsFile = new File(requirementsInstancePath);
		loadModel(requirementsInstanceAsFile);
	}

	public static void loadModel(File requirementsInstanceAsFile) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("Requirements", new XMIResourceFactoryImpl());

		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		RequirementsFactory factory = RequirementsFactory.eINSTANCE;

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createURI(requirementsInstanceAsFile.getAbsolutePath()), true);

		// now load the content.
		PrintWriter writer=null;
		try {
			resource.load(Collections.EMPTY_MAP);

			EObject root = resource.getContents().get(0);
			Model loadedModel=(Model)root;
			
			System.out.println(root.toString());
			
			//-----
			// Generate a plantuml file that represents the mind map diagram
			FileWriter w = new FileWriter("instances/Requirements.puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        
	        // TODO: Implement puml generation
	        
	        writer.println("@enduml");		
	        writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
	}
}
