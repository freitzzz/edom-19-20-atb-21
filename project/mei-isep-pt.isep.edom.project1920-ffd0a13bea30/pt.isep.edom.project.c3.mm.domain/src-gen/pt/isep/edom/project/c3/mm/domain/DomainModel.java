/**
 */
package pt.isep.edom.project.c3.mm.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameCannotBeNull NameLengthMustBeEqualOrGreaterThanThree MustHaveAtLeastOneEntity CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced CannotHaveMoreThanOneEntityWithTheSameName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameCannotBeNull='not self.name.oclIsUndefined()' NameLengthMustBeEqualOrGreaterThanThree='self.name.size() &gt;= 3' MustHaveAtLeastOneEntity='not self.entities -&gt; isEmpty()' CannotHaveEntitiesThatDoNotReferenceOrAreNotReferenced='\n\t\t\tif self.entities -&gt; size() = 1 then \n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tself.entities -&gt; select(entity : Entity | entity.references -&gt; isEmpty() and entity.subentities -&gt; isEmpty())\n\t\t\t\t-&gt; includesAll(\n\t\t\t\t\tReference.allInstances() -&gt; collect(referenced : Reference| referenced.entity) -&gt; asSet()\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\tself.entities -&gt; select(entity : Entity | entity.references -&gt; isEmpty() and entity.subentities -&gt; isEmpty())\n\t\t\t\t-&gt; includesAll(\n\t\t\t\t\tSubEntity.allInstances() -&gt; collect(subEntity : SubEntity| subEntity.entity) -&gt; asSet()\n\t\t\t\t)\n\t\t\t\tendif\n\t\t' CannotHaveMoreThanOneEntityWithTheSameName='\n\t\t\tself.entities -&gt; collect(entity| entity.name.toLowerCase()) -&gt; asSet() -&gt; size() = self.entities -&gt; size()\n\t\t'"
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c3.mm.domain.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // DomainModel
