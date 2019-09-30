/**
 */
package gorgeousFood_Increment1;

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
 *   <li>{@link gorgeousFood_Increment1.Model#getTitle <em>Title</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Model#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getModel_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Model#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link gorgeousFood_Increment1.RquirementGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getModel_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<RquirementGroup> getGroups();

} // Model
