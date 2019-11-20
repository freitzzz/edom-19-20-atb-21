/**
 */
package requirements.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import requirements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see requirements.RequirementsPackage
 * @generated
 */
public class RequirementsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RequirementsValidator INSTANCE = new RequirementsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "requirements";

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
	public RequirementsValidator() {
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
		return RequirementsPackage.eINSTANCE;
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
		case RequirementsPackage.REQUIREMENT:
			return validateRequirement((Requirement) value, diagnostics, context);
		case RequirementsPackage.REQUIREMENT_GROUP:
			return validateRequirementGroup((RequirementGroup) value, diagnostics, context);
		case RequirementsPackage.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case RequirementsPackage.VERSION:
			return validateVersion((Version) value, diagnostics, context);
		case RequirementsPackage.COMMENT:
			return validateComment((Comment) value, diagnostics, context);
		case RequirementsPackage.RESOLUTION:
			return validateResolution((Resolution) value, diagnostics, context);
		case RequirementsPackage.PRIORITY:
			return validatePriority((Priority) value, diagnostics, context);
		case RequirementsPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case RequirementsPackage.STATE:
			return validateState((State) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_MustHaveTitle(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_NameLengthMustBeGreaterOrEqualThanFive(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_MustHaveDescription(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_DescriptionLengthMustBeGreaterOrEqualThanTen(requirement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateRequirement_StateCannotBeResolvedIfResolutionIsInvalid(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_StateCannotBeApprovedIfResolutionIsInvalid(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_StateCannotBeReviewedIfResolutionIsInvalid(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_MustHaveCreationDate(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_MustHaveAuthor(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_AuthorLengthMustBeGreaterOrEqualThanThree(requirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustHaveTitle constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_TITLE__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the MustHaveTitle constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_MustHaveTitle(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveTitle",
				REQUIREMENT__MUST_HAVE_TITLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NameLengthMustBeGreaterOrEqualThanFive constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__NAME_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_FIVE__EEXPRESSION = "name.size() >= 5";

	/**
	 * Validates the NameLengthMustBeGreaterOrEqualThanFive constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_NameLengthMustBeGreaterOrEqualThanFive(Requirement requirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameLengthMustBeGreaterOrEqualThanFive",
				REQUIREMENT__NAME_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_FIVE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveDescription constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not description.oclIsUndefined()";

	/**
	 * Validates the MustHaveDescription constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_MustHaveDescription(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveDescription",
				REQUIREMENT__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DescriptionLengthMustBeGreaterOrEqualThanTen constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__DESCRIPTION_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION = "description.size() >= 10";

	/**
	 * Validates the DescriptionLengthMustBeGreaterOrEqualThanTen constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_DescriptionLengthMustBeGreaterOrEqualThanTen(Requirement requirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DescriptionLengthMustBeGreaterOrEqualThanTen",
				REQUIREMENT__DESCRIPTION_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StateCannotBeResolvedIfResolutionIsInvalid constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__STATE_CANNOT_BE_RESOLVED_IF_RESOLUTION_IS_INVALID__EEXPRESSION = "if resolution = 'INVALID' then \n"
			+ "\t\t\t\tstate <> 'RESOLVED'\n" + "\t\t\t else \n" + "\t\t\t \ttrue\n" + "\t\t\t endif ";

	/**
	 * Validates the StateCannotBeResolvedIfResolutionIsInvalid constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_StateCannotBeResolvedIfResolutionIsInvalid(Requirement requirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StateCannotBeResolvedIfResolutionIsInvalid",
				REQUIREMENT__STATE_CANNOT_BE_RESOLVED_IF_RESOLUTION_IS_INVALID__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StateCannotBeApprovedIfResolutionIsInvalid constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__STATE_CANNOT_BE_APPROVED_IF_RESOLUTION_IS_INVALID__EEXPRESSION = "if resolution = 'INVALID' then \n"
			+ "\t\t\t\tstate <> 'APPROVED'\n" + "\t\t\t else \n" + "\t\t\t \ttrue\n" + "\t\t\t endif ";

	/**
	 * Validates the StateCannotBeApprovedIfResolutionIsInvalid constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_StateCannotBeApprovedIfResolutionIsInvalid(Requirement requirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StateCannotBeApprovedIfResolutionIsInvalid",
				REQUIREMENT__STATE_CANNOT_BE_APPROVED_IF_RESOLUTION_IS_INVALID__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StateCannotBeReviewedIfResolutionIsInvalid constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__STATE_CANNOT_BE_REVIEWED_IF_RESOLUTION_IS_INVALID__EEXPRESSION = "if resolution = 'INVALID' then \n"
			+ "\t\t\t\tstate <> 'REVIEWED'\n" + "\t\t\t else \n" + "\t\t\t \ttrue\n" + "\t\t\t endif ";

	/**
	 * Validates the StateCannotBeReviewedIfResolutionIsInvalid constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_StateCannotBeReviewedIfResolutionIsInvalid(Requirement requirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StateCannotBeReviewedIfResolutionIsInvalid",
				REQUIREMENT__STATE_CANNOT_BE_REVIEWED_IF_RESOLUTION_IS_INVALID__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveCreationDate constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_CREATION_DATE__EEXPRESSION = "not created.oclIsUndefined()";

	/**
	 * Validates the MustHaveCreationDate constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_MustHaveCreationDate(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveCreationDate",
				REQUIREMENT__MUST_HAVE_CREATION_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveAuthor constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_AUTHOR__EEXPRESSION = "not author.oclIsUndefined()";

	/**
	 * Validates the MustHaveAuthor constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_MustHaveAuthor(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveAuthor",
				REQUIREMENT__MUST_HAVE_AUTHOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AuthorLengthMustBeGreaterOrEqualThanThree constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__AUTHOR_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_THREE__EEXPRESSION = "author.size() >= 3";

	/**
	 * Validates the AuthorLengthMustBeGreaterOrEqualThanThree constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_AuthorLengthMustBeGreaterOrEqualThanThree(Requirement requirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AuthorLengthMustBeGreaterOrEqualThanThree",
				REQUIREMENT__AUTHOR_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_THREE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup(RequirementGroup requirementGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirementGroup, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_MustHaveDescription(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_DescriptionLengthMustBeGreaterOrEqualThanTen(requirementGroup,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_MustHaveName(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_NameLengthMustBeGreaterOrEqualThanTen(requirementGroup, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_CannotHaveSubRequirementsGroupWithSameName(requirementGroup, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the MustHaveDescription constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not description.oclIsUndefined()";

	/**
	 * Validates the MustHaveDescription constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_MustHaveDescription(RequirementGroup requirementGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveDescription",
				REQUIREMENT_GROUP__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DescriptionLengthMustBeGreaterOrEqualThanTen constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__DESCRIPTION_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION = "description.size() >= 10";

	/**
	 * Validates the DescriptionLengthMustBeGreaterOrEqualThanTen constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_DescriptionLengthMustBeGreaterOrEqualThanTen(
			RequirementGroup requirementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DescriptionLengthMustBeGreaterOrEqualThanTen",
				REQUIREMENT_GROUP__DESCRIPTION_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveName constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__MUST_HAVE_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the MustHaveName constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_MustHaveName(RequirementGroup requirementGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveName",
				REQUIREMENT_GROUP__MUST_HAVE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NameLengthMustBeGreaterOrEqualThanTen constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__NAME_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION = "name.size() >= 5";

	/**
	 * Validates the NameLengthMustBeGreaterOrEqualThanTen constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_NameLengthMustBeGreaterOrEqualThanTen(RequirementGroup requirementGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NameLengthMustBeGreaterOrEqualThanTen",
				REQUIREMENT_GROUP__NAME_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CannotHaveSubRequirementsGroupWithSameName constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__CANNOT_HAVE_SUB_REQUIREMENTS_GROUP_WITH_SAME_NAME__EEXPRESSION = "\n"
			+ "\t\tif not parent.oclIsUndefined()\n" + "\t\tthen \n" + "\t\t\tnot parent.name.equalsIgnoreCase(name)\n"
			+ "\t\telse \n" + "\t\t\ttrue\n" + "\t\tendif";

	/**
	 * Validates the CannotHaveSubRequirementsGroupWithSameName constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_CannotHaveSubRequirementsGroupWithSameName(
			RequirementGroup requirementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CannotHaveSubRequirementsGroupWithSameName",
				REQUIREMENT_GROUP__CANNOT_HAVE_SUB_REQUIREMENTS_GROUP_WITH_SAME_NAME__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_MustHaveTitle(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_TitleLengthMustBeGreaterOrEqualThanThree(model, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustHaveTitle constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__MUST_HAVE_TITLE__EEXPRESSION = "not title.oclIsUndefined()";

	/**
	 * Validates the MustHaveTitle constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_MustHaveTitle(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveTitle", MODEL__MUST_HAVE_TITLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the TitleLengthMustBeGreaterOrEqualThanThree constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__TITLE_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_THREE__EEXPRESSION = "title.size() >= 3";

	/**
	 * Validates the TitleLengthMustBeGreaterOrEqualThanThree constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_TitleLengthMustBeGreaterOrEqualThanThree(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "TitleLengthMustBeGreaterOrEqualThanThree",
				MODEL__TITLE_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_THREE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVersion_MajorCannotBeLowerThanZero(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVersion_MinorCannotBeLowerThanZero(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVersion_ServiceCannotBeLowerThanZero(version, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MajorCannotBeLowerThanZero constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERSION__MAJOR_CANNOT_BE_LOWER_THAN_ZERO__EEXPRESSION = "major >= 0";

	/**
	 * Validates the MajorCannotBeLowerThanZero constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_MajorCannotBeLowerThanZero(Version version, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.VERSION, version, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MajorCannotBeLowerThanZero",
				VERSION__MAJOR_CANNOT_BE_LOWER_THAN_ZERO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MinorCannotBeLowerThanZero constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERSION__MINOR_CANNOT_BE_LOWER_THAN_ZERO__EEXPRESSION = "minor >= 0";

	/**
	 * Validates the MinorCannotBeLowerThanZero constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_MinorCannotBeLowerThanZero(Version version, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.VERSION, version, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MinorCannotBeLowerThanZero",
				VERSION__MINOR_CANNOT_BE_LOWER_THAN_ZERO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ServiceCannotBeLowerThanZero constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERSION__SERVICE_CANNOT_BE_LOWER_THAN_ZERO__EEXPRESSION = "service >= 0";

	/**
	 * Validates the ServiceCannotBeLowerThanZero constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_ServiceCannotBeLowerThanZero(Version version, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.VERSION, version, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ServiceCannotBeLowerThanZero",
				VERSION__SERVICE_CANNOT_BE_LOWER_THAN_ZERO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_MustHaveAuthor(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_AuthorLengthMustBeGreaterOrEqualThanThree(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_MustHaveBody(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_BodyLengthMustBeGreaterOrEqualThanFifteen(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_MustHaveSubject(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_SubjectLengthMustBeGreaterOrEqualThanTen(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_MustHaveCreationDate(comment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustHaveAuthor constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_AUTHOR__EEXPRESSION = "not author.oclIsUndefined()";

	/**
	 * Validates the MustHaveAuthor constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_MustHaveAuthor(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveAuthor",
				COMMENT__MUST_HAVE_AUTHOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AuthorLengthMustBeGreaterOrEqualThanThree constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__AUTHOR_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_THREE__EEXPRESSION = "author.size() >= 3";

	/**
	 * Validates the AuthorLengthMustBeGreaterOrEqualThanThree constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_AuthorLengthMustBeGreaterOrEqualThanThree(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AuthorLengthMustBeGreaterOrEqualThanThree",
				COMMENT__AUTHOR_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_THREE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveBody constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_BODY__EEXPRESSION = "not body.oclIsUndefined()";

	/**
	 * Validates the MustHaveBody constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_MustHaveBody(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveBody", COMMENT__MUST_HAVE_BODY__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the BodyLengthMustBeGreaterOrEqualThanFifteen constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__BODY_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_FIFTEEN__EEXPRESSION = "body.size() >= 15";

	/**
	 * Validates the BodyLengthMustBeGreaterOrEqualThanFifteen constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_BodyLengthMustBeGreaterOrEqualThanFifteen(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "BodyLengthMustBeGreaterOrEqualThanFifteen",
				COMMENT__BODY_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_FIFTEEN__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveSubject constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_SUBJECT__EEXPRESSION = "not subject.oclIsUndefined()";

	/**
	 * Validates the MustHaveSubject constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_MustHaveSubject(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveSubject",
				COMMENT__MUST_HAVE_SUBJECT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectLengthMustBeGreaterOrEqualThanTen constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__SUBJECT_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION = "subject.size() >= 10";

	/**
	 * Validates the SubjectLengthMustBeGreaterOrEqualThanTen constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_SubjectLengthMustBeGreaterOrEqualThanTen(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectLengthMustBeGreaterOrEqualThanTen",
				COMMENT__SUBJECT_LENGTH_MUST_BE_GREATER_OR_EQUAL_THAN_TEN__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MustHaveCreationDate constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_CREATION_DATE__EEXPRESSION = "not created.oclIsUndefined()";

	/**
	 * Validates the MustHaveCreationDate constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_MustHaveCreationDate(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveCreationDate",
				COMMENT__MUST_HAVE_CREATION_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolution(Resolution resolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority(Priority priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //RequirementsValidator
