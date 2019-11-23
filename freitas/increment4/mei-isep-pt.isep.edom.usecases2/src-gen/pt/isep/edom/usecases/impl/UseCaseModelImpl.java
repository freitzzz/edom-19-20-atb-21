/**
 */
package pt.isep.edom.usecases.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.edom.usecases.Actor;
import pt.isep.edom.usecases.Association;
import pt.isep.edom.usecases.UseCase;
import pt.isep.edom.usecases.UseCaseModel;
import pt.isep.edom.usecases.UsecasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.usecases.impl.UseCaseModelImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.isep.edom.usecases.impl.UseCaseModelImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link pt.isep.edom.usecases.impl.UseCaseModelImpl#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseModelImpl extends MinimalEObjectImpl.Container implements UseCaseModel {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> usecase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasesPackage.Literals.USE_CASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, UsecasesPackage.USE_CASE_MODEL__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<Association>(Association.class, this, UsecasesPackage.USE_CASE_MODEL__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UseCase> getUsecase() {
		if (usecase == null) {
			usecase = new EObjectContainmentEList<UseCase>(UseCase.class, this, UsecasesPackage.USE_CASE_MODEL__USECASE);
		}
		return usecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsecasesPackage.USE_CASE_MODEL__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case UsecasesPackage.USE_CASE_MODEL__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case UsecasesPackage.USE_CASE_MODEL__USECASE:
				return ((InternalEList<?>)getUsecase()).basicRemove(otherEnd, msgs);
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
			case UsecasesPackage.USE_CASE_MODEL__ACTOR:
				return getActor();
			case UsecasesPackage.USE_CASE_MODEL__ASSOCIATION:
				return getAssociation();
			case UsecasesPackage.USE_CASE_MODEL__USECASE:
				return getUsecase();
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
			case UsecasesPackage.USE_CASE_MODEL__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case UsecasesPackage.USE_CASE_MODEL__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case UsecasesPackage.USE_CASE_MODEL__USECASE:
				getUsecase().clear();
				getUsecase().addAll((Collection<? extends UseCase>)newValue);
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
			case UsecasesPackage.USE_CASE_MODEL__ACTOR:
				getActor().clear();
				return;
			case UsecasesPackage.USE_CASE_MODEL__ASSOCIATION:
				getAssociation().clear();
				return;
			case UsecasesPackage.USE_CASE_MODEL__USECASE:
				getUsecase().clear();
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
			case UsecasesPackage.USE_CASE_MODEL__ACTOR:
				return actor != null && !actor.isEmpty();
			case UsecasesPackage.USE_CASE_MODEL__ASSOCIATION:
				return association != null && !association.isEmpty();
			case UsecasesPackage.USE_CASE_MODEL__USECASE:
				return usecase != null && !usecase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseModelImpl
