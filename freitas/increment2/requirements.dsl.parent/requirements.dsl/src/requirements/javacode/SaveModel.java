package requirements.javacode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import requirements.Model;
import requirements.Requirement;
import requirements.RequirementGroup;
import requirements.RequirementsFactory;
import requirements.RequirementsPackage;
import requirements.Version;
import requirements.dsl.RDSLStandaloneSetup;

public class SaveModel {

	// Example of how to use the EMF library
	public static void main(String[] args) {

		String requirementsInstancePath = args[0];
		File requirementsInstanceAsFile = new File(requirementsInstancePath);

		saveModel(requirementsInstanceAsFile);
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

	public static void saveModel(File instanceToSave) {

		// Initialize OCL support
		initOCL();
		
		Injector injector = new RDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);

		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		RequirementsFactory factory = RequirementsFactory.eINSTANCE;

		Model myModel = generateModel(factory);

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(instanceToSave.getAbsolutePath()));

		resource.getContents().add(myModel);

		// Add a call to validation...
		// See:
		// https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
		// See: generated code for requirementsValidator.java
		// See:
		// https://mattsch.com/2012/05/31/how-to-use-ocl-when-running-emf-standalone/
		// See: https://wiki.eclipse.org/OCL/OCLinEcore
		System.out.println("Diagnsostic:");
		Diagnostic diag = Diagnostician.INSTANCE.validate(myModel);
		if (diag.getSeverity() != Diagnostic.OK) {
			System.out.println(diag.getMessage());
			List<Diagnostic> l = diag.getChildren();
			for (Diagnostic d : l) {
				System.out.println(d.getMessage());
			}
		} else {
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
		functionalRequirementsGroup
				.setDescription("This group details Gorgeous Food Application functional requirements");

		RequirementGroup qualityAttributesGroup = factory.createRequirementGroup();
		qualityAttributesGroup.setName("Quality Attributes");
		qualityAttributesGroup.setDescription("This group details Gorgeous Food Application quality attributes");

		RequirementGroup manageMealsRequirementsGroup = factory.createRequirementGroup();
		manageMealsRequirementsGroup.setName("Manage Meals");
		manageMealsRequirementsGroup.setDescription("Details functionalities regarding meals management.");

		RequirementGroup manageUnservedMealsRequirementsGroup = factory.createRequirementGroup();
		manageUnservedMealsRequirementsGroup.setName("Manage Unserved Meals");
		manageUnservedMealsRequirementsGroup
				.setDescription("Details functionalities regarding unserved meals management.");

		manageMealsRequirementsGroup.setParent(functionalRequirementsGroup);

		manageUnservedMealsRequirementsGroup.setParent(functionalRequirementsGroup);

		List<RequirementGroup> modelRequirementGroups = new ArrayList<RequirementGroup>();

		modelRequirementGroups.add(functionalRequirementsGroup);

		modelRequirementGroups.add(qualityAttributesGroup);

		myModel.getGroups().addAll(modelRequirementGroups);

		// Create Requirements

		Version saveMealRequirementVersion = factory.createVersion();
		saveMealRequirementVersion.setMajor(0);
		saveMealRequirementVersion.setMinor(0);
		saveMealRequirementVersion.setService(1);

		Version showMealDesignationRequirementVersion = factory.createVersion();
		showMealDesignationRequirementVersion.setMajor(0);
		showMealDesignationRequirementVersion.setMinor(0);
		showMealDesignationRequirementVersion.setService(1);

		Version showMealNutritionalDataRequirementVersion = factory.createVersion();
		showMealNutritionalDataRequirementVersion.setMajor(0);
		showMealNutritionalDataRequirementVersion.setMinor(0);
		showMealNutritionalDataRequirementVersion.setService(1);

		Version showMealTypeRequirementVersion = factory.createVersion();
		showMealTypeRequirementVersion.setMajor(0);
		showMealTypeRequirementVersion.setMinor(0);
		showMealTypeRequirementVersion.setService(1);

		Version showMealLocationRequirementVersion = factory.createVersion();
		showMealLocationRequirementVersion.setMajor(0);
		showMealLocationRequirementVersion.setMinor(0);
		showMealLocationRequirementVersion.setService(1);

		Version showMealPriceRequirementVersion = factory.createVersion();
		showMealPriceRequirementVersion.setMajor(0);
		showMealPriceRequirementVersion.setMinor(0);
		showMealPriceRequirementVersion.setService(1);

		Version listMealIngredientsRequirementVersion = factory.createVersion();
		listMealIngredientsRequirementVersion.setMajor(0);
		listMealIngredientsRequirementVersion.setMinor(0);
		listMealIngredientsRequirementVersion.setService(1);

		Version listMealAllergensRequirementVersion = factory.createVersion();
		listMealAllergensRequirementVersion.setMajor(0);
		listMealAllergensRequirementVersion.setMinor(0);
		listMealAllergensRequirementVersion.setService(1);

		Version checkMealAvailabilityRequirementVersion = factory.createVersion();
		checkMealAvailabilityRequirementVersion.setMajor(0);
		checkMealAvailabilityRequirementVersion.setMinor(0);
		checkMealAvailabilityRequirementVersion.setService(1);

		Version payMealRequirementVersion = factory.createVersion();
		payMealRequirementVersion.setMajor(0);
		payMealRequirementVersion.setMinor(0);
		payMealRequirementVersion.setService(1);

		Version saveUnservedMealRequirementVersion = factory.createVersion();
		saveUnservedMealRequirementVersion.setMajor(0);
		saveUnservedMealRequirementVersion.setMinor(0);
		saveUnservedMealRequirementVersion.setService(1);

		Version showUnservedMealIdentificationNumberRequirementVersion = factory.createVersion();
		showUnservedMealIdentificationNumberRequirementVersion.setMajor(0);
		showUnservedMealIdentificationNumberRequirementVersion.setMinor(0);
		showUnservedMealIdentificationNumberRequirementVersion.setService(1);

		Version showUnservedMealDesignationRequirementVersion = factory.createVersion();
		showUnservedMealDesignationRequirementVersion.setMajor(0);
		showUnservedMealDesignationRequirementVersion.setMinor(0);
		showUnservedMealDesignationRequirementVersion.setService(1);

		Version showUnservedMealProductionDateRequirementVersion = factory.createVersion();
		showUnservedMealProductionDateRequirementVersion.setMajor(0);
		showUnservedMealProductionDateRequirementVersion.setMinor(0);
		showUnservedMealProductionDateRequirementVersion.setService(1);

		Version showUnservedMealExpirationDateRequirementVersion = factory.createVersion();
		showUnservedMealExpirationDateRequirementVersion.setMajor(0);
		showUnservedMealExpirationDateRequirementVersion.setMinor(0);
		showUnservedMealExpirationDateRequirementVersion.setService(1);

		Version showUnservedMealStateRequirementVersion = factory.createVersion();
		showUnservedMealStateRequirementVersion.setMajor(0);
		showUnservedMealStateRequirementVersion.setMinor(0);
		showUnservedMealStateRequirementVersion.setService(1);

		Version requirementsVersion = factory.createVersion();

		requirementsVersion.setMajor(0);
		requirementsVersion.setMinor(0);
		requirementsVersion.setService(1);

		// Meals Management Requirements

		Requirement saveMealRequirement = factory.createRequirement();

		saveMealRequirement.setTitle("Save Meal");
		saveMealRequirement.setDescription(
				"The software should be able to save a meal that is served to students and non students. A meal is identified by its designation, has a type, nutritional data, list of ingredients, can also contain allergens, has a cost-price and is available at a specific location. Once a meal is saved it is only available for the next 24 hours in the specified location.");
		saveMealRequirement.setId("0");
		saveMealRequirement.setVersion(saveMealRequirementVersion);
		saveMealRequirement.setAuthor("EDOM");
		saveMealRequirement.setCreated(new Date(System.currentTimeMillis()));

		saveMealRequirement.setAuthor("EDOM");

		Requirement showMealDesignationRequirement = factory.createRequirement();

		showMealDesignationRequirement.setTitle("Show Meal Designation");
		showMealDesignationRequirement.setDescription("The software should be able to show a meal designation.");
		showMealDesignationRequirement.setId("0");
		showMealDesignationRequirement.setVersion(showMealDesignationRequirementVersion);
		showMealDesignationRequirement.setAuthor("EDOM");
		showMealDesignationRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showMealNutritionalDataRequirement = factory.createRequirement();

		showMealNutritionalDataRequirement.setTitle("Show Meal Nutritional Data");
		showMealNutritionalDataRequirement
				.setDescription("The software should be able to show a meal nutritional data.");
		showMealNutritionalDataRequirement.setId("0");
		showMealNutritionalDataRequirement.setVersion(showMealNutritionalDataRequirementVersion);
		showMealNutritionalDataRequirement.setAuthor("EDOM");
		showMealNutritionalDataRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showMealTypeRequirement = factory.createRequirement();

		showMealTypeRequirement.setTitle("Show Meal Type");
		showMealTypeRequirement.setDescription("The software should be able to show a meal type.");
		showMealTypeRequirement.setId("0");
		showMealTypeRequirement.setVersion(showMealTypeRequirementVersion);
		showMealTypeRequirement.setAuthor("EDOM");
		showMealTypeRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showMealLocationRequirement = factory.createRequirement();

		showMealLocationRequirement.setTitle("Show Meal Location");
		showMealLocationRequirement
				.setDescription("The software should be able to show the location in which a meal is available.");
		showMealLocationRequirement.setId("0");
		showMealLocationRequirement.setVersion(showMealLocationRequirementVersion);
		showMealLocationRequirement.setAuthor("EDOM");
		showMealLocationRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showMealPriceRequirement = factory.createRequirement();

		showMealPriceRequirement.setTitle("Show Meal Price");
		showMealPriceRequirement.setDescription("The software should be able to show the price of a meal.");
		showMealPriceRequirement.setId("0");
		showMealPriceRequirement.setVersion(showMealPriceRequirementVersion);
		showMealPriceRequirement.setAuthor("EDOM");
		showMealPriceRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement listMealIngredientsRequirement = factory.createRequirement();

		listMealIngredientsRequirement.setTitle("List Meal Ingreditens");
		listMealIngredientsRequirement.setDescription("The software should be able to list the ingredients of a meal.");
		listMealIngredientsRequirement.setId("0");
		listMealIngredientsRequirement.setVersion(listMealIngredientsRequirementVersion);
		listMealIngredientsRequirement.setAuthor("EDOM");
		listMealIngredientsRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement listMealAllergensRequirement = factory.createRequirement();

		listMealAllergensRequirement.setTitle("List Meal Allergens");
		listMealAllergensRequirement
				.setDescription("The software should be able to list the allergens of a meal if existent.");
		listMealAllergensRequirement.setId("0");
		listMealAllergensRequirement.setVersion(listMealAllergensRequirementVersion);
		listMealAllergensRequirement.setAuthor("EDOM");
		listMealAllergensRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement checkMealAvailabilityRequirement = factory.createRequirement();

		checkMealAvailabilityRequirement.setTitle("Check Meal Availability");
		checkMealAvailabilityRequirement.setDescription(
				"The software should be able to check if a meal is available. A meal is only available in a period of 24 hours and at a specific location.");
		checkMealAvailabilityRequirement.setId("0");
		checkMealAvailabilityRequirement.setVersion(checkMealAvailabilityRequirementVersion);
		checkMealAvailabilityRequirement.setAuthor("EDOM");
		checkMealAvailabilityRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement payMealRequirement = factory.createRequirement();

		payMealRequirement.setTitle("Pay Meal");
		payMealRequirement.setDescription(
				"The software should be able handle a meal payment. The type of user that is paying for the meal should be recorded. It should not be possible to pay for an unavailable meal or a meal that is unavailable at the payment location.");
		payMealRequirement.setId("0");
		payMealRequirement.setVersion(payMealRequirementVersion);
		payMealRequirement.setAuthor("EDOM");
		payMealRequirement.setCreated(new Date(System.currentTimeMillis()));

		List<Requirement> manageMealsRequirements = new ArrayList<Requirement>();

		manageMealsRequirements.add(saveMealRequirement);

		manageMealsRequirements.add(showMealDesignationRequirement);

		manageMealsRequirements.add(showMealNutritionalDataRequirement);

		manageMealsRequirements.add(showMealTypeRequirement);

		manageMealsRequirements.add(showMealLocationRequirement);

		manageMealsRequirements.add(showMealPriceRequirement);

		manageMealsRequirements.add(listMealIngredientsRequirement);

		manageMealsRequirements.add(listMealAllergensRequirement);

		manageMealsRequirements.add(checkMealAvailabilityRequirement);

		manageMealsRequirements.add(payMealRequirement);

		// manageMealsRequirementsGroup.eSet(manageMealsRequirementsGroup.eContainingFeature(),
		// manageMealsRequirements);

		manageMealsRequirementsGroup.getRequirements().addAll(manageMealsRequirements);

		// Unserved Meals Requirements

		Requirement saveUnservedMealRequirement = factory.createRequirement();

		saveUnservedMealRequirement.setTitle("Save Unserved Meal");
		saveUnservedMealRequirement.setDescription(
				"The software should be able to save an unserved meal that will be packaged in the latter. It is identified by an identification number, has a production and expiration date and a designation of the meal. An unserved meal also has a state, and once saved its state is set to frozen.");
		saveUnservedMealRequirement.setId("0");
		saveUnservedMealRequirement.setVersion(saveUnservedMealRequirementVersion);
		saveUnservedMealRequirement.setAuthor("EDOM");
		saveUnservedMealRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showUnservedMealIdentificationNumberRequirement = factory.createRequirement();

		showUnservedMealIdentificationNumberRequirement.setTitle("Show Unserved Meal Identification Number");
		showUnservedMealIdentificationNumberRequirement
				.setDescription("The software should be able to show an unserved meal identification number.");
		showUnservedMealIdentificationNumberRequirement.setId("0");
		showUnservedMealIdentificationNumberRequirement
				.setVersion(showUnservedMealIdentificationNumberRequirementVersion);
		showUnservedMealIdentificationNumberRequirement.setAuthor("EDOM");
		showUnservedMealIdentificationNumberRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showUnservedMealDesignationRequirement = factory.createRequirement();

		showUnservedMealDesignationRequirement.setTitle("Show Unserved Meal Designation");
		showUnservedMealDesignationRequirement
				.setDescription("The software should be able to show an unserved meal designation.");
		showUnservedMealDesignationRequirement.setId("0");
		showUnservedMealDesignationRequirement.setVersion(showUnservedMealDesignationRequirementVersion);
		showUnservedMealDesignationRequirement.setAuthor("EDOM");
		showUnservedMealDesignationRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showUnservedMealProductionDateRequirement = factory.createRequirement();

		showUnservedMealProductionDateRequirement.setTitle("Show Unserved Meal Production Date");
		showUnservedMealProductionDateRequirement
				.setDescription("The software should be able to show an unserved meal production date.");
		showUnservedMealProductionDateRequirement.setId("0");
		showUnservedMealProductionDateRequirement.setVersion(showUnservedMealProductionDateRequirementVersion);
		showUnservedMealProductionDateRequirement.setAuthor("EDOM");
		showUnservedMealProductionDateRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showUnservedMealExpirationDateRequirement = factory.createRequirement();

		showUnservedMealExpirationDateRequirement.setTitle("Show Unserved Meal Expiration Date");
		showUnservedMealExpirationDateRequirement
				.setDescription("The software should be able to show an unserved meal expiration date.");
		showUnservedMealExpirationDateRequirement.setId("0");
		showUnservedMealExpirationDateRequirement.setVersion(showUnservedMealExpirationDateRequirementVersion);
		showUnservedMealExpirationDateRequirement.setAuthor("EDOM");
		showUnservedMealExpirationDateRequirement.setCreated(new Date(System.currentTimeMillis()));

		Requirement showUnservedMealStateRequirement = factory.createRequirement();

		showUnservedMealStateRequirement.setTitle("Show Unserved Meal State");
		showUnservedMealStateRequirement.setDescription("The software should be able to show an unserved meal state.");
		showUnservedMealStateRequirement.setId("0");
		showUnservedMealStateRequirement.setVersion(showUnservedMealStateRequirementVersion);
		showUnservedMealStateRequirement.setAuthor("EDOM");
		showUnservedMealStateRequirement.setCreated(new Date(System.currentTimeMillis()));

		List<Requirement> manageUnservedMealsRequirements = new ArrayList<Requirement>();

		manageUnservedMealsRequirements.add(saveUnservedMealRequirement);

		manageUnservedMealsRequirements.add(showUnservedMealIdentificationNumberRequirement);

		manageUnservedMealsRequirements.add(showUnservedMealDesignationRequirement);

		manageUnservedMealsRequirements.add(showUnservedMealProductionDateRequirement);

		manageUnservedMealsRequirements.add(showUnservedMealExpirationDateRequirement);

		manageUnservedMealsRequirements.add(showUnservedMealStateRequirement);

		// manageUnservedMealsRequirementsGroup.eSet(manageUnservedMealsRequirementsGroup.eContainingFeature(),
		// manageUnservedMealsRequirements);

		manageUnservedMealsRequirementsGroup.getRequirements().addAll(manageUnservedMealsRequirements);

		return myModel;
	}

}
