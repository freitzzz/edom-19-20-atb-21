/**
 */
package requirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link requirements.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link requirements.Version#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getVersion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MajorCannotBeLowerThanZero MinorCannotBeLowerThanZero ServiceCannotBeLowerThanZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MajorCannotBeLowerThanZero='major &gt;= 0' MinorCannotBeLowerThanZero='minor &gt;= 0' ServiceCannotBeLowerThanZero='service &gt;= 0'"
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see requirements.RequirementsPackage#getVersion_Major()
	 * @model required="true"
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link requirements.Version#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see requirements.RequirementsPackage#getVersion_Minor()
	 * @model required="true"
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link requirements.Version#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(int)
	 * @see requirements.RequirementsPackage#getVersion_Service()
	 * @model required="true"
	 * @generated
	 */
	int getService();

	/**
	 * Sets the value of the '{@link requirements.Version#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(int value);

} // Version
