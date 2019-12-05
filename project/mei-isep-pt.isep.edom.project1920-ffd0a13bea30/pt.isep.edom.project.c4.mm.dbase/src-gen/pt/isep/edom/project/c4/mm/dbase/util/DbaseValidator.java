/**
 */
package pt.isep.edom.project.c4.mm.dbase.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pt.isep.edom.project.c4.mm.dbase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage
 * @generated
 */
public class DbaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DbaseValidator INSTANCE = new DbaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pt.isep.edom.project.c4.mm.dbase";

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
	public DbaseValidator() {
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
		return DbasePackage.eINSTANCE;
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
		case DbasePackage.DBASE_MODEL:
			return validateDbaseModel((DbaseModel) value, diagnostics, context);
		case DbasePackage.TABLE:
			return validateTable((Table) value, diagnostics, context);
		case DbasePackage.COLUMN:
			return validateColumn((Column) value, diagnostics, context);
		case DbasePackage.COLUMN_TYPE:
			return validateColumnType((ColumnType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel(DbaseModel dbaseModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dbaseModel, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_mustHaveName(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_nameMustBeUnique(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_mustHaveTables(dbaseModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__MUST_HAVE_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_mustHaveName(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName",
				DBASE_MODEL__MUST_HAVE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustBeUnique constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__NAME_MUST_BE_UNIQUE__EEXPRESSION = "DbaseModel.allInstances()->isUnique(name)";

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_nameMustBeUnique(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustBeUnique",
				DBASE_MODEL__NAME_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveTables constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__MUST_HAVE_TABLES__EEXPRESSION = "not tables->isEmpty()";

	/**
	 * Validates the mustHaveTables constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_mustHaveTables(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveTables",
				DBASE_MODEL__MUST_HAVE_TABLES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_mustHaveName(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_mustHaveEntity(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_nameMustBeUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_mustHaveColumns(table, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__MUST_HAVE_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_mustHaveName(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName", TABLE__MUST_HAVE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveEntity constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__MUST_HAVE_ENTITY__EEXPRESSION = "not entity.oclIsUndefined()";

	/**
	 * Validates the mustHaveEntity constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_mustHaveEntity(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveEntity",
				TABLE__MUST_HAVE_ENTITY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustBeUnique constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__NAME_MUST_BE_UNIQUE__EEXPRESSION = "Table.allInstances()->isUnique(name)";

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_nameMustBeUnique(Table table, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustBeUnique",
				TABLE__NAME_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveColumns constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__MUST_HAVE_COLUMNS__EEXPRESSION = "not columns->isEmpty()";

	/**
	 * Validates the mustHaveColumns constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_mustHaveColumns(Table table, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveColumns",
				TABLE__MUST_HAVE_COLUMNS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColumn_mustHaveName(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColumn_mustHaveType(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColumn_nameMustBeUnique(column, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__MUST_HAVE_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_mustHaveName(Column column, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.COLUMN, column, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName", COLUMN__MUST_HAVE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveType constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__MUST_HAVE_TYPE__EEXPRESSION = "not type.oclIsUndefined()";

	/**
	 * Validates the mustHaveType constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_mustHaveType(Column column, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.COLUMN, column, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveType", COLUMN__MUST_HAVE_TYPE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustBeUnique constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__NAME_MUST_BE_UNIQUE__EEXPRESSION = "Column.allInstances()->isUnique(name)";

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_nameMustBeUnique(Column column, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.COLUMN, column, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustBeUnique",
				COLUMN__NAME_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //DbaseValidator
