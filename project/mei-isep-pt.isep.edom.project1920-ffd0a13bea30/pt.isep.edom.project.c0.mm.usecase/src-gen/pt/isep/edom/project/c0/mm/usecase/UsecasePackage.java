/**
 */
package pt.isep.edom.project.c0.mm.usecase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c0.mm.usecase.UsecaseFactory
 * @model kind="package"
 * @generated
 */
public interface UsecasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usecase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/usecase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usecase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsecasePackage eINSTANCE = pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseModelImpl <em>Use Case Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UseCaseModelImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getUseCaseModel()
	 * @generated
	 */
	int USE_CASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__USECASE = 3;

	/**
	 * The number of structural features of the '<em>Use Case Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Use Case Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.ActorImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.AssociationImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__USECASE = 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__EXTEND = 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__INCLUDE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__COMMENT = 3;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.RelationshipImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.ExtendImpl <em>Extend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.ExtendImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getExtend()
	 * @generated
	 */
	int EXTEND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND__USECASE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTEND_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.IncludeImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__USECASE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.CommentImpl
	 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case Model</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCaseModel
	 * @generated
	 */
	EClass getUseCaseModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getName()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EAttribute getUseCaseModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getActor()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getAssociation()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Association();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usecase</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCaseModel#getUsecase()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Usecase();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c0.mm.usecase.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c0.mm.usecase.Association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Association#getName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.edom.project.c0.mm.usecase.Association#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Association#getActor()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Actor();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.edom.project.c0.mm.usecase.Association#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usecase</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Association#getUsecase()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Usecase();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCase#getName()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extend</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCase#getExtend()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Extend();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCase#getInclude()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c0.mm.usecase.UseCase#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.UseCase#getComment()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Comment();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c0.mm.usecase.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.Extend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extend</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Extend
	 * @generated
	 */
	EClass getExtend();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.edom.project.c0.mm.usecase.Extend#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usecase</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Extend#getUsecase()
	 * @see #getExtend()
	 * @generated
	 */
	EReference getExtend_Usecase();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.edom.project.c0.mm.usecase.Include#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usecase</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Include#getUsecase()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_Usecase();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c0.mm.usecase.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c0.mm.usecase.Comment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pt.isep.edom.project.c0.mm.usecase.Comment#getDescription()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsecaseFactory getUsecaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseModelImpl <em>Use Case Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UseCaseModelImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getUseCaseModel()
		 * @generated
		 */
		EClass USE_CASE_MODEL = eINSTANCE.getUseCaseModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE_MODEL__NAME = eINSTANCE.getUseCaseModel_Name();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__ACTOR = eINSTANCE.getUseCaseModel_Actor();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__ASSOCIATION = eINSTANCE.getUseCaseModel_Association();

		/**
		 * The meta object literal for the '<em><b>Usecase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__USECASE = eINSTANCE.getUseCaseModel_Usecase();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.ActorImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.AssociationImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ACTOR = eINSTANCE.getAssociation_Actor();

		/**
		 * The meta object literal for the '<em><b>Usecase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__USECASE = eINSTANCE.getAssociation_Usecase();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UseCaseImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__EXTEND = eINSTANCE.getUseCase_Extend();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__INCLUDE = eINSTANCE.getUseCase_Include();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__COMMENT = eINSTANCE.getUseCase_Comment();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.RelationshipImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.ExtendImpl <em>Extend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.ExtendImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getExtend()
		 * @generated
		 */
		EClass EXTEND = eINSTANCE.getExtend();

		/**
		 * The meta object literal for the '<em><b>Usecase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTEND__USECASE = eINSTANCE.getExtend_Usecase();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.IncludeImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Usecase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__USECASE = eINSTANCE.getInclude_Usecase();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c0.mm.usecase.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.CommentImpl
		 * @see pt.isep.edom.project.c0.mm.usecase.impl.UsecasePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DESCRIPTION = eINSTANCE.getComment_Description();

	}

} //UsecasePackage
