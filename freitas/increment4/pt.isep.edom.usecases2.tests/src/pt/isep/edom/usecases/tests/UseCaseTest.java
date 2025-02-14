/**
 */
package pt.isep.edom.usecases.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.edom.usecases.UseCase;
import pt.isep.edom.usecases.UsecasesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseTest extends TestCase {

	/**
	 * The fixture for this Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCase fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UseCaseTest.class);
	}

	/**
	 * Constructs a new Use Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UseCase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCase getFixture() {
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
		setFixture(UsecasesFactory.eINSTANCE.createUseCase());
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

} //UseCaseTest
