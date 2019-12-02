/**
 */
package pt.isep.edom.project.c2.mm.rest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.edom.project.c2.mm.rest.Resource;
import pt.isep.edom.project.c2.mm.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#getSubresource <em>Subresource</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#isPut <em>Put</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#isPost <em>Post</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl#isGet <em>Get</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected String entity = ENTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubresource() <em>Subresource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubresource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> subresource;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> reference;

	/**
	 * The default value of the '{@link #isPut() <em>Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPut() <em>Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPut()
	 * @generated
	 * @ordered
	 */
	protected boolean put = PUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPost()
	 * @generated
	 * @ordered
	 */
	protected boolean post = POST_EDEFAULT;

	/**
	 * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGet() <em>Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGet() <em>Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGet()
	 * @generated
	 * @ordered
	 */
	protected boolean get = GET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(String newEntity) {
		String oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSubresource() {
		if (subresource == null) {
			subresource = new EObjectContainmentEList<Resource>(Resource.class, this,
					RestPackage.RESOURCE__SUBRESOURCE);
		}
		return subresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<Resource>(Resource.class, this, RestPackage.RESOURCE__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPut() {
		return put;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPut(boolean newPut) {
		boolean oldPut = put;
		put = newPut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__PUT, oldPut, put));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(boolean newPost) {
		boolean oldPost = post;
		post = newPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__POST, oldPost, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(boolean newDelete) {
		boolean oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGet() {
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGet(boolean newGet) {
		boolean oldGet = get;
		get = newGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__GET, oldGet, get));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RestPackage.RESOURCE__SUBRESOURCE:
			return ((InternalEList<?>) getSubresource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RestPackage.RESOURCE__NAME:
			return getName();
		case RestPackage.RESOURCE__ENTITY:
			return getEntity();
		case RestPackage.RESOURCE__SUBRESOURCE:
			return getSubresource();
		case RestPackage.RESOURCE__REFERENCE:
			return getReference();
		case RestPackage.RESOURCE__PUT:
			return isPut();
		case RestPackage.RESOURCE__POST:
			return isPost();
		case RestPackage.RESOURCE__DELETE:
			return isDelete();
		case RestPackage.RESOURCE__GET:
			return isGet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RestPackage.RESOURCE__NAME:
			setName((String) newValue);
			return;
		case RestPackage.RESOURCE__ENTITY:
			setEntity((String) newValue);
			return;
		case RestPackage.RESOURCE__SUBRESOURCE:
			getSubresource().clear();
			getSubresource().addAll((Collection<? extends Resource>) newValue);
			return;
		case RestPackage.RESOURCE__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Resource>) newValue);
			return;
		case RestPackage.RESOURCE__PUT:
			setPut((Boolean) newValue);
			return;
		case RestPackage.RESOURCE__POST:
			setPost((Boolean) newValue);
			return;
		case RestPackage.RESOURCE__DELETE:
			setDelete((Boolean) newValue);
			return;
		case RestPackage.RESOURCE__GET:
			setGet((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RestPackage.RESOURCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RestPackage.RESOURCE__ENTITY:
			setEntity(ENTITY_EDEFAULT);
			return;
		case RestPackage.RESOURCE__SUBRESOURCE:
			getSubresource().clear();
			return;
		case RestPackage.RESOURCE__REFERENCE:
			getReference().clear();
			return;
		case RestPackage.RESOURCE__PUT:
			setPut(PUT_EDEFAULT);
			return;
		case RestPackage.RESOURCE__POST:
			setPost(POST_EDEFAULT);
			return;
		case RestPackage.RESOURCE__DELETE:
			setDelete(DELETE_EDEFAULT);
			return;
		case RestPackage.RESOURCE__GET:
			setGet(GET_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RestPackage.RESOURCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RestPackage.RESOURCE__ENTITY:
			return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
		case RestPackage.RESOURCE__SUBRESOURCE:
			return subresource != null && !subresource.isEmpty();
		case RestPackage.RESOURCE__REFERENCE:
			return reference != null && !reference.isEmpty();
		case RestPackage.RESOURCE__PUT:
			return put != PUT_EDEFAULT;
		case RestPackage.RESOURCE__POST:
			return post != POST_EDEFAULT;
		case RestPackage.RESOURCE__DELETE:
			return delete != DELETE_EDEFAULT;
		case RestPackage.RESOURCE__GET:
			return get != GET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", entity: ");
		result.append(entity);
		result.append(", put: ");
		result.append(put);
		result.append(", post: ");
		result.append(post);
		result.append(", delete: ");
		result.append(delete);
		result.append(", get: ");
		result.append(get);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
