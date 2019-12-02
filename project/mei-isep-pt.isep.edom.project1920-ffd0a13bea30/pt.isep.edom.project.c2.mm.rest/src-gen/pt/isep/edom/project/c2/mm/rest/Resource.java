/**
 */
package pt.isep.edom.project.c2.mm.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#getEntity <em>Entity</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#getSubresource <em>Subresource</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#getReference <em>Reference</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#isPut <em>Put</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#isPost <em>Post</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#isDelete <em>Delete</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.Resource#isGet <em>Get</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c2.mm.rest.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Entity()
	 * @model
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c2.mm.rest.Resource#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

	/**
	 * Returns the value of the '<em><b>Subresource</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c2.mm.rest.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subresource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subresource</em>' containment reference list.
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Subresource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getSubresource();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c2.mm.rest.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Reference()
	 * @model
	 * @generated
	 */
	EList<Resource> getReference();

	/**
	 * Returns the value of the '<em><b>Put</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Put</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Put</em>' attribute.
	 * @see #setPut(boolean)
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Put()
	 * @model
	 * @generated
	 */
	boolean isPut();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c2.mm.rest.Resource#isPut <em>Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' attribute.
	 * @see #isPut()
	 * @generated
	 */
	void setPut(boolean value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(boolean)
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Post()
	 * @model
	 * @generated
	 */
	boolean isPost();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c2.mm.rest.Resource#isPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #isPost()
	 * @generated
	 */
	void setPost(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see #setDelete(boolean)
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Delete()
	 * @model
	 * @generated
	 */
	boolean isDelete();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c2.mm.rest.Resource#isDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see #isDelete()
	 * @generated
	 */
	void setDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' attribute.
	 * @see #setGet(boolean)
	 * @see pt.isep.edom.project.c2.mm.rest.RestPackage#getResource_Get()
	 * @model
	 * @generated
	 */
	boolean isGet();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c2.mm.rest.Resource#isGet <em>Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' attribute.
	 * @see #isGet()
	 * @generated
	 */
	void setGet(boolean value);

} // Resource
