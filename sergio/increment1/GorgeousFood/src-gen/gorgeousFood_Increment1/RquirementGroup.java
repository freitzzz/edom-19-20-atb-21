/**
 */
package gorgeousFood_Increment1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rquirement Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gorgeousFood_Increment1.RquirementGroup#getName <em>Name</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RquirementGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RquirementGroup#getId <em>Id</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RquirementGroup#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RquirementGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RquirementGroup#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup()
 * @model
 * @generated
 */
public interface RquirementGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RquirementGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RquirementGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RquirementGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link gorgeousFood_Increment1.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link gorgeousFood_Increment1.RquirementGroup}.
	 * It is bidirectional and its opposite is '{@link gorgeousFood_Increment1.RquirementGroup#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup_Children()
	 * @see gorgeousFood_Increment1.RquirementGroup#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RquirementGroup> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gorgeousFood_Increment1.RquirementGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(RquirementGroup)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRquirementGroup_Parent()
	 * @see gorgeousFood_Increment1.RquirementGroup#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	RquirementGroup getParent();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RquirementGroup#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RquirementGroup value);

} // RquirementGroup
