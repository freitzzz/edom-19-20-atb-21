package transformations.javacode;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import pt.isep.edom.usecases.UsecasesPackage;
import pt.isep.edom.usecases.dsl.UseCasesDslStandaloneSetup;
import requirements.Requirement;
import requirements.RequirementsFactory;
import requirements.RequirementsPackage;
import requirements.dsl.RDSLStandaloneSetup;

@SuppressWarnings("restriction")
public class RequirementsDSLToUseCasesDSL {

	public static void main(String[] args) {
		
		args = new String[] {
				
				"instances/gfa.rdsl",
				"instances/gfa.usecasesdsl"
				
		};
		
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

		Injector injector = new RDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);		
		
		resSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);
		
		Injector injector2 = new UseCasesDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet resSet2 = injector2.getInstance(XtextResourceSet.class);

		// Initialize requirements model
		RequirementsPackage.eINSTANCE.eClass();

		// Initialize use cases model
		UsecasesPackage.eINSTANCE.eClass();

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
		
//		System.out.println("!");
//		
//		List<EObject> asd = inModel.allInstancesOf(RequirementsFactory.eINSTANCE.createRequirement().eClass());
//		
//		for(int i = 0; i < asd.size(); i++) {
//			System.out.println(asd.get(i).toString());
//		
//			int asdd = (((Requirement)asd.get(i)).getDependencies().size());
//			
//			if(asdd == 1) {
//				System.out.println("!!!");
//				
//				System.out.println((((Requirement)asd.get(i)).getDependencies().get(0).toString()));
//			}
//			
//			
//		}
//			
//		Iterator<EObject> objects = inModel.eContents().iterator();
//		
//		while(objects.hasNext()) {
//			EObject next = objects.next();
//			
//			System.out.println(next.toString());
//		}
//		
//		System.out.println("?");

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
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
