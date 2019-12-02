/**
 */
package pt.isep.edom.project.c2.mm.rest;

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
 * @see pt.isep.edom.project.c2.mm.rest.RestFactory
 * @model kind="package"
 * @generated
 */
public interface RestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestPackage eINSTANCE = pt.isep.edom.project.c2.mm.rest.impl.RestPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c2.mm.rest.impl.RestModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c2.mm.rest.impl.RestModelImpl
	 * @see pt.isep.edom.project.c2.mm.rest.impl.RestPackageImpl#getRestModel()
	 * @generated
	 */
	int REST_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MODEL__URL = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MODEL__RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl
	 * @see pt.isep.edom.project.c2.mm.rest.impl.RestPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Subresource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SUBRESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Put</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PUT = 4;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__POST = 5;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DELETE = 6;

	/**
	 * The feature id for the '<em><b>Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__GET = 7;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c2.mm.rest.RestModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.RestModel
	 * @generated
	 */
	EClass getRestModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.RestModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.RestModel#getName()
	 * @see #getRestModel()
	 * @generated
	 */
	EAttribute getRestModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.RestModel#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.RestModel#getUrl()
	 * @see #getRestModel()
	 * @generated
	 */
	EAttribute getRestModel_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c2.mm.rest.RestModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.RestModel#getResources()
	 * @see #getRestModel()
	 * @generated
	 */
	EReference getRestModel_Resources();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c2.mm.rest.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.Resource#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#getEntity()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c2.mm.rest.Resource#getSubresource <em>Subresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subresource</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#getSubresource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Subresource();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.edom.project.c2.mm.rest.Resource#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#getReference()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Reference();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.Resource#isPut <em>Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Put</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#isPut()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Put();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.Resource#isPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#isPost()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Post();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.Resource#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#isDelete()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Delete();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c2.mm.rest.Resource#isGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Get</em>'.
	 * @see pt.isep.edom.project.c2.mm.rest.Resource#isGet()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Get();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestFactory getRestFactory();

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
		 * The meta object literal for the '{@link pt.isep.edom.project.c2.mm.rest.impl.RestModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c2.mm.rest.impl.RestModelImpl
		 * @see pt.isep.edom.project.c2.mm.rest.impl.RestPackageImpl#getRestModel()
		 * @generated
		 */
		EClass REST_MODEL = eINSTANCE.getRestModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_MODEL__NAME = eINSTANCE.getRestModel_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_MODEL__URL = eINSTANCE.getRestModel_Url();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_MODEL__RESOURCES = eINSTANCE.getRestModel_Resources();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c2.mm.rest.impl.ResourceImpl
		 * @see pt.isep.edom.project.c2.mm.rest.impl.RestPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ENTITY = eINSTANCE.getResource_Entity();

		/**
		 * The meta object literal for the '<em><b>Subresource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SUBRESOURCE = eINSTANCE.getResource_Subresource();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__REFERENCE = eINSTANCE.getResource_Reference();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PUT = eINSTANCE.getResource_Put();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__POST = eINSTANCE.getResource_Post();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DELETE = eINSTANCE.getResource_Delete();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__GET = eINSTANCE.getResource_Get();

	}

} //RestPackage
