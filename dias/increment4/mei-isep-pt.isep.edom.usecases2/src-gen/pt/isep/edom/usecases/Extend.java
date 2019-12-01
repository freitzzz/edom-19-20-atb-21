/**
 */
package pt.isep.edom.usecases;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.usecases.Extend#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.usecases.UsecasesPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends Relationship {
	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usecase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' reference.
	 * @see #setUsecase(UseCase)
	 * @see pt.isep.edom.usecases.UsecasesPackage#getExtend_Usecase()
	 * @model required="true"
	 * @generated
	 */
	UseCase getUsecase();

	/**
	 * Sets the value of the '{@link pt.isep.edom.usecases.Extend#getUsecase <em>Usecase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usecase</em>' reference.
	 * @see #getUsecase()
	 * @generated
	 */
	void setUsecase(UseCase value);

} // Extend
