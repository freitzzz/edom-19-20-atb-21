package requirements.javacode.workflow;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import requirements.Model;

public class ModelValidator extends WorkflowComponentWithSlot {
	
	public static void initOCL() {
		// -----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI, new OCLValidationDelegateFactory.Global());

		OCLDelegateDomain.initialize(null);

		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		// -------------
	}
	
	@Override
	public void invoke(IWorkflowContext ctx) {
		
		initOCL();
		
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
