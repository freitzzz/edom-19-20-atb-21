/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.DbaseModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.DbaseModel#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getDbaseModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName nameMustBeUnique mustHaveTables'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='not name.oclIsUndefined()' nameMustBeUnique='DbaseModel.allInstances()-&gt;isUnique(name)' mustHaveTables='not tables-&gt;isEmpty()'"
 * @generated
 */
public interface DbaseModel extends EObject {
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
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getDbaseModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.DbaseModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c4.mm.dbase.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getDbaseModel_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // DbaseModel
