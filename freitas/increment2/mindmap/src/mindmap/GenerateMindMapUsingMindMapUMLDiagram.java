package mindmap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

// This class will generate a PlantUML file with the representation of a mindmap instance using a mindmap UML diagram
// The mindmap instance should be defined in the following file: instances/GorgeousFoodApplication.xmi
// The generated PlantUML file is defined as the following file: instances/gorgeous_food_application_mindmap_uml.puml
// The generator takes in account spaces found in Map titles and Topic names, by using quotes to define identifiers
public class GenerateMindMapUsingMindMapUMLDiagram {

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
			List<Topic> rootTopics = myMap.getRootTopics();
			
			System.out.println(rootTopics);
			
			System.out.println(root.toString());
			
			//-----
			// Generate a plantuml file that represents the mind map diagram
			FileWriter w = new FileWriter("instances/gorgeous_food_application_mindmap_uml.puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startmindmap");
	        writer.println("digraph mindmap {");
	        
	        if(!rootTopics.isEmpty()) {
	        	
	        	writer.println("* " + "\"" + myMap.getTitle() + "\"");
		        
	        	writer.println(buildPlantUMLMindMapUsingRecursion(1, rootTopics));
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
	
	public static String buildPlantUMLMindMapUsingRecursion(int level, List<? extends MapElement> mapElements) {
		
		StringBuilder builder = new StringBuilder();
		
		if(mapElements == null || mapElements.isEmpty()) {
			return builder.toString();
		}
		
		
		for(MapElement e : mapElements) {
			int currentLevel = -1;
			
			while(currentLevel < level) {
				builder.append('*');
				currentLevel++;
			}
			
			builder.append(' ');
			
			builder.append("\"").append(e.getName()).append("\"").append('\n');
			
			if(e.eClass().getClass().equals(Topic.class)) {
				List<Topic> subTopics = ((Topic)e).getSubtopics();
				builder.append(buildPlantUMLMindMapUsingRecursion(currentLevel+1, subTopics));
			}
		}
		
		return builder.toString();
	}
	
}
