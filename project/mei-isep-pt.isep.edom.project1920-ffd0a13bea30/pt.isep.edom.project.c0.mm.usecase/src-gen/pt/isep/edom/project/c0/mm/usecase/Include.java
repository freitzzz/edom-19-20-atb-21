/**
 */
package pt.isep.edom.project.c0.mm.usecase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.Include#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends Relationship {
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
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getInclude_Usecase()
	 * @model required="true"
	 * @generated
	 */
	UseCase getUsecase();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c0.mm.usecase.Include#getUsecase <em>Usecase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usecase</em>' reference.
	 * @see #getUsecase()
	 * @generated
	 */
	void setUsecase(UseCase value);

} // Include
