package requirements.javacode;

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

import requirements.Comment;
import requirements.Model;
import requirements.Requirement;
import requirements.RequirementGroup;
import requirements.RequirementsPackage;
import requirements.Version;

//This class will generate a PlantUML file with the representation of a requirements instance using circles
//The requirements instance file path should be defined as the first argument
//The generated PlantUML file path should be defined as the second argument
//The generator takes in account spaces found in identifiers and wraps them with quotes
public class GenerateRequirementsPUMLUsingCircles {

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
			
			//-----
			// Generate a plantuml file that represents the mind map diagram
			FileWriter w = new FileWriter(generatedPUMLAsFile);
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        
	        writer.println("digraph GFA {");
	        
	        writer.println(modelToPUML(loadedModel));
	        
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
	
	private static String modelToPUML(Model model) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(quoteString(model.getTitle())).append('\n');
		
		List<RequirementGroup> groups = model.getGroups();
		
		if(!groups.isEmpty()) {
			
			for(RequirementGroup g: groups) {
			
				builder.append(requirementGroupToPUML(g));
			
			}
			
			for(RequirementGroup g: groups) {
			
				builder.append(quoteString(model.getTitle())).append(" -> ").append(quoteString(g.getName())).append('\n');
			
			}
			
		}
		
		return builder.toString();
	}
	
	private static String requirementGroupToPUML(RequirementGroup group) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(quoteString(group.getName())).append('\n');
		
		List<Requirement> requirements = group.getRequirements();
		
		if(!requirements.isEmpty()) {
			
			for(Requirement r: requirements) {
				
				builder.append(requirementToPUML(r));
				
			}
			
			for(Requirement r: requirements) {
				
				builder.append(quoteString(group.getName())).append(" -> ").append(quoteString(r.getName())).append('\n');
				
			}
			
		}
		
		List<RequirementGroup> subGroups = group.getChildren();
		
		if(!subGroups.isEmpty()) {
			
			for(RequirementGroup rg: subGroups) {
				
				builder.append(requirementGroupToPUML(rg));
				
			}
			
			for(RequirementGroup rg: subGroups) {
				
				builder.append(quoteString(group.getName())).append(" -> ").append(quoteString(rg.getName())).append('\n');
				
			}
			
		}
		
		return builder.toString();
	}
	
	private static String requirementToPUML(Requirement requirement) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(quoteString(requirement.getName())).append('\n');
		
		Version version = requirement.getVersion();
		
		if(version != null) {
			
			String versionString = quoteString("Version " + version.getMajor() + "." + version.getMinor() + "." + version.getService());
			
			builder.append(versionString).append('\n');
			
			builder.append(quoteString(requirement.getName())).append(" -> ").append(versionString).append('\n');
			
		}else {
			
			String versionString = quoteString("Version 0.0.0");
			
			builder.append(versionString).append('\n');
			
			builder.append(quoteString(requirement.getName())).append(" -> ").append(versionString).append('\n');
			
		}
		
		List<Requirement> subRequirements = requirement.getChildren();
		
		if(!subRequirements.isEmpty()) {
			
			for(Requirement r: subRequirements) {
				
				builder.append(requirementToPUML(r));
				
			}
			
			for(Requirement r: subRequirements) {
				
				builder.append(quoteString(requirement.getName())).append(" -> ").append(quoteString(r.getName())).append('\n');
				
			}
			
		}
		
		List<Requirement> dependencies = requirement.getDependencies();
		
		if(!dependencies.isEmpty()) {
			
			for(Requirement r: dependencies) {
				
				builder.append(requirementToPUML(r));
				
			}
			
			for(Requirement r: dependencies) {
				
				builder.append(quoteString(requirement.getName())).append(" -> ").append(quoteString(r.getName())).append('\n');
				
			}
			
		}
		
		List<Comment> comments = requirement.getComments();
		
		if(!comments.isEmpty()) {
			
			for(Comment c: comments) {
				
				builder.append(commentToPUML(c));
				
			}
			
			for(Comment c: comments) {
				
				builder.append(quoteString(requirement.getName())).append(" -> ").append(quoteString(c.getSubject())).append('\n');
				
			}
			
		}
		
		return builder.toString();
		
	}
	
	private static String commentToPUML(Comment comment) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(quoteString(comment.getSubject())).append('\n');
		
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
		
		if(stringToQuote.startsWith("\"") && stringToQuote.endsWith("\"")) {
			return stringToQuote;
		}
		
		if(stringToQuote.startsWith("'") && stringToQuote.endsWith("'")) {
			return stringToQuote;
		}
		
		return new StringBuilder().append('"').append(stringToQuote).append('"').toString();
	}
	
}
