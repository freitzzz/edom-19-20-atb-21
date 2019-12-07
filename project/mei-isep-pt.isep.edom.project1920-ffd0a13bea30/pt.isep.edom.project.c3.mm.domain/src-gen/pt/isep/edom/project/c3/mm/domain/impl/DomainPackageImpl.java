/**
 */
package pt.isep.edom.project.c3.mm.domain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.isep.edom.project.c3.mm.domain.DomainFactory;
import pt.isep.edom.project.c3.mm.domain.DomainModel;
import pt.isep.edom.project.c3.mm.domain.DomainPackage;
import pt.isep.edom.project.c3.mm.domain.Entity;
import pt.isep.edom.project.c3.mm.domain.Field;
import pt.isep.edom.project.c3.mm.domain.FieldType;
import pt.isep.edom.project.c3.mm.domain.Reference;
import pt.isep.edom.project.c3.mm.domain.SubEntity;
import pt.isep.edom.project.c3.mm.domain.util.DomainValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited)
			return (DomainPackage) EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomainPackageImpl theDomainPackage = registeredDomainPackage instanceof DomainPackageImpl
				? (DomainPackageImpl) registeredDomainPackage
				: new DomainPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDomainPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return DomainValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainModel_Name() {
		return (EAttribute) domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainModel_Entities() {
		return (EReference) domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Name() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Fields() {
		return (EReference) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Subentities() {
		return (EReference) entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_References() {
		return (EReference) entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Name() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Type() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubEntity() {
		return subEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubEntity_Name() {
		return (EAttribute) subEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubEntity_Entity() {
		return (EReference) subEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubEntity_UpperBound() {
		return (EAttribute) subEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Name() {
		return (EAttribute) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Entity() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_UpperBound() {
		return (EAttribute) referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFieldType() {
		return fieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainFactory getDomainFactory() {
		return (DomainFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEAttribute(domainModelEClass, DOMAIN_MODEL__NAME);
		createEReference(domainModelEClass, DOMAIN_MODEL__ENTITIES);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__FIELDS);
		createEReference(entityEClass, ENTITY__SUBENTITIES);
		createEReference(entityEClass, ENTITY__REFERENCES);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__TYPE);

		subEntityEClass = createEClass(SUB_ENTITY);
		createEAttribute(subEntityEClass, SUB_ENTITY__NAME);
		createEReference(subEntityEClass, SUB_ENTITY__ENTITY);
		createEAttribute(subEntityEClass, SUB_ENTITY__UPPER_BOUND);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NAME);
		createEReference(referenceEClass, REFERENCE__ENTITY);
		createEAttribute(referenceEClass, REFERENCE__UPPER_BOUND);

		// Create enums
		fieldTypeEEnum = createEEnum(FIELD_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Entities(), this.getEntity(), null, "entities", null, 0, -1, DomainModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Fields(), this.getField(), null, "fields", null, 0, -1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEntity_Subentities(), this.getSubEntity(), null, "subentities", null, 0, -1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_References(), this.getReference(), null, "references", null, 0, -1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Type(), this.getFieldType(), "type", "INTEGER", 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subEntityEClass, SubEntity.class, "SubEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubEntity_Entity(), this.getEntity(), null, "entity", null, 0, 1, SubEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubEntity_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, SubEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Entity(), this.getEntity(), null, "entity", null, 0, 1, Reference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, Reference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fieldTypeEEnum, FieldType.class, "FieldType");
		addEEnumLiteral(fieldTypeEEnum, FieldType.STRING);
		addEEnumLiteral(fieldTypeEEnum, FieldType.INTEGER);
		addEEnumLiteral(fieldTypeEEnum, FieldType.REAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(domainModelEClass, source, new String[] { "constraints",
				"NameCannotBeNull NameLengthMustBeEqualOrGreaterThanThree MustHaveAtLeastOneEntity CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced CannotHaveMoreThanOneEntityWithTheSameName" });
		addAnnotation(entityEClass, source, new String[] { "constraints",
				"NameCannotBeNull NameCanOnlyContainAlphaNumericCharactersAndSpaces NameLengthMustBeEqualOrGreaterThanThree MustHaveAtLeastIdAndNameFields CannotHaveDuplicatedFields CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity" });
		addAnnotation(fieldEClass, source,
				new String[] { "constraints", "NameCannotBeNull NameCanOnlyContainAlphaCharacters" });
		addAnnotation(subEntityEClass, source, new String[] { "constraints",
				"NameCannotBeNull UpperBoundMustBeGreaterOrEqualThanMinusOne EntityReferenceCannotBeNull" });
		addAnnotation(referenceEClass, source, new String[] { "constraints",
				"NameCannotBeNull UpperBoundMustBeGreaterOrEqualThanMinusOne EntityReferenceCannotBeNull" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(domainModelEClass, source, new String[] { "NameCannotBeNull", "not self.name.oclIsUndefined()",
				"NameLengthMustBeEqualOrGreaterThanThree", "self.name.size() >= 3", "MustHaveAtLeastOneEntity",
				"not self.entities -> isEmpty()", "CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced",
				"\n\t\t\tif self.entities -> size() = 1 then \n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tself.entities -> select(entity : Entity | entity.references -> isEmpty() and entity.subentities -> isEmpty())\n\t\t\t\t-> includesAll(\n\t\t\t\t\tReference.allInstances() -> collect(referenced : Reference| referenced.entity) -> asSet()\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\tself.entities -> select(entity : Entity | entity.references -> isEmpty() and entity.subentities -> isEmpty())\n\t\t\t\t-> includesAll(\n\t\t\t\t\tSubEntity.allInstances() -> collect(subEntity : SubEntity| subEntity.entity) -> asSet()\n\t\t\t\t)\n\t\t\t\tendif\n\t\t",
				"CannotHaveMoreThanOneEntityWithTheSameName",
				"\n\t\t\tself.entities -> collect(entity| entity.name.toLowerCase()) -> asSet() -> size() = self.entities -> size()\n\t\t" });
		addAnnotation(entityEClass, source, new String[] { "NameCannotBeNull", "not self.name.oclIsUndefined()",
				"NameCanOnlyContainAlphaNumericCharactersAndSpaces", "self.name.matches(\'^[A-Za-z ]+$\')",
				"NameLengthMustBeEqualOrGreaterThanThree", "self.name.size() >= 3", "MustHaveAtLeastIdAndNameFields",
				"\n\t\t\tself.fields -> select(field : Field | field.name = \'id\' or field.name = \'name\') -> size() = 2\n\t\t",
				"CannotHaveDuplicatedFields",
				"\n\t\t\tself.fields -> collect(field : Field | field.name) -> asSet() -> size() = self.fields -> size()\n\t\t",
				"CannotHaveSubEntityThatReferenceTheEntityThatContainsTheSubEntity",
				"\n\t\t\tself.subentities -> select(subEntity : SubEntity | subEntity.entity = self) -> isEmpty()\n\t\t" });
		addAnnotation(fieldEClass, source, new String[] { "NameCannotBeNull", "not self.name.oclIsUndefined()",
				"NameCanOnlyContainAlphaCharacters", "self.name.matches(\'^[A-Za-z]+$\')" });
		addAnnotation(subEntityEClass, source,
				new String[] { "NameCannotBeNull", "not self.name.oclIsUndefined()",
						"UpperBoundMustBeGreaterOrEqualThanMinusOne", "self.upperBound >= -1",
						"EntityReferenceCannotBeNull", "not self.entity.oclIsUndefined()" });
		addAnnotation(referenceEClass, source,
				new String[] { "NameCannotBeNull", "not self.name.oclIsUndefined()",
						"UpperBoundMustBeGreaterOrEqualThanMinusOne", "self.upperBound >= 1",
						"EntityReferenceCannotBeNull", "not self.entity.oclIsUndefined()" });
	}

} //DomainPackageImpl
