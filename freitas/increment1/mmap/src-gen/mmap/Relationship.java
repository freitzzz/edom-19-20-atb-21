/**
 */
package mmap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmap.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link mmap.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link mmap.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mmap.MmapPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends MapElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DEPENDENCY"</code>.
	 * The literals are from the enumeration {@link mmap.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mmap.Type
	 * @see #setType(Type)
	 * @see mmap.MmapPackage#getRelationship_Type()
	 * @model default="DEPENDENCY"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link mmap.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mmap.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Topic)
	 * @see mmap.MmapPackage#getRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	Topic getSource();

	/**
	 * Sets the value of the '{@link mmap.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Topic value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Topic)
	 * @see mmap.MmapPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	Topic getTarget();

	/**
	 * Sets the value of the '{@link mmap.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Topic value);

} // Relationship
