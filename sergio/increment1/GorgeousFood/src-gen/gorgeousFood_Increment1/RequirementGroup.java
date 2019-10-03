/**
 */
package gorgeousFood_Increment1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gorgeousFood_Increment1.RequirementGroup#getName <em>Name</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RequirementGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RequirementGroup#getId <em>Id</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RequirementGroup#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RequirementGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.RequirementGroup#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName mustHaveDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='not name.oclIsUndefined()' mustHaveDescription='not description.oclIsUndefined()'"
 * @generated
 */
public interface RequirementGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RequirementGroup#getName <em>Name</em>}' attribute.
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
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RequirementGroup#getDescription <em>Description</em>}' attribute.
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
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RequirementGroup#getId <em>Id</em>}' attribute.
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
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link gorgeousFood_Increment1.RequirementGroup}.
	 * It is bidirectional and its opposite is '{@link gorgeousFood_Increment1.RequirementGroup#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup_Children()
	 * @see gorgeousFood_Increment1.RequirementGroup#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RequirementGroup> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gorgeousFood_Increment1.RequirementGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(RequirementGroup)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getRequirementGroup_Parent()
	 * @see gorgeousFood_Increment1.RequirementGroup#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	RequirementGroup getParent();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.RequirementGroup#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RequirementGroup value);

} // RequirementGroup
