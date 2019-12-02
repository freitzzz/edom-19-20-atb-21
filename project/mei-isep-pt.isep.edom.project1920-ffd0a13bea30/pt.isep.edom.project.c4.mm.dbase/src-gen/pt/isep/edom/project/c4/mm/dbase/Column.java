/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Column#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Column#getType <em>Type</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Column#isKey <em>Key</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Column#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.edom.project.c4.mm.dbase.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
	 * @see #setType(ColumnType)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn_Key()
	 * @model
	 * @generated
	 */
	boolean isKey();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Column#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c4.mm.dbase.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getForeignKey();

} // Column
