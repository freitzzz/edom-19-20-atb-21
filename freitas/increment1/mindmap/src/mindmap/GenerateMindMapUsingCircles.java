package mindmap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

// This class will generate a PlantUML file with the representation of a mindmap instance using circles
// The mindmap instance should be defined in the following file: instances/GorgeousFoodApplication.xmi
// The generated PlantUML file is defined as the following file: instances/gorgeous_food_application_mindmap.puml
// The generator takes in account spaces found in Map titles and Topic names, by using quotes to define identifiers
public class GenerateMindMapUsingCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadModel();
	}

	public static void loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		MindmapPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		MindmapFactory factory = MindmapFactory.eINSTANCE;

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createURI("instances/GorgeousFoodApplication.xmi"), true);

		// now load the content.
		PrintWriter writer=null;
		try {
			resource.load(Collections.EMPTY_MAP);

			EObject root = resource.getContents().get(0);
			Map myMap=(Map)root;
			List<MapElement> mapElements = myMap.getElements();
			
			System.out.println(root.toString());
			
			//-----
			// Generate a plantuml file that represents the mind map diagram
			FileWriter w = new FileWriter("instances/gorgeous_food_application_mindmap.puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        writer.println("digraph mindmap {");
	        
	        if(!mapElements.isEmpty()) {
	        	
	        	writer.println("\"" + myMap.getTitle() + "\"");
		        
	        	writer.println("\"" + myMap.getTitle()+ "\"" + " -> " + "\"" + mapElements.get(0).getName() + "\"");
		        
				// For the Topics
				for (MapElement e: mapElements) {
					if (e instanceof Topic) {
						Topic t=(Topic)e;
						writer.println("\"" + t.getName() + "\"");
					}
				}
				
				// For the hierarchy
				for (MapElement e: mapElements) {
					if (e instanceof Topic) {
						Topic t=(Topic)e;
						for (Topic t2: t.getSubtopics()) {
							writer.println("\"" + t.getName()+ "\"" + " -> "+ "\"" + t2.getName() + "\"");
						}
					}
				}
	        }
			
			//resource.save(Collections.EMPTY_MAP);
			writer.println("}");
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
