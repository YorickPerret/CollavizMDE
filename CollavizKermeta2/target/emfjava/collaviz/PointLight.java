/**
 */
package collaviz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.PointLight#getAttenuation <em>Attenuation</em>}</li>
 *   <li>{@link collaviz.PointLight#getTransform <em>Transform</em>}</li>
 *   <li>{@link collaviz.PointLight#getIsPickable <em>Is Pickable</em>}</li>
 *   <li>{@link collaviz.PointLight#getIsCullable <em>Is Cullable</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getPointLight()
 * @model
 * @generated
 */
public interface PointLight extends Light
{
  /**
   * Returns the value of the '<em><b>Attenuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attenuation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attenuation</em>' containment reference.
   * @see #setAttenuation(Vector3d)
   * @see collaviz.CollavizPackage#getPointLight_Attenuation()
   * @model containment="true" required="true"
   * @generated
   */
  Vector3d getAttenuation();

  /**
   * Sets the value of the '{@link collaviz.PointLight#getAttenuation <em>Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attenuation</em>' containment reference.
   * @see #getAttenuation()
   * @generated
   */
  void setAttenuation(Vector3d value);

  /**
   * Returns the value of the '<em><b>Transform</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transform</em>' containment reference.
   * @see #setTransform(Transform)
   * @see collaviz.CollavizPackage#getPointLight_Transform()
   * @model containment="true" required="true"
   * @generated
   */
  Transform getTransform();

  /**
   * Sets the value of the '{@link collaviz.PointLight#getTransform <em>Transform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transform</em>' containment reference.
   * @see #getTransform()
   * @generated
   */
  void setTransform(Transform value);

  /**
   * Returns the value of the '<em><b>Is Pickable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Pickable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Pickable</em>' attribute.
   * @see #setIsPickable(Boolean)
   * @see collaviz.CollavizPackage#getPointLight_IsPickable()
   * @model required="true"
   * @generated
   */
  Boolean getIsPickable();

  /**
   * Sets the value of the '{@link collaviz.PointLight#getIsPickable <em>Is Pickable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Pickable</em>' attribute.
   * @see #getIsPickable()
   * @generated
   */
  void setIsPickable(Boolean value);

  /**
   * Returns the value of the '<em><b>Is Cullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Cullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Cullable</em>' attribute.
   * @see #setIsCullable(Boolean)
   * @see collaviz.CollavizPackage#getPointLight_IsCullable()
   * @model required="true"
   * @generated
   */
  Boolean getIsCullable();

  /**
   * Sets the value of the '{@link collaviz.PointLight#getIsCullable <em>Is Cullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Cullable</em>' attribute.
   * @see #getIsCullable()
   * @generated
   */
  void setIsCullable(Boolean value);

} // PointLight
