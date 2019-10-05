/**
 */
package gorgeousFood_Increment1;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gorgeousFood_Increment1.Comment#getSubject <em>Subject</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Comment#getAuthor <em>Author</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Comment#getCreated <em>Created</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Comment#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getComment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveSubject subjectMustHaveAtLeastFiveChars mustHaveBody bodyMustHaveAtLeastFiveChars mustHaveAuthor mustHaveCreatedDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveSubject='not subject.oclIsUndefined()' subjectMustHaveAtLeastFiveChars='subject.size() &gt;= 5' mustHaveBody='not body.oclIsUndefined()' bodyMustHaveAtLeastFiveChars='body.size() &gt;= 5' mustHaveAuthor='not author.oclIsUndefined()' mustHaveCreatedDate='not created.oclIsUndefined()'"
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getComment_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Comment#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getComment_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getComment_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Comment#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getComment_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Comment#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link gorgeousFood_Increment1.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getComment_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getChildren();

} // Comment
