package requirements.javacode.workflow;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import requirements.Model;
import requirements.dsl.RDSLStandaloneSetup;

public class DSLFormatterAndSaver extends WorkflowComponentWithSlot {

	private String uri;

	@Override
	public void invoke(IWorkflowContext ctx) {
		
		Injector injector = new RDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);
		
		Resource resource = resourceSet.createResource(URI.createFileURI(uri));
		
		resource.getContents().clear();
		
		Resource modelResource = (Resource)ctx.get(getSlot());
		
		Model model = (Model)modelResource.getContents().get(0);
		
		resource.getContents().add(model);
		
		try {
			resource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new IllegalStateException(e);
		}
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}
}
