/**
 */
package collaviz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.SupportedObject#getOffset <em>Offset</em>}</li>
 *   <li>{@link collaviz.SupportedObject#getSupport <em>Support</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getSupportedObject()
 * @model abstract="true"
 * @generated
 */
public interface SupportedObject extends WorldObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Transform)
	 * @see collaviz.CollavizPackage#getSupportedObject_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transform getOffset();

	/**
	 * Sets the value of the '{@link collaviz.SupportedObject#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Transform value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link collaviz.WorldObject#getSupported <em>Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' reference.
	 * @see #setSupport(WorldObject)
	 * @see collaviz.CollavizPackage#getSupportedObject_Support()
	 * @see collaviz.WorldObject#getSupported
	 * @model opposite="supported" required="true"
	 * @generated
	 */
	WorldObject getSupport();

	/**
	 * Sets the value of the '{@link collaviz.SupportedObject#getSupport <em>Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' reference.
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(WorldObject value);

} // SupportedObject
