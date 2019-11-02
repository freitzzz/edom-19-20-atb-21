package mindmap;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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

import mindmap.MindmapFactory;
import mindmap.Map;

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
		
		// Associate the "mindmap" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mindmap", new XMIResourceFactoryImpl());
		
		// Initialize the model
		MindmapPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
        MindmapFactory factory = MindmapFactory.eINSTANCE;
        
        // Create a map
        Map myMap = factory.createMap();
        
        // Create a Topic
        Topic myTopicAgenda = factory.createTopic();
        myTopicAgenda.setName("Agenda");
        
        // Create a Topic
        Topic myTopicContacts = factory.createTopic();
        myTopicContacts.setName("Contacts");

        // Create a Topic
        Topic myTopicMeeting = factory.createTopic();
        myTopicMeeting.setName("Meeting");

        // link Agenda and Contacts
        myTopicAgenda.getSubtopics().add(myTopicContacts);
        
        // link Agenda and Meeting
        myTopicAgenda.getSubtopics().add(myTopicMeeting);
        
        // Add all topics to the Map
        myMap.getElements().add(myTopicAgenda);
        myMap.getElements().add(myTopicContacts);
        myMap.getElements().add(myTopicMeeting);
        
		// Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        // create a resource
        Resource resource = resSet.createResource(URI.createURI("instances/exemplo1.mindmap"));

        resource.getContents().add(myMap);
        
        System.out.println("Root topics:");
        EList<Topic> topics=myMap.getRootTopics();
        for (Topic t: topics) {
        	System.out.println(t.getName());
        }
        
        // Add a call to validation...
        // See: https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
        // See: generated code for MindmapValidator.java
        // See: https://mattsch.com/2012/05/31/how-to-use-ocl-when-running-emf-standalone/
        // See: https://wiki.eclipse.org/OCL/OCLinEcore
        System.out.println("Diagnostic:");
        Diagnostic diag=Diagnostician.INSTANCE.validate(myMap);
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
}
