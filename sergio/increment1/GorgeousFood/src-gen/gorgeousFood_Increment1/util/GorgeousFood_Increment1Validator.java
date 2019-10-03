/**
 */
package gorgeousFood_Increment1.util;

import gorgeousFood_Increment1.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package
 * @generated
 */
public class GorgeousFood_Increment1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GorgeousFood_Increment1Validator INSTANCE = new GorgeousFood_Increment1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gorgeousFood_Increment1";

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
	public GorgeousFood_Increment1Validator() {
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
		return GorgeousFood_Increment1Package.eINSTANCE;
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
		case GorgeousFood_Increment1Package.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case GorgeousFood_Increment1Package.REQUIREMENT_GROUP:
			return validateRequirementGroup((RequirementGroup) value, diagnostics, context);
		case GorgeousFood_Increment1Package.VERSION:
			return validateVersion((Version) value, diagnostics, context);
		case GorgeousFood_Increment1Package.REQUIREMENT:
			return validateRequirement((Requirement) value, diagnostics, context);
		case GorgeousFood_Increment1Package.COMMENT:
			return validateComment((Comment) value, diagnostics, context);
		case GorgeousFood_Increment1Package.RESOLUTION:
			return validateResolution((Resolution) value, diagnostics, context);
		case GorgeousFood_Increment1Package.PRIORITY:
			return validatePriority((Priority) value, diagnostics, context);
		case GorgeousFood_Increment1Package.TYPE:
			return validateType((Type) value, diagnostics, context);
		case GorgeousFood_Increment1Package.STATE:
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
		if (result || diagnostics != null)
			result &= validateModel_titleMustHaveAtLeastFiveChars(model, diagnostics, context);
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
		return validate(GorgeousFood_Increment1Package.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveTitle", MODEL__MUST_HAVE_TITLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the titleMustHaveAtLeastFiveChars constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__TITLE_MUST_HAVE_AT_LEAST_FIVE_CHARS__EEXPRESSION = "title.size() >= 5";

	/**
	 * Validates the titleMustHaveAtLeastFiveChars constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_titleMustHaveAtLeastFiveChars(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "titleMustHaveAtLeastFiveChars",
				MODEL__TITLE_MUST_HAVE_AT_LEAST_FIVE_CHARS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateRequirementGroup_nameMustHaveAtLeastFiveChars(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_mustHaveDescription(requirementGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirementGroup_descriptionMustHaveAtLeastTenChars(requirementGroup, diagnostics,
					context);
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
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName",
				REQUIREMENT_GROUP__MUST_HAVE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustHaveAtLeastFiveChars constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__NAME_MUST_HAVE_AT_LEAST_FIVE_CHARS__EEXPRESSION = "name.size() >= 5";

	/**
	 * Validates the nameMustHaveAtLeastFiveChars constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_nameMustHaveAtLeastFiveChars(RequirementGroup requirementGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustHaveAtLeastFiveChars",
				REQUIREMENT_GROUP__NAME_MUST_HAVE_AT_LEAST_FIVE_CHARS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not description.oclIsUndefined()";

	/**
	 * Validates the mustHaveDescription constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_mustHaveDescription(RequirementGroup requirementGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDescription",
				REQUIREMENT_GROUP__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the descriptionMustHaveAtLeastTenChars constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__DESCRIPTION_MUST_HAVE_AT_LEAST_TEN_CHARS__EEXPRESSION = "description.size() > 5";

	/**
	 * Validates the descriptionMustHaveAtLeastTenChars constraint of '<em>Requirement Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_descriptionMustHaveAtLeastTenChars(RequirementGroup requirementGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT_GROUP, requirementGroup, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "descriptionMustHaveAtLeastTenChars",
				REQUIREMENT_GROUP__DESCRIPTION_MUST_HAVE_AT_LEAST_TEN_CHARS__EEXPRESSION, Diagnostic.ERROR,
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
			result &= validateVersion_mustHaveMinor(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVersion_mustHaveService(version, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVersion_mustHaveMajor(version, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveMinor constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERSION__MUST_HAVE_MINOR__EEXPRESSION = "not minor.oclIsUndefined()";

	/**
	 * Validates the mustHaveMinor constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_mustHaveMinor(Version version, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.VERSION, version, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveMinor",
				VERSION__MUST_HAVE_MINOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveService constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERSION__MUST_HAVE_SERVICE__EEXPRESSION = "not service.oclIsUndefined()";

	/**
	 * Validates the mustHaveService constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_mustHaveService(Version version, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.VERSION, version, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveService",
				VERSION__MUST_HAVE_SERVICE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveMajor constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERSION__MUST_HAVE_MAJOR__EEXPRESSION = "not major.oclIsUndefined()";

	/**
	 * Validates the mustHaveMajor constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_mustHaveMajor(Version version, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.VERSION, version, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveMajor",
				VERSION__MUST_HAVE_MAJOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateRequirement_mustHaveTitle(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_mustHaveDescription(requirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRequirement_mustHaveCreateDate(requirement, diagnostics, context);
		return result;
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
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveTitle",
				REQUIREMENT__MUST_HAVE_TITLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not description.oclIsUndefined()";

	/**
	 * Validates the mustHaveDescription constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_mustHaveDescription(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDescription",
				REQUIREMENT__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveCreateDate constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__MUST_HAVE_CREATE_DATE__EEXPRESSION = "not created.oclIsUndefined()";

	/**
	 * Validates the mustHaveCreateDate constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_mustHaveCreateDate(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousFood_Increment1Package.Literals.REQUIREMENT, requirement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveCreateDate",
				REQUIREMENT__MUST_HAVE_CREATE_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
		return validate(GorgeousFood_Increment1Package.Literals.COMMENT, comment, diagnostics, context,
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
		return validate(GorgeousFood_Increment1Package.Literals.COMMENT, comment, diagnostics, context,
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
		return validate(GorgeousFood_Increment1Package.Literals.COMMENT, comment, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveAuthor",
				COMMENT__MUST_HAVE_AUTHOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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

} //GorgeousFood_Increment1Validator
