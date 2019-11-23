/**
 */
package pt.isep.edom.usecases.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.edom.usecases.UseCaseModel;
import pt.isep.edom.usecases.UsecasesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseModelTest extends TestCase {

	/**
	 * The fixture for this Use Case Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UseCaseModelTest.class);
	}

	/**
	 * Constructs a new Use Case Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Use Case Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UseCaseModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Use Case Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecasesFactory.eINSTANCE.createUseCaseModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UseCaseModelTest
