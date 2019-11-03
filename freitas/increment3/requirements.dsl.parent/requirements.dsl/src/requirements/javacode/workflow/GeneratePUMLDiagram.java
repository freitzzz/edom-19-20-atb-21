package requirements.javacode.workflow;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import requirements.javacode.GenerateRequirementsPUMLUsingCircles;
import requirements.javacode.GenerateRequirementsPUMLUsingObjectDiagram;

public class GeneratePUMLDiagram extends WorkflowComponentWithSlot {

	private String pumlDiagramType;

	private String generatedPUMLDiagramFilePath;

	@Override
	public void invoke(IWorkflowContext ctx) {
		
		String dslFilePath = getSlot();
		
		String[] arguments = new String[] {dslFilePath, generatedPUMLDiagramFilePath};
		
		switch(pumlDiagramType.toLowerCase()) {
		case "circles":
			GenerateRequirementsPUMLUsingCircles.main(arguments);
			System.out.println("Generated PUML Circles Diagram successfully");
			break;
		case "object":
			GenerateRequirementsPUMLUsingObjectDiagram.main(arguments);
			System.out.println("Generated PUML Object Diagram successfully");
			break;
		default:
			throw new IllegalStateException("'" + pumlDiagramType + "' is not a valid puml diagram type (can either be circles or object)");
		}
		
		
		
	}

	public String getPumlDiagramType() {
		return pumlDiagramType;
	}

	public void setPumlDiagramType(String pumlDiagramType) {
		this.pumlDiagramType = pumlDiagramType;
	}

	public String getGeneratedPUMLDiagramFilePath() {
		return generatedPUMLDiagramFilePath;
	}

	public void setGeneratedPUMLDiagramFilePath(String generatedPUMLDiagramFilePath) {
		this.generatedPUMLDiagramFilePath = generatedPUMLDiagramFilePath;
	}

}
