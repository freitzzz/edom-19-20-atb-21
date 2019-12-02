/**
 */
package pt.isep.edom.project.c0.mm.usecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getInclude <em>Include</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject {
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
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c0.mm.usecase.Extend}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCase_Extend()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extend> getExtend();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c0.mm.usecase.Include}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see pt.isep.edom.project.c0.mm.usecase.UsecasePackage#getUseCase_Include()
	 * @model containment="true"
	 * @generated
	 */
	EList<Include> getInclude();

} // UseCase
