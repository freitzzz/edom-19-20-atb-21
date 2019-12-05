package pt.isep.edom.project.c3.mm.domain;



import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DomainModelOCLUnitTests {

	@Before
	public void initOCL() {
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

		EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		// -------------
	}

	@Before
	public void initModel() {
		// Initialize the model
		DomainPackage.eINSTANCE.eClass();
	}

	@Test
	public void GrantThatOCLFailsValidationIfDomainModelNameIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;

		DomainModel model = factory.createDomainModel();

		Diagnostic diag = Diagnostician.INSTANCE.validate(model);

		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;

		Assert.assertTrue(failedOCLValidation);
	}

	@Test
	public void GrantThatOCLFailsValidationIfDomainModelNameLengthIsLessThanThree() {

		DomainFactory factory = DomainFactory.eINSTANCE;

		DomainModel model = factory.createDomainModel();

		model.setName("tw");

		Diagnostic diag = Diagnostician.INSTANCE.validate(model);

		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;

		Assert.assertTrue(failedOCLValidation);
	}

	@Test
	public void GrantThatOCLFailsValidationIfDomainModelHasNoEntities() {

		DomainFactory factory = DomainFactory.eINSTANCE;

		DomainModel model = factory.createDomainModel();
		
		model.setName("GFA");

		Diagnostic diag = Diagnostician.INSTANCE.validate(model);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfDomainModelHasEntitiesThatHaveNoReferenceOrDontReference() {

		DomainFactory factory = DomainFactory.eINSTANCE;

		DomainModel model = factory.createDomainModel();
		
		model.setName("GFA");
		
		Entity meal = factory.createEntity();
		
		meal.setName("Meal");
		
		Field nameField = factory.createField();
		
		nameField.setName("name");
		
		nameField.setType(FieldType.STRING);
		
		Field idField = factory.createField();
		
		idField.setName("id");
		
		idField.setType(FieldType.INTEGER);
		
		meal.getFields().add(nameField);
		
		meal.getFields().add(idField);
		
		
		Entity mealType = factory.createEntity();
		
		mealType.setName("Meal Type");
		
		Field nameFieldd = factory.createField();
		
		nameFieldd.setName("name");
		
		nameFieldd.setType(FieldType.STRING);
		
		Field idFieldd = factory.createField();
		
		idFieldd.setName("id");
		
		idFieldd.setType(FieldType.INTEGER);
		
		mealType.getFields().add(nameFieldd);
		
		mealType.getFields().add(idFieldd);
		
		model.getEntities().add(mealType);

		Diagnostic diag = Diagnostician.INSTANCE.validate(model);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfDomainModelHasEntitiesWithTheSameNames() {

		DomainFactory factory = DomainFactory.eINSTANCE;

		DomainModel model = factory.createDomainModel();
		
		model.setName("GFA");
		
		Entity meal = factory.createEntity();
		
		meal.setName("Meal");
		
		Field nameField = factory.createField();
		
		nameField.setName("name");
		
		nameField.setType(FieldType.STRING);
		
		Field idField = factory.createField();
		
		idField.setName("id");
		
		idField.setType(FieldType.INTEGER);
		
		meal.getFields().add(nameField);
		
		meal.getFields().add(idField);
		
		
		Entity mealType = factory.createEntity();
		
		mealType.setName("Meal");
		
		Field nameFieldd = factory.createField();
		
		nameFieldd.setName("name");
		
		nameFieldd.setType(FieldType.STRING);
		
		Field idFieldd = factory.createField();
		
		idFieldd.setName("id");
		
		idFieldd.setType(FieldType.INTEGER);
		
		mealType.getFields().add(nameFieldd);
		
		mealType.getFields().add(idFieldd);
		
		model.getEntities().add(mealType);

		Diagnostic diag = Diagnostician.INSTANCE.validate(model);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfEntityNameIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Entity entity = factory.createEntity();

		Diagnostic diag = Diagnostician.INSTANCE.validate(entity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfEntityNameLengthIsLessThanThree() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Entity entity = factory.createEntity();
		
		entity.setName("tw");

		Diagnostic diag = Diagnostician.INSTANCE.validate(entity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfEntityNameContainsCharactersThatAreNotAlphaNumericOrSpaces() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Entity entity = factory.createEntity();
		
		entity.setName("tw.");

		Diagnostic diag = Diagnostician.INSTANCE.validate(entity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfEntityDoesntHaveNameAndIdFields() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Entity entity = factory.createEntity();
		
		entity.setName("Meal");

		Diagnostic diag = Diagnostician.INSTANCE.validate(entity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfEntityHasDuplicatedFields() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Entity meal = factory.createEntity();
		
		meal.setName("Meal");
		
		
		Field nameField = factory.createField();
		
		nameField.setName("name");
		
		nameField.setType(FieldType.STRING);
		
		Field idField = factory.createField();
		
		idField.setName("id");
		
		idField.setType(FieldType.INTEGER);
		
		Field idFieldd = factory.createField();
		
		idFieldd.setName("id");
		
		idFieldd.setType(FieldType.INTEGER);
		
		meal.getFields().add(nameField);
		
		meal.getFields().add(idField);
		
		meal.getFields().add(idFieldd);

		Diagnostic diag = Diagnostician.INSTANCE.validate(meal);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfFieldNameIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Field field = factory.createField();

		Diagnostic diag = Diagnostician.INSTANCE.validate(field);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfFieldNameContainsCharactersThatAreNotAlpha() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Field field = factory.createField();
		
		field.setName(" d");

		Diagnostic diag = Diagnostician.INSTANCE.validate(field);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfSubEntityNameIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		SubEntity subEntity = factory.createSubEntity();

		Diagnostic diag = Diagnostician.INSTANCE.validate(subEntity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfSubEntityUpperBoundIsLessThanMinusOne() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		SubEntity subEntity = factory.createSubEntity();
		
		subEntity.setName("contains");
		
		subEntity.setUpperBound(-2);

		Diagnostic diag = Diagnostician.INSTANCE.validate(subEntity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfSubEntityEntityReferenceIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		SubEntity subEntity = factory.createSubEntity();
		
		subEntity.setName("contains");
		
		subEntity.setUpperBound(-1);

		Diagnostic diag = Diagnostician.INSTANCE.validate(subEntity);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfReferenceNameIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Reference reference = factory.createReference();

		Diagnostic diag = Diagnostician.INSTANCE.validate(reference);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfReferenceUpperBoundIsLessThanMinusOne() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Reference reference = factory.createReference();
		
		reference.setName("contains");
		
		reference.setUpperBound(-2);

		Diagnostic diag = Diagnostician.INSTANCE.validate(reference);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}
	
	@Test
	public void GrantThatOCLFailsValidationIfReferenceEntityReferenceIsNull() {

		DomainFactory factory = DomainFactory.eINSTANCE;
		
		Reference reference = factory.createReference();
		
		reference.setName("contains");
		
		reference.setUpperBound(-1);

		Diagnostic diag = Diagnostician.INSTANCE.validate(reference);
		
		boolean failedOCLValidation = diag.getSeverity() == Diagnostic.ERROR;
		
		Assert.assertTrue(failedOCLValidation);
	}

}
