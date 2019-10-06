package requirements;

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

import gorgeousFood_Increment1.Model;
import gorgeousFood_Increment1.Requirement;
import gorgeousFood_Increment1.RequirementGroup;

public class GenerateRequirementsDiagram {

	public static void main(String[] args) {
		generateDiagram();
	}
	
	public static Model getRequirementsModelInstance() throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		gorgeousFood_Increment1.GorgeousFood_Increment1Package.eINSTANCE.eClass();
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resource = resSet.getResource(URI.createURI("/home/filipe/Desktop/faculdade/edom/edom-19-20-atb-21/sergio/increment1/GorgeousFood/src/requirements/requirements.xmi"), true);
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
	
	private static void generateRequirementObject(List<Requirement> requirements, PrintWriter writer, int reqGroupIndex) {
		int index = 0;
		for (Requirement requirement: requirements) {
			writer.println("class \"Requirement " + requirement.getId() + "\" as req_" + reqGroupIndex + index + "{");
			writer.println("Author: " + requirement.getAuthor());
			writer.println("Creation date: " + requirement.getCreated());
			writer.println("Title: " + requirement.getTitle());
			writer.println("Description: " + requirement.getDescription());
			writer.println("Priority: " + requirement.getPriority());
			writer.println("Resolution: " + requirement.getResolution());
			writer.println("Type: " + requirement.getType());
			writer.println("}");
			index++;
		}
	}
	
	private static void generateRequirementsGroupObject(List<RequirementGroup> requirementsGroup, PrintWriter writer) {
		int index = 0;
		for (RequirementGroup reqGroup: requirementsGroup) {
			writer.println("rectangle \"" + reqGroup.getName() + ": " + reqGroup.getDescription() + "\" as rectangle"+index+"{");
			generateRequirementObject(reqGroup.getRequirements(), writer, index);
			writer.println("}");
			index++;
		}
		
		for (int i=0; i < requirementsGroup.size(); i++) {
			writer.println("model->" + "rectangle" + i);
		}
		
	}
	
	private static void generateModelObject(Model model, PrintWriter writer) {
		writer.println("artifact \"" + model.getTitle() + "\" as model");
		generateRequirementsGroupObject(model.getGroups(), writer);
	}
	
	private static void generateDiagram() {
	
		PrintWriter writer = null;
		try {
			Model modelInstance = getRequirementsModelInstance();
			FileWriter w = new FileWriter("/home/filipe/Desktop/faculdade/edom/edom-19-20-atb-21/sergio/increment1/GorgeousFood/src/requirements/plant.puml");

			writer = new PrintWriter(w);
			
			startFile(writer);
			generateModelObject(modelInstance, writer);
			
			endFile(writer);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
}
