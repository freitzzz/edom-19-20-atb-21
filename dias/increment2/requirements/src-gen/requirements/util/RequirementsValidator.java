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
		case RequirementsPackage.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case RequirementsPackage.REQUIREMENT_GROUP:
			return validateRequirementGroup((RequirementGroup) value, diagnostics, context);
		case RequirementsPackage.REQUIREMENT:
			return validateRequirement((Requirement) value, diagnostics, context);
		case RequirementsPackage.VERSION:
			return validateVersion((Version) value, diagnostics, context);
		case RequirementsPackage.COMMENT:
			return validateComment((Comment) value, diagnostics, context);
		case RequirementsPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case RequirementsPackage.PRIORITY:
			return validatePriority((Priority) value, diagnostics, context);
		case RequirementsPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case RequirementsPackage.RESOLUTION:
			return validateResolution((Resolution) value, diagnostics, context);
		default:
			return true;
		}
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
			result &= validateModel_mustHaveTitle(model, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveTitle constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__MUST_HAVE_TITLE__EEXPRESSION = "not title.oclIsUndefined()";

	/**
	 * Validates the mustHaveTitle constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_mustHaveTitle(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveTitle", MODEL__MUST_HAVE_TITLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateRequirementGroup_mustHaveName(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_mustHaveID(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_IDMustBeUnique(requirementGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__MUST_HAVE_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_mustHaveName(RequirementGroup requirementGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName",
				REQUIREMENT_GROUP__MUST_HAVE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__MUST_HAVE_ID__EEXPRESSION = "not id.oclIsUndefined()";

	/**
	 * Validates the mustHaveID constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_mustHaveID(RequirementGroup requirementGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID",
				REQUIREMENT_GROUP__MUST_HAVE_ID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the IDMustBeUnique constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__ID_MUST_BE_UNIQUE__EEXPRESSION = "RequirementGroup.allInstances()->isUnique(id)";

	/**
	 * Validates the IDMustBeUnique constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_IDMustBeUnique(RequirementGroup requirementGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "IDMustBeUnique",
				REQUIREMENT_GROUP__ID_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateRequirement_mustHaveID(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_IDMustBeUnique(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_mustHaveTitle(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_mustHaveCreatedDate(requirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_ID__EEXPRESSION = "not id.oclIsUndefined()";

	/**
	 * Validates the mustHaveID constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_mustHaveID(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID", REQUIREMENT__MUST_HAVE_ID__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the IDMustBeUnique constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__ID_MUST_BE_UNIQUE__EEXPRESSION = "Requirement.allInstances()->isUnique(id)";

	/**
	 * Validates the IDMustBeUnique constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_IDMustBeUnique(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "IDMustBeUnique",
				REQUIREMENT__ID_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveTitle constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_TITLE__EEXPRESSION = "not title.oclIsUndefined()";

	/**
	 * Validates the mustHaveTitle constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_mustHaveTitle(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveTitle",
				REQUIREMENT__MUST_HAVE_TITLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveCreatedDate constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_CREATED_DATE__EEXPRESSION = "not created.oclIsUndefined()";

	/**
	 * Validates the mustHaveCreatedDate constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_mustHaveCreatedDate(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveCreatedDate",
				REQUIREMENT__MUST_HAVE_CREATED_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(version, diagnostics, context);
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
			result &= validateComment_mustHaveSubject(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_mustHaveBody(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_mustHaveAuthor(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_mustHaveCreatedDate(comment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveSubject constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_SUBJECT__EEXPRESSION = "not subject.oclIsUndefined()";

	/**
	 * Validates the mustHaveSubject constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_mustHaveSubject(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveSubject",
				COMMENT__MUST_HAVE_SUBJECT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveBody constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_BODY__EEXPRESSION = "not body.oclIsUndefined()";

	/**
	 * Validates the mustHaveBody constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_mustHaveBody(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveBody", COMMENT__MUST_HAVE_BODY__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveAuthor constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_AUTHOR__EEXPRESSION = "not author.oclIsUndefined()";

	/**
	 * Validates the mustHaveAuthor constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_mustHaveAuthor(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveAuthor",
				COMMENT__MUST_HAVE_AUTHOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveCreatedDate constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMENT__MUST_HAVE_CREATED_DATE__EEXPRESSION = "not created.oclIsUndefined()";

	/**
	 * Validates the mustHaveCreatedDate constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_mustHaveCreatedDate(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RequirementsPackage.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveCreatedDate",
				COMMENT__MUST_HAVE_CREATED_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
	public boolean validatePriority(Priority priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolution(Resolution resolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
