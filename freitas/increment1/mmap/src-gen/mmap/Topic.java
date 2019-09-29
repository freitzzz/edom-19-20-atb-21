/**
 */
package mmap;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmap.Topic#getDescription <em>Description</em>}</li>
 *   <li>{@link mmap.Topic#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link mmap.Topic#getEndDate <em>End Date</em>}</li>
 *   <li>{@link mmap.Topic#getPriority <em>Priority</em>}</li>
 *   <li>{@link mmap.Topic#getSubtopics <em>Subtopics</em>}</li>
 *   <li>{@link mmap.Topic#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see mmap.MmapPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends MapElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mmap.MmapPackage#getTopic_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mmap.Topic#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see mmap.MmapPackage#getTopic_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link mmap.Topic#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see mmap.MmapPackage#getTopic_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link mmap.Topic#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"LOW"</code>.
	 * The literals are from the enumeration {@link mmap.Priority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see mmap.Priority
	 * @see #setPriority(Priority)
	 * @see mmap.MmapPackage#getTopic_Priority()
	 * @model default="LOW"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link mmap.Topic#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see mmap.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Subtopics</b></em>' reference list.
	 * The list contents are of type {@link mmap.Topic}.
	 * It is bidirectional and its opposite is '{@link mmap.Topic#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtopics</em>' reference list.
	 * @see mmap.MmapPackage#getTopic_Subtopics()
	 * @see mmap.Topic#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Topic> getSubtopics();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mmap.Topic#getSubtopics <em>Subtopics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Topic)
	 * @see mmap.MmapPackage#getTopic_Parent()
	 * @see mmap.Topic#getSubtopics
	 * @model opposite="subtopics"
	 * @generated
	 */
	Topic getParent();

	/**
	 * Sets the value of the '{@link mmap.Topic#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Topic value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Topic> allSubtopics();

} // Topic
