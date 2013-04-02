/**
 */
package collaviz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaviz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.Collaviz#getObjects <em>Objects</em>}</li>
 *   <li>{@link collaviz.Collaviz#getLights <em>Lights</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getCollaviz()
 * @model
 * @generated
 */
public interface Collaviz extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link collaviz.WorldObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see collaviz.CollavizPackage#getCollaviz_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorldObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Lights</b></em>' containment reference list.
	 * The list contents are of type {@link collaviz.Light}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights</em>' containment reference list.
	 * @see collaviz.CollavizPackage#getCollaviz_Lights()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Light> getLights();

} // Collaviz
