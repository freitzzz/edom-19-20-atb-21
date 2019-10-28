package requirements.javacode.workflow;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import requirements.Model;

public class ModelValidator extends WorkflowComponentWithSlot {

	@Override
	public void invoke(IWorkflowContext ctx) {
		
		Resource modelResource = (Resource)ctx.get(getSlot());
		
		Model modelToValidate = (Model)modelResource.getContents().get(0);
		
		Diagnostic diag = Diagnostician.INSTANCE.validate(modelToValidate);
		if (diag.getSeverity() != Diagnostic.OK) {
			System.out.println(diag.getMessage());
			List<Diagnostic> l = diag.getChildren();
			for (Diagnostic d : l) {
				System.out.println(d.getMessage());
			}

			throw new IllegalStateException(diag.getException());

		} else {
			System.out.println("Model validated successfuly");
		}

	}

}
