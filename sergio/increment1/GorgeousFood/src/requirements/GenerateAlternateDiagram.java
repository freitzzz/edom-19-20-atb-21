package requirements;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import gorgeousFood_Increment1.Comment;
import gorgeousFood_Increment1.Model;
import gorgeousFood_Increment1.Requirement;
import gorgeousFood_Increment1.RequirementGroup;

public class GenerateAlternateDiagram {

	public static void main(String[] args) {
		generateDiagram();
	}
	
	public static Model getRequirementsModelInstance() throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		gorgeousFood_Increment1.GorgeousFood_Increment1Package.eINSTANCE.eClass();
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the requirements file name:");
		
		String fileName = scanner.nextLine();
		scanner.close();
		
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		resource.load(Collections.EMPTY_MAP);
		
		EObject root = resource.getContents().get(0);
		Model model = (Model)root;
		
		return model;
	}
	
	private static void startFile(PrintWriter writer) {
		writer.println("@startuml");
		writer.println("allow_mixing");
		writer.println("skinparam rectangle {\nroundCorner 25\n}");
	}
	
	private static void endFile(PrintWriter writer) {
		writer.println("@enduml");
	}
	
	private static String buildCommentString(Comment comment) {
		return buildCommentString(comment, 0);
	}
	
	private static String buildCommentString(Comment comment, int index) {
		String initialTab = "";
		if (index > 0) {
			for (int i=0; i < index; i++) {
				initialTab = initialTab + "\\t";
			}
		}
		
		String commentString = initialTab + comment.getSubject() + " by " + comment.getAuthor() + " on " + comment.getCreated() 
			+ ": " + comment.getBody() + "\\n";
		
		String stringToReturn = "";
		List<Comment> commentChildren = comment.getChildren();
		for (Comment c: commentChildren) {
			stringToReturn = stringToReturn + buildCommentString(c, index + 1);
		}
		return commentString + stringToReturn;
	}
	
	private static void generateRequirementObject(List<Requirement> requirements, PrintWriter writer) {
		for (Requirement requirement: requirements) {
			String reqPlantUmlId = "req_" + requirement.getId();
			writer.println("class \"Requirement " + requirement.getTitle() + "\" as " + reqPlantUmlId + "{");
			writer.println("Author: " + requirement.getAuthor());
			writer.println("Creation date: " + requirement.getCreated());
			writer.println("Description: " + requirement.getDescription());
			writer.println("Priority: " + requirement.getPriority());
			writer.println("Resolution: " + requirement.getResolution());
			writer.println("Type: " + requirement.getType());
			gorgeousFood_Increment1.Version version = requirement.getVersion();
			if (version != null) {
				writer.println("Version: " + version.getMajor() + "." + version.getMinor() + "." + version.getService());
			}
			writer.println("}");
			
			if (requirement.getComment().size() > 0) {
				for (Comment c: requirement.getComment()) {
					writer.println("note top of " + reqPlantUmlId + ": " + buildCommentString(c));
				}
			}
			
			if (requirement.getChildren().size() > 0) {
				generateRequirementObject(requirement.getChildren(), writer);
			}
			
			for (Requirement reqChildren: requirement.getChildren()) {
				writer.println(reqPlantUmlId + " *-- " + "req_" + reqChildren.getId());
			}
			
			for (Requirement reqDependency: requirement.getDependencies()) {
				writer.println(reqPlantUmlId + " ..> " + "req_" + reqDependency.getId());
			}
		}
	}
	
	private static void generateRequirementsGroupObject(List<RequirementGroup> requirementsGroup, PrintWriter writer) {
		for (RequirementGroup reqGroup: requirementsGroup) {
			generateRequirementGroupObject(reqGroup, writer);
		}
		
		for (int i=0; i < requirementsGroup.size(); i++) {
			writer.println("model->" + "rectangle" + requirementsGroup.get(i).getId());
		}
	}
	
	private static void generateRequirementGroupObject(RequirementGroup reqGroup, PrintWriter writer) {
		writer.println("class \"" + reqGroup.getName() + ": " + reqGroup.getDescription() + "\" as rectangle"+reqGroup.getId()+"{");
		generateRequirementObject(reqGroup.getRequirements(), writer);
		for (RequirementGroup child: reqGroup.getChildren()) {
			generateRequirementGroupObject(child, writer);
		}
		writer.println("}");
	}
	
	private static void generateModelObject(Model model, PrintWriter writer) {
		writer.println("artifact \"" + model.getTitle() + "\" as model");
		generateRequirementsGroupObject(model.getGroups(), writer);
	}
	
	private static void generateDiagram() {
	
		PrintWriter writer = null;
		try {
			Model modelInstance = getRequirementsModelInstance();
			FileWriter w = new FileWriter("plant.uml");

			writer = new PrintWriter(w);
			
			startFile(writer);
			generateModelObject(modelInstance, writer);
			endFile(writer);
			System.out.println("File saved successfully");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
}
