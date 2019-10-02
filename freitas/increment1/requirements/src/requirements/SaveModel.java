package requirements;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import requirements.RequirementsFactory;
import requirements.Model;

public class SaveModel {

	// Example of how to use the EMF library
	public static void main(String[] args) {
      saveModel();
	}
	
	public static void initOCL() {
		//-----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		
		OCLDelegateDomain.initialize(null);
		
		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		//-------------		
	}
	
	public static void saveModel() {

		// Initialize OCL support
		initOCL();
		
		// Associate the "requirements" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("requirements", new XMIResourceFactoryImpl());
		
		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
        RequirementsFactory factory = RequirementsFactory.eINSTANCE;
        
        Model myModel = generateModel(factory);
        
		// Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        // create a resource
        Resource resource = resSet.createResource(URI.createURI("instances/saved.requirements"));

        resource.getContents().add(myModel);
        
        // Add a call to validation...
        // See: https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
        // See: generated code for requirementsValidator.java
        // See: https://mattsch.com/2012/05/31/how-to-use-ocl-when-running-emf-standalone/
        // See: https://wiki.eclipse.org/OCL/OCLinEcore
        System.out.println("Diagnostic:");
        Diagnostic diag=Diagnostician.INSTANCE.validate(myModel);
        if (diag.getSeverity()!=Diagnostic.OK) {
        	System.out.println(diag.getMessage());
        	List<Diagnostic> l=diag.getChildren();
        	for (Diagnostic d: l) {
        		System.out.println(d.getMessage());
        	}
        }
        else {
        	System.out.println(" Everything seems fine :-)");
        }
        
        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	private static Model generateModel(RequirementsFactory factory) {
    	// Create a model
        Model myModel = factory.createModel();
        
        myModel.setTitle("Gorgeous Food Application Requirements");
        
        // Create requirement groups
        
        RequirementGroup functionalRequirementsGroup = factory.createRequirementGroup();
        functionalRequirementsGroup.setName("Functional Requirements");
        functionalRequirementsGroup.setDescription("This group details Gorgeous Food Application functional requirements");
        
        RequirementGroup qualityAttributesGroup = factory.createRequirementGroup();
        qualityAttributesGroup.setName("Quality Attributes");
        qualityAttributesGroup.setDescription("This group details Gorgeous Food Application quality attributes");
        
        // TODO: Implement remaining generate logic
        
        return myModel;
    }
	
}
