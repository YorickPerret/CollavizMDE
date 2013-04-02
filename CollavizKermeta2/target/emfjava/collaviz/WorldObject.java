/**
 */
package collaviz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.WorldObject#getPosition <em>Position</em>}</li>
 *   <li>{@link collaviz.WorldObject#getName <em>Name</em>}</li>
 *   <li>{@link collaviz.WorldObject#getColor <em>Color</em>}</li>
 *   <li>{@link collaviz.WorldObject#getSupported <em>Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getWorldObject()
 * @model abstract="true"
 * @generated
 */
public interface WorldObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Transform)
   * @see collaviz.CollavizPackage#getWorldObject_Position()
   * @model containment="true" required="true"
   * @generated
   */
  Transform getPosition();

  /**
   * Sets the value of the '{@link collaviz.WorldObject#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Transform value);

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
   * @see collaviz.CollavizPackage#getWorldObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link collaviz.WorldObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see collaviz.CollavizPackage#getWorldObject_Color()
   * @model containment="true" required="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link collaviz.WorldObject#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Supported</b></em>' reference list.
   * The list contents are of type {@link collaviz.SupportedObject}.
   * It is bidirectional and its opposite is '{@link collaviz.SupportedObject#getSupport <em>Support</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supported</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported</em>' reference list.
   * @see collaviz.CollavizPackage#getWorldObject_Supported()
   * @see collaviz.SupportedObject#getSupport
   * @model opposite="support"
   * @generated
   */
  EList<SupportedObject> getSupported();

} // WorldObject
