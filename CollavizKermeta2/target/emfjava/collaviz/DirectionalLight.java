/**
 */
package collaviz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directional Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.DirectionalLight#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getDirectionalLight()
 * @model
 * @generated
 */
public interface DirectionalLight extends Light
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' containment reference.
   * @see #setDirection(Vector3d)
   * @see collaviz.CollavizPackage#getDirectionalLight_Direction()
   * @model containment="true" required="true"
   * @generated
   */
  Vector3d getDirection();

  /**
   * Sets the value of the '{@link collaviz.DirectionalLight#getDirection <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' containment reference.
   * @see #getDirection()
   * @generated
   */
  void setDirection(Vector3d value);

} // DirectionalLight
