/**
 */
package pt.isep.edom.project.c0.mm.usecase.impl;

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

import pt.isep.edom.project.c0.mm.usecase.Comment;
import pt.isep.edom.project.c0.mm.usecase.Extend;
import pt.isep.edom.project.c0.mm.usecase.Include;
import pt.isep.edom.project.c0.mm.usecase.UseCase;
import pt.isep.edom.project.c0.mm.usecase.UsecasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends MinimalEObjectImpl.Container implements UseCase {
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
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.USE_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectContainmentEList<Extend>(Extend.class, this, UsecasePackage.USE_CASE__EXTEND);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<Include>(Include.class, this, UsecasePackage.USE_CASE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this, UsecasePackage.USE_CASE__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsecasePackage.USE_CASE__EXTEND:
			return ((InternalEList<?>) getExtend()).basicRemove(otherEnd, msgs);
		case UsecasePackage.USE_CASE__INCLUDE:
			return ((InternalEList<?>) getInclude()).basicRemove(otherEnd, msgs);
		case UsecasePackage.USE_CASE__COMMENT:
			return ((InternalEList<?>) getComment()).basicRemove(otherEnd, msgs);
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
		case UsecasePackage.USE_CASE__NAME:
			return getName();
		case UsecasePackage.USE_CASE__EXTEND:
			return getExtend();
		case UsecasePackage.USE_CASE__INCLUDE:
			return getInclude();
		case UsecasePackage.USE_CASE__COMMENT:
			return getComment();
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
		case UsecasePackage.USE_CASE__NAME:
			setName((String) newValue);
			return;
		case UsecasePackage.USE_CASE__EXTEND:
			getExtend().clear();
			getExtend().addAll((Collection<? extends Extend>) newValue);
			return;
		case UsecasePackage.USE_CASE__INCLUDE:
			getInclude().clear();
			getInclude().addAll((Collection<? extends Include>) newValue);
			return;
		case UsecasePackage.USE_CASE__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends Comment>) newValue);
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
		case UsecasePackage.USE_CASE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UsecasePackage.USE_CASE__EXTEND:
			getExtend().clear();
			return;
		case UsecasePackage.USE_CASE__INCLUDE:
			getInclude().clear();
			return;
		case UsecasePackage.USE_CASE__COMMENT:
			getComment().clear();
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
		case UsecasePackage.USE_CASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UsecasePackage.USE_CASE__EXTEND:
			return extend != null && !extend.isEmpty();
		case UsecasePackage.USE_CASE__INCLUDE:
			return include != null && !include.isEmpty();
		case UsecasePackage.USE_CASE__COMMENT:
			return comment != null && !comment.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UseCaseImpl
