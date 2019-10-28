package requirements.javacode.workflow;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import requirements.Model;
import requirements.RequirementsFactory;
import requirements.RequirementsPackage;
import requirements.dsl.RDSLStandaloneSetup;

public class ResourceReader extends WorkflowComponentWithSlot {
	private String uri;

	public void invoke(IWorkflowContext ctx) {
		// do this only once per application
		Injector injector = new RDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

		// obtain a resourceset from the injector
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);

		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		RequirementsFactory factory = RequirementsFactory.eINSTANCE;

		// ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(uri);
		Resource resource = resSet.getResource(fileURI, true);
		ctx.put(getSlot(), resource);
		
		Model model = (Model)resource.getContents().get(0);
		
		System.out.println("-> " + model.getTitle());
		
		System.out.println("DSL was read successfully");
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}
}
