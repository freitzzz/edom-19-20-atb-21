/**
 */
package pt.isep.edom.project.c3.mm.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.edom.project.c3.mm.domain.DomainPackage;
import pt.isep.edom.project.c3.mm.domain.Entity;
import pt.isep.edom.project.c3.mm.domain.Field;
import pt.isep.edom.project.c3.mm.domain.Reference;
import pt.isep.edom.project.c3.mm.domain.SubEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.impl.EntityImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.impl.EntityImpl#getSubentities <em>Subentities</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.impl.EntityImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getSubentities() <em>Subentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubentities()
	 * @generated
	 * @ordered
	 */
	protected EList<SubEntity> subentities;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, DomainPackage.ENTITY__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubEntity> getSubentities() {
		if (subentities == null) {
			subentities = new EObjectContainmentEList<SubEntity>(SubEntity.class, this,
					DomainPackage.ENTITY__SUBENTITIES);
		}
		return subentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this,
					DomainPackage.ENTITY__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DomainPackage.ENTITY__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case DomainPackage.ENTITY__SUBENTITIES:
			return ((InternalEList<?>) getSubentities()).basicRemove(otherEnd, msgs);
		case DomainPackage.ENTITY__REFERENCES:
			return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
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
		case DomainPackage.ENTITY__NAME:
			return getName();
		case DomainPackage.ENTITY__FIELDS:
			return getFields();
		case DomainPackage.ENTITY__SUBENTITIES:
			return getSubentities();
		case DomainPackage.ENTITY__REFERENCES:
			return getReferences();
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
		case DomainPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case DomainPackage.ENTITY__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends Field>) newValue);
			return;
		case DomainPackage.ENTITY__SUBENTITIES:
			getSubentities().clear();
			getSubentities().addAll((Collection<? extends SubEntity>) newValue);
			return;
		case DomainPackage.ENTITY__REFERENCES:
			getReferences().clear();
			getReferences().addAll((Collection<? extends Reference>) newValue);
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
		case DomainPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DomainPackage.ENTITY__FIELDS:
			getFields().clear();
			return;
		case DomainPackage.ENTITY__SUBENTITIES:
			getSubentities().clear();
			return;
		case DomainPackage.ENTITY__REFERENCES:
			getReferences().clear();
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
		case DomainPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DomainPackage.ENTITY__FIELDS:
			return fields != null && !fields.isEmpty();
		case DomainPackage.ENTITY__SUBENTITIES:
			return subentities != null && !subentities.isEmpty();
		case DomainPackage.ENTITY__REFERENCES:
			return references != null && !references.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EntityImpl
