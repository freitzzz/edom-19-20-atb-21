/**
 */
package pt.isep.edom.project.c3.mm.domain.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pt.isep.edom.project.c3.mm.domain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage
 * @generated
 */
public class DomainValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DomainValidator INSTANCE = new DomainValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pt.isep.edom.project.c3.mm.domain";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return DomainPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case DomainPackage.DOMAIN_MODEL:
			return validateDomainModel((DomainModel) value, diagnostics, context);
		case DomainPackage.ENTITY:
			return validateEntity((Entity) value, diagnostics, context);
		case DomainPackage.FIELD:
			return validateField((Field) value, diagnostics, context);
		case DomainPackage.SUB_ENTITY:
			return validateSubEntity((SubEntity) value, diagnostics, context);
		case DomainPackage.REFERENCE:
			return validateReference((Reference) value, diagnostics, context);
		case DomainPackage.FIELD_TYPE:
			return validateFieldType((FieldType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel(DomainModel domainModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainModel, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDomainModel_NameCannotBeNull(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDomainModel_NameLengthMustBeEqualOrGreaterThanThree(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDomainModel_MustHaveAtLeastOneEntity(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDomainModel_CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced(domainModel,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDomainModel_CannotHaveMoreThanOneEntityWithTheSameName(domainModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameCannotBeNull constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__NAME_CANNOT_BE_NULL__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the NameCannotBeNull constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_NameCannotBeNull(DomainModel domainModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.DOMAIN_MODEL, domainModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCannotBeNull",
				DOMAIN_MODEL__NAME_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NameLengthMustBeEqualOrGreaterThanThree constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__NAME_LENGTH_MUST_BE_EQUAL_OR_GREATER_THAN_THREE__EEXPRESSION = "self.name.size() >= 3";

	/**
	 * Validates the NameLengthMustBeEqualOrGreaterThanThree constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_NameLengthMustBeEqualOrGreaterThanThree(DomainModel domainModel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.DOMAIN_MODEL, domainModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameLengthMustBeEqualOrGreaterThanThree",
				DOMAIN_MODEL__NAME_LENGTH_MUST_BE_EQUAL_OR_GREATER_THAN_THREE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveAtLeastOneEntity constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__MUST_HAVE_AT_LEAST_ONE_ENTITY__EEXPRESSION = "not self.entities -> isEmpty()";

	/**
	 * Validates the MustHaveAtLeastOneEntity constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_MustHaveAtLeastOneEntity(DomainModel domainModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.DOMAIN_MODEL, domainModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveAtLeastOneEntity",
				DOMAIN_MODEL__MUST_HAVE_AT_LEAST_ONE_ENTITY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__CANNOT_HAVE_ENTITIES_THAT_DO_NOT_REFERENCE_OR_ARE_NOT_REFERENCED__EEXPRESSION = "\n"
			+ "\t\t\tif self.entities -> size() = 1 then \n" + "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\tself.entities -> select(entity : Entity | entity.references -> isEmpty() and entity.subentities -> isEmpty())\n"
			+ "\t\t\t\t-> includesAll(\n"
			+ "\t\t\t\t\tReference.allInstances() -> collect(referenced : Reference| referenced.entity) -> asSet()\n"
			+ "\t\t\t\t)\n" + "\t\t\t\tand\n"
			+ "\t\t\t\tself.entities -> select(entity : Entity | entity.references -> isEmpty() and entity.subentities -> isEmpty())\n"
			+ "\t\t\t\t-> includesAll(\n"
			+ "\t\t\t\t\tSubEntity.allInstances() -> collect(subEntity : SubEntity| subEntity.entity) -> asSet()\n"
			+ "\t\t\t\t)\n" + "\t\t\t\tendif\n" + "\t\t";

	/**
	 * Validates the CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced(DomainModel domainModel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.DOMAIN_MODEL, domainModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced",
				DOMAIN_MODEL__CANNOT_HAVE_ENTITIES_THAT_DO_NOT_REFERENCE_OR_ARE_NOT_REFERENCED__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CannotHaveMoreThanOneEntityWithTheSameName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__CANNOT_HAVE_MORE_THAN_ONE_ENTITY_WITH_THE_SAME_NAME__EEXPRESSION = "\n"
			+ "\t\t\tself.entities -> collect(entity| entity.name.toLowerCase()) -> asSet() -> size() = self.entities -> size()\n"
			+ "\t\t";

	/**
	 * Validates the CannotHaveMoreThanOneEntityWithTheSameName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_CannotHaveMoreThanOneEntityWithTheSameName(DomainModel domainModel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.DOMAIN_MODEL, domainModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CannotHaveMoreThanOneEntityWithTheSameName",
				DOMAIN_MODEL__CANNOT_HAVE_MORE_THAN_ONE_ENTITY_WITH_THE_SAME_NAME__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_NameCannotBeNull(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_NameCanOnlyContainAlphaNumericCharactersAndSpaces(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_NameLengthMustBeEqualOrGreaterThanThree(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_MustHaveAtLeastIdAndNameFields(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_CannotHaveDuplicatedFields(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity(entity,
					diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameCannotBeNull constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NAME_CANNOT_BE_NULL__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the NameCannotBeNull constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_NameCannotBeNull(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCannotBeNull",
				ENTITY__NAME_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NameCanOnlyContainAlphaNumericCharactersAndSpaces constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NAME_CAN_ONLY_CONTAIN_ALPHA_NUMERIC_CHARACTERS_AND_SPACES__EEXPRESSION = "self.name.matches('^[A-Za-z ]+$')";

	/**
	 * Validates the NameCanOnlyContainAlphaNumericCharactersAndSpaces constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_NameCanOnlyContainAlphaNumericCharactersAndSpaces(Entity entity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCanOnlyContainAlphaNumericCharactersAndSpaces",
				ENTITY__NAME_CAN_ONLY_CONTAIN_ALPHA_NUMERIC_CHARACTERS_AND_SPACES__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NameLengthMustBeEqualOrGreaterThanThree constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NAME_LENGTH_MUST_BE_EQUAL_OR_GREATER_THAN_THREE__EEXPRESSION = "self.name.size() >= 3";

	/**
	 * Validates the NameLengthMustBeEqualOrGreaterThanThree constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_NameLengthMustBeEqualOrGreaterThanThree(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameLengthMustBeEqualOrGreaterThanThree",
				ENTITY__NAME_LENGTH_MUST_BE_EQUAL_OR_GREATER_THAN_THREE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveAtLeastIdAndNameFields constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_HAVE_AT_LEAST_ID_AND_NAME_FIELDS__EEXPRESSION = "\n"
			+ "\t\t\tself.fields -> select(field : Field | field.name = 'id' or field.name = 'name') -> size() = 2\n"
			+ "\t\t";

	/**
	 * Validates the MustHaveAtLeastIdAndNameFields constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_MustHaveAtLeastIdAndNameFields(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveAtLeastIdAndNameFields",
				ENTITY__MUST_HAVE_AT_LEAST_ID_AND_NAME_FIELDS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CannotHaveDuplicatedFields constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__CANNOT_HAVE_DUPLICATED_FIELDS__EEXPRESSION = "\n"
			+ "\t\t\tself.fields -> collect(field : Field | field.name) -> asSet() -> size() = self.fields -> size()\n"
			+ "\t\t";

	/**
	 * Validates the CannotHaveDuplicatedFields constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_CannotHaveDuplicatedFields(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CannotHaveDuplicatedFields",
				ENTITY__CANNOT_HAVE_DUPLICATED_FIELDS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__CANNOT_HAVE_SUB_ENTITY_THAT_REFERENCE_THE_ENTITY_THAT_CONTAINS_THE_SUB_ENTITY__EEXPRESSION = "\n"
			+ "\t\t\tself.subentities -> select(subEntity : SubEntity | subEntity.entity = self) -> isEmpty()\n"
			+ "\t\t";

	/**
	 * Validates the CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity(Entity entity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity",
				ENTITY__CANNOT_HAVE_SUB_ENTITY_THAT_REFERENCE_THE_ENTITY_THAT_CONTAINS_THE_SUB_ENTITY__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(field, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateField_NameCannotBeNull(field, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateField_NameCanOnlyContainAlphaCharacters(field, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameCannotBeNull constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FIELD__NAME_CANNOT_BE_NULL__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the NameCannotBeNull constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField_NameCannotBeNull(Field field, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.FIELD, field, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCannotBeNull",
				FIELD__NAME_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NameCanOnlyContainAlphaCharacters constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FIELD__NAME_CAN_ONLY_CONTAIN_ALPHA_CHARACTERS__EEXPRESSION = "self.name.matches('^[A-Za-z]+$')";

	/**
	 * Validates the NameCanOnlyContainAlphaCharacters constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField_NameCanOnlyContainAlphaCharacters(Field field, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.FIELD, field, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCanOnlyContainAlphaCharacters",
				FIELD__NAME_CAN_ONLY_CONTAIN_ALPHA_CHARACTERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEntity(SubEntity subEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subEntity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubEntity_NameCannotBeNull(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubEntity_UpperBoundMustBeGreaterOrEqualThanMinusOne(subEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubEntity_EntityReferenceCannotBeNull(subEntity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameCannotBeNull constraint of '<em>Sub Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_ENTITY__NAME_CANNOT_BE_NULL__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the NameCannotBeNull constraint of '<em>Sub Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEntity_NameCannotBeNull(SubEntity subEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.SUB_ENTITY, subEntity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCannotBeNull",
				SUB_ENTITY__NAME_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UpperBoundMustBeGreaterOrEqualThanMinusOne constraint of '<em>Sub Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_ENTITY__UPPER_BOUND_MUST_BE_GREATER_OR_EQUAL_THAN_MINUS_ONE__EEXPRESSION = "self.upperBound >= -1";

	/**
	 * Validates the UpperBoundMustBeGreaterOrEqualThanMinusOne constraint of '<em>Sub Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEntity_UpperBoundMustBeGreaterOrEqualThanMinusOne(SubEntity subEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.SUB_ENTITY, subEntity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UpperBoundMustBeGreaterOrEqualThanMinusOne",
				SUB_ENTITY__UPPER_BOUND_MUST_BE_GREATER_OR_EQUAL_THAN_MINUS_ONE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the EntityReferenceCannotBeNull constraint of '<em>Sub Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_ENTITY__ENTITY_REFERENCE_CANNOT_BE_NULL__EEXPRESSION = "not self.entity.oclIsUndefined()";

	/**
	 * Validates the EntityReferenceCannotBeNull constraint of '<em>Sub Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEntity_EntityReferenceCannotBeNull(SubEntity subEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.SUB_ENTITY, subEntity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "EntityReferenceCannotBeNull",
				SUB_ENTITY__ENTITY_REFERENCE_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReference_NameCannotBeNull(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReference_UpperBoundMustBeGreaterOrEqualThanMinusOne(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReference_EntityReferenceCannotBeNull(reference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameCannotBeNull constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__NAME_CANNOT_BE_NULL__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the NameCannotBeNull constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_NameCannotBeNull(Reference reference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.REFERENCE, reference, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameCannotBeNull",
				REFERENCE__NAME_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UpperBoundMustBeGreaterOrEqualThanMinusOne constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__UPPER_BOUND_MUST_BE_GREATER_OR_EQUAL_THAN_MINUS_ONE__EEXPRESSION = "self.upperBound >= 1";

	/**
	 * Validates the UpperBoundMustBeGreaterOrEqualThanMinusOne constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_UpperBoundMustBeGreaterOrEqualThanMinusOne(Reference reference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.REFERENCE, reference, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UpperBoundMustBeGreaterOrEqualThanMinusOne",
				REFERENCE__UPPER_BOUND_MUST_BE_GREATER_OR_EQUAL_THAN_MINUS_ONE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the EntityReferenceCannotBeNull constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__ENTITY_REFERENCE_CANNOT_BE_NULL__EEXPRESSION = "not self.entity.oclIsUndefined()";

	/**
	 * Validates the EntityReferenceCannotBeNull constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_EntityReferenceCannotBeNull(Reference reference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.REFERENCE, reference, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "EntityReferenceCannotBeNull",
				REFERENCE__ENTITY_REFERENCE_CANNOT_BE_NULL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DomainValidator
