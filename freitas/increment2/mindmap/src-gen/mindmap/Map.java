/**
 */
package mindmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindmap.Map#getTitle <em>Title</em>}</li>
 *   <li>{@link mindmap.Map#getElements <em>Elements</em>}</li>
 *   <li>{@link mindmap.Map#getRootTopics <em>Root Topics</em>}</li>
 * </ul>
 *
 * @see mindmap.MindmapPackage#getMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveTitle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveTitle='not title.oclIsUndefined()'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see mindmap.MindmapPackage#getMap_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link mindmap.Map#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mindmap.MapElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see mindmap.MindmapPackage#getMap_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapElement> getElements();

	/**
	 * Returns the value of the '<em><b>Root Topics</b></em>' reference list.
	 * The list contents are of type {@link mindmap.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Topics</em>' reference list.
	 * @see mindmap.MindmapPackage#getMap_RootTopics()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let topics : Set(mindmap::Topic) =\n            \tself.elements-&gt;select(oclIsKindOf(mindmap::Topic))-&gt;collect(oclAsType(mindmap::Topic))-&gt;asSet() in\n     \t\t\t\ttopics-&gt;asOrderedSet()-&gt;symmetricDifference(topics.subtopics-&gt;asSet())-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Topic> getRootTopics();

} // Map
