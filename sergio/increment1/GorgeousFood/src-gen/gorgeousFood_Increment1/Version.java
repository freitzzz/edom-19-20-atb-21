/**
 */
package gorgeousFood_Increment1;

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
 *   <li>{@link gorgeousFood_Increment1.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Version#getService <em>Service</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Version#getVersion <em>Version</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.Version#getMajor <em>Major</em>}</li>
 * </ul>
 *
 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getVersion_Minor()
	 * @model
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Version#getMinor <em>Minor</em>}' attribute.
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
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getVersion_Service()
	 * @model
	 * @generated
	 */
	int getService();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Version#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Requirement)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getVersion_Version()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Requirement getVersion();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Version#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Requirement value);

	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see gorgeousFood_Increment1.GorgeousFood_Increment1Package#getVersion_Major()
	 * @model
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link gorgeousFood_Increment1.Version#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

} // Version
