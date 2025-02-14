package requirements;

import java.io.File;
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

//This class will generate a PlantUML file with the representation of a requirements instance as an object diagram
//The requirements instance file path should be defined as the first argument
//The generated PlantUML file path should be defined as the second argument
//The generator takes in account spaces found in identifiers and wraps them with quotes
public class GenerateRequirementsPUMLUsingObjectDiagram {

	public static void main(String[] args) {
		String requirementsInstancePath = args[0];
		String generatedPUMLPath = args[1];
		
		File requirementsInstanceAsFile = new File(requirementsInstancePath);
		File generatedPUMLAsFile = new File(generatedPUMLPath);
		
		loadModel(requirementsInstanceAsFile, generatedPUMLAsFile);
	}

	public static void loadModel(File requirementsInstanceAsFile, File generatedPUMLAsFile) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();

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
			
			FileWriter w = new FileWriter(generatedPUMLAsFile);
			
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        
	        writer.println(modelToPUML(loadedModel));
	        
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
	
	private static String modelToPUML(Model model) {
		StringBuilder builder = new StringBuilder();
		
		String modelTitle = "(M) " + model.getTitle();
		
		builder.append(plantUMLObject(modelTitle)).append('\n');
		
		List<RequirementGroup> groups = model.getGroups();
		
		if(!groups.isEmpty()) {
			
			for(RequirementGroup g: groups) {
			
				builder.append(requirementGroupToPUML(g));
			
			}
			
			for(RequirementGroup g: groups) {
			
				builder.append("obj").append(modelTitle.hashCode()).append(" .. ").append("obj").append(("(RG) " + g.getName()).hashCode()).append('\n');
			
			}
			
		}
		
		String legend = "legend right\n" + 
				"|= |= Type |\n" + 
				"| M|Model|\n" + 
				"| R|Requirement|\n" + 
				"| RG|Requirement Group |\n" + 
				"endlegend";
		
		builder.append(legend).append('\n');
		
		return builder.toString().replaceAll("obj-", "obj_");
	}
	
