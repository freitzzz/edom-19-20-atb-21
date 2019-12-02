/**
 */
package pt.isep.edom.project.c0.mm.usecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getAssociation <em>Association</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCaseModel()
 * @model
 * @generated
 */
public interface UseCaseModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCaseModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c0.mm.usecase.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCaseModel_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c0.mm.usecase.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCaseModel_Association()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c0.mm.usecase.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usecase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' containment reference list.
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCaseModel_Usecase()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUsecase();

} // UseCaseModel
