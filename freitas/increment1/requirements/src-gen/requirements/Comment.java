/**
 */
package requirements;

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
 *   <li>{@link requirements.Comment#getChildren <em>Children</em>}</li>
 *   <li>{@link requirements.Comment#getSubject <em>Subject</em>}</li>
 *   <li>{@link requirements.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link requirements.Comment#getAuthor <em>Author</em>}</li>
 *   <li>{@link requirements.Comment#getCreated <em>Created</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getComment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustHaveAuthor AuthorLengthMustBeGreaterOrEqualThanThree MustHaveBody BodyLengthMustBeGreaterOrEqualThanFifteen MustHaveSubject SubjectLengthMustBeGreaterOrEqualThanTen MustHaveCreationDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MustHaveAuthor='not author.oclIsUndefined()' AuthorLengthMustBeGreaterOrEqualThanThree='author.size() &gt;= 3' MustHaveBody='not body.oclIsUndefined()' BodyLengthMustBeGreaterOrEqualThanFifteen='body.size() &gt;= 15' MustHaveSubject='not subject.oclIsUndefined()' SubjectLengthMustBeGreaterOrEqualThanTen='subject.size() &gt;= 10' MustHaveCreationDate='not created.oclIsUndefined()'"
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link requirements.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see requirements.RequirementsPackage#getComment_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getChildren();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see requirements.RequirementsPackage#getComment_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link requirements.Comment#getSubject <em>Subject</em>}' attribute.
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
	 * @see requirements.RequirementsPackage#getComment_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link requirements.Comment#getBody <em>Body</em>}' attribute.
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
	 * @see requirements.RequirementsPackage#getComment_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link requirements.Comment#getAuthor <em>Author</em>}' attribute.
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
	 * @see requirements.RequirementsPackage#getComment_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link requirements.Comment#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

} // Comment