	private static String requirementGroupToPUML(RequirementGroup group) {
		
		StringBuilder builder = new StringBuilder();
		
		String groupName = "(RG) " + group.getName();

		builder.append(plantUMLObject(groupName)).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(groupName.hashCode()), "description", breakStringInLines(group.getDescription(), 40))).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(groupName.hashCode()), "id", breakStringInLines(group.getId(), 40))).append('\n');
		
		List<Requirement> requirements = group.getRequirements();
		
		if(!requirements.isEmpty()) {
			
			for(Requirement r: requirements) {
				
				builder.append(requirementToPUML(r));
				
			}
			
			for(Requirement r: requirements) {
				
				builder.append("obj").append(groupName.hashCode()).append(" .. ").append("obj").append(("(R) " + r.getName()).hashCode()).append('\n');
				
			}
			
		}
		
		List<RequirementGroup> subGroups = group.getChildren();
		
		if(!subGroups.isEmpty()) {
			
			for(RequirementGroup rg: subGroups) {
				
				builder.append(requirementGroupToPUML(rg));
				
			}
			
			for(RequirementGroup rg: subGroups) {
				
				builder.append("obj").append(groupName.hashCode()).append(" .. ").append("obj").append(("(RG) " + rg.getName()).hashCode()).append('\n');
				
			}
			
		}
		
		return builder.toString();
	}
	
	private static String requirementToPUML(Requirement requirement) {
		
		StringBuilder builder = new StringBuilder();
		
		Version version = requirement.getVersion();
		
		String requirementTitle = "(R) " + requirement.getName();

		if(version == null) {
			
			version = RequirementsFactory.eINSTANCE.createVersion();
			
			version.setMajor(0);
			
			version.setMinor(0);
			
			version.setService(0);
		}
		
		String versionString = quoteString("Version " + version.getMajor() + "." + version.getMinor() + "." + version.getService());

		builder.append(plantUMLObject(requirementTitle)).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "created", requirement.getCreated())).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "id", breakStringInLines(requirement.getId(), 40))).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "description", breakStringInLines(requirement.getDescription(), 40))).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "author", breakStringInLines(requirement.getAuthor(), 40))).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "priority", requirement.getPriority())).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "state", requirement.getState())).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "type", requirement.getType())).append('\n');
		
		builder.append(plantUMLField("obj"+Long.valueOf(requirementTitle.hashCode()), "version", versionString)).append('\n');
		
		List<Requirement> subRequirements = requirement.getChildren();
		
		if(!subRequirements.isEmpty()) {
			
			for(Requirement r: subRequirements) {
				
				builder.append(requirementToPUML(r));
				
			}
			
			for(Requirement r: subRequirements) {
				
				builder.append(quoteString(requirementTitle)).append(" .. ").append(quoteString("(R) " + r.getName())).append('\n');
				
			}
			
		}
		
		List<Requirement> dependencies = requirement.getDependencies();
		
		if(!dependencies.isEmpty()) {
			
			for(Requirement r: dependencies) {
				
				builder.append(requirementToPUML(r));
				
			}
			
			for(Requirement r: dependencies) {
				
				builder.append("obj").append(requirementTitle.hashCode()).append(" .. ").append("obj").append(("(R) " + r.getName()).hashCode()).append('\n');
				
			}
			
		}
		
		List<Comment> comments = requirement.getComments();
		
		if(!comments.isEmpty()) {
			
			for(Comment c: comments) {
				
				builder.append(commentToPUML(c));
				
			}
			
			for(Comment c: comments) {
				
				builder.append("obj").append(requirementTitle.hashCode()).append(" .. ").append("obj").append(Long.valueOf(c.hashCode())).append('\n');
				
			}
			
		}
		
		return builder.toString();
		
	}
	
	private static String commentToPUML(Comment comment) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("note ").append(quoteString(comment.getBody())).append(" as ").append("obj").append(Long.valueOf(comment.hashCode())).append('\n');
		
		List<Comment> comments = comment.getChildren();
		
		if(!comments.isEmpty()) {
			
			for(Comment c: comments) {
				
				builder.append(commentToPUML(c));
				
			}
			
			for(Comment c: comments) {
				
				builder.append(quoteString(comment.getSubject())).append(" -> ").append(quoteString(c.getSubject())).append('\n');
				
			}
			
		}
		
		return builder.toString();
		
	}
	
	// Quotes a string (e.g. quoteString("abc") -> "abc"
	private static String quoteString(String stringToQuote) {
		return new StringBuilder().append('"').append(stringToQuote).append('"').toString();
	}
	
	private static String breakStringInLines(String string, int maxCharacters) {
		
		StringBuilder builder = new StringBuilder();
		
		if(string.length() > maxCharacters) {
			String firstPartOfBreakedString = string.substring(0, maxCharacters - 1);
			
			String secondPartOfBreakedString = string.substring(maxCharacters-1);
			
			builder
			.append(firstPartOfBreakedString)
			.append("\\n")
			.append(breakStringInLines(secondPartOfBreakedString, maxCharacters));
		}else {
			builder.append(string);
		}
		
		return builder.toString();
		
	}
	
	private static String plantUMLObject(String objectName) {
		return new StringBuilder().append("object ").append(quoteString(objectName)).append(" as ").append("obj").append(Long.valueOf(objectName.hashCode())).toString();
	}
	
	// Creates a string that is the equivalent of assigning a field value to an PlantUML object
	// (e.g. requirements : title = "Gorgeous Food Application")
	private static String plantUMLField(String objectName, String field, String value) {
		StringBuilder builder = new StringBuilder().append(objectName).append(" : ").append(field).append(" = ");
		
		builder.append(quoteString(value));
		
		return builder.toString();
	}
	
	private static String plantUMLField(String objectName, String field, int value) {
		StringBuilder builder = new StringBuilder().append(objectName).append(" : ").append(field).append(" = ");
		
		builder.append(value);
		
		return builder.toString();
	}
	
	private static String plantUMLField(String objectName, String field, Object value) {
		StringBuilder builder = new StringBuilder().append(objectName).append(" : ").append(field).append(" = ");
		
		builder.append(value);
		
		return builder.toString();
	}
	
}
