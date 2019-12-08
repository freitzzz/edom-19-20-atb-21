package pt.isep.edom.project.c3.atl.domain;

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
import org.eclipse.m2m.atl.emftvm.EmftvmPackage;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.ClassModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

import com.google.inject.Injector;

import pt.isep.edom.project.c0.dsl.usecase.UseCaseStandaloneSetup;
import pt.isep.edom.project.c0.mm.usecase.UsecasePackage;
import pt.isep.edom.project.c3.dsl.domain.DomainStandaloneSetup;
import pt.isep.edom.project.c3.mm.domain.DomainPackage;

public class UseCase2Domain {
	
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
		
		EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		//-------------		
	}
	
	public static void registerEcorePackages() {
		// do this only once per application
		Injector injector = new UseCaseStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector injector2 = new DomainStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Associate the "mindmap" extension with the XMI resource format
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("requirements", new XMIResourceFactoryImpl());
		
		// Initialize the model
		UsecasePackage.eINSTANCE.eClass();

		// Initialize the model
		DomainPackage.eINSTANCE.eClass();
		
		// Retrieve the default factory singleton
        // MindmapFactory factory = MindmapFactory.eINSTANCE;		

        // Initialize the EMFTVM package  
		EmftvmPackage.eINSTANCE.eClass();
		
		// Associate the "emftvm" extension with the EMFTVM resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
	}
	
	public static void main(String[] args) {
		// Resolve arguments
		String argTransformation="transformations::usecase2domain";
		String argModelIn="dsl/gorgeousfood.usecase";
		String argModelOut="dsl/gorgeousfood.domain";
		
		// First arg is URI prefix of the transformation
		if (args.length>=1) {
			argTransformation=args[0];
		}
		// Second arg is dsl file in
		if (args.length>=2) {
			argModelIn=args[1];
		}
		// third arg is dsl file out
		if (args.length>=3) {
			argModelOut=args[2];
		}
		
		// Initialize OCL support
		initOCL();
		
		registerEcorePackages();		
		
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();
 
		// Load metamodels
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(rs.getResource(URI.createURI("http://www.example.org/usecase"), true));
		env.registerMetaModel("MMUseCase", metaModel);
		
		Metamodel metaModel2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel2.setResource(rs.getResource(URI.createURI("http://www.example.org/domain"), true));
		env.registerMetaModel("MMDomain", metaModel2);
		
		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI(argModelIn, true), true));
		env.registerInputModel("IN", inModel);
		
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(argModelOut)));
		env.registerOutputModel("OUT", outModel);

		// Load and run module
		ModuleResolver mr = null;
		// mr = new DefaultModuleResolver(argUriPrefix, new ResourceSetImpl());
		mr = new ClassModuleResolver(UseCase2Domain.class);
		
		TimingData td = new TimingData();
		env.loadModule(mr, argTransformation);
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