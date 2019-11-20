package transformations.javacode;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import pt.isep.edom.usecases.UsecasesPackage;
import requirements.RequirementsPackage;

public class RequirementsXMIModelToUseCasesXMIModel {
	
	public static void main(String[] args) {
		
		String requirementsToTranformFilePathAsString = args[0];
		
		String usecasesTransformedFilePathAsString = args[1];
		
		File requirementsToTransformFilePathAsFile = new File(requirementsToTranformFilePathAsString);
		
		File usecasesTransformedFilePathAsFile = new File(usecasesTransformedFilePathAsString);
		
		System.out.println(requirementsToTransformFilePathAsFile.getAbsolutePath());
		
		System.out.println(usecasesTransformedFilePathAsFile.getAbsolutePath());
		
		transform(requirementsToTransformFilePathAsFile, usecasesTransformedFilePathAsFile);
		
	}
	
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

	public static void registerEcorePackages() {

		// Associate the "requirements" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();

		// Associate the "use cases" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("usecases", new XMIResourceFactoryImpl());

		// Initialize the model
		UsecasesPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		// MindmapFactory factory = MindmapFactory.eINSTANCE;

		// Initialize the EMFTVM package
		org.eclipse.m2m.atl.emftvm.EmftvmPackage.eINSTANCE.eClass();

		// Associate the "emftvm" extension with the EMFTVM resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
	}

	private static void transform(File requirementsModelToTransformFilePath, File usecasesModelTransformedFilePath) {

		initOCL();

		registerEcorePackages();

		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		// Load metamodels
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(rs.getResource(URI.createURI("http://www.example.org/requirements"), true));
		env.registerMetaModel("RQ", metaModel);

		Metamodel metaModel2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel2.setResource(rs.getResource(URI.createURI("http://www.example.org/usecases"), true));
		env.registerMetaModel("UC", metaModel2);

		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		
		inModel.setResource(rs.getResource(URI.createURI(requirementsModelToTransformFilePath.getPath(), true), true));
		env.registerInputModel("Requirements", inModel);

		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		
		outModel.setResource(rs.createResource(URI.createFileURI(usecasesModelTransformedFilePath.getPath())));
		env.registerOutputModel("UseCases", outModel);

		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver("transformations/", new ResourceSetImpl());

		TimingData td = new TimingData();
		env.loadModule(mr, "requirementstousecases");
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		try {
			inModel.getResource().save(Collections.emptyMap());
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
