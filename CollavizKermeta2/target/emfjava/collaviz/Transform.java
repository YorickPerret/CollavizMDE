/**
 */
package collaviz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.Transform#getTranslation <em>Translation</em>}</li>
 *   <li>{@link collaviz.Transform#getRotation <em>Rotation</em>}</li>
 *   <li>{@link collaviz.Transform#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getTransform()
 * @model
 * @generated
 */
public interface Transform extends EObject
{
  /**
   * Returns the value of the '<em><b>Translation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translation</em>' containment reference.
   * @see #setTranslation(Vector3d)
   * @see collaviz.CollavizPackage#getTransform_Translation()
   * @model containment="true" required="true"
   * @generated
   */
  Vector3d getTranslation();

  /**
   * Sets the value of the '{@link collaviz.Transform#getTranslation <em>Translation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Translation</em>' containment reference.
   * @see #getTranslation()
   * @generated
   */
  void setTranslation(Vector3d value);

  /**
   * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' containment reference.
   * @see #setRotation(Quat4d)
   * @see collaviz.CollavizPackage#getTransform_Rotation()
   * @model containment="true" required="true"
   * @generated
   */
  Quat4d getRotation();

  /**
   * Sets the value of the '{@link collaviz.Transform#getRotation <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' containment reference.
   * @see #getRotation()
   * @generated
   */
  void setRotation(Quat4d value);

  /**
   * Returns the value of the '<em><b>Scale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' containment reference.
   * @see #setScale(Vector3d)
   * @see collaviz.CollavizPackage#getTransform_Scale()
   * @model containment="true" required="true"
   * @generated
   */
  Vector3d getScale();

  /**
   * Sets the value of the '{@link collaviz.Transform#getScale <em>Scale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' containment reference.
   * @see #getScale()
   * @generated
   */
  void setScale(Vector3d value);

} // Transform
