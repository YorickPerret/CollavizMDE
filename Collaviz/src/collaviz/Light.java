/**
 */
package collaviz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.Light#getLightColor <em>Light Color</em>}</li>
 *   <li>{@link collaviz.Light#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link collaviz.Light#getIsOn <em>Is On</em>}</li>
 *   <li>{@link collaviz.Light#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getLight()
 * @model abstract="true"
 * @generated
 */
public interface Light extends EObject {
	/**
	 * Returns the value of the '<em><b>Light Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Color</em>' containment reference.
	 * @see #setLightColor(Color)
	 * @see collaviz.CollavizPackage#getLight_LightColor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Color getLightColor();

	/**
	 * Sets the value of the '{@link collaviz.Light#getLightColor <em>Light Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Color</em>' containment reference.
	 * @see #getLightColor()
	 * @generated
	 */
	void setLightColor(Color value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see collaviz.CollavizPackage#getLight_Geometry()
	 * @model required="true"
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link collaviz.Light#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is On</em>' attribute.
	 * @see #setIsOn(Boolean)
	 * @see collaviz.CollavizPackage#getLight_IsOn()
	 * @model required="true"
	 * @generated
	 */
	Boolean getIsOn();

	/**
	 * Sets the value of the '{@link collaviz.Light#getIsOn <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is On</em>' attribute.
	 * @see #getIsOn()
	 * @generated
	 */
	void setIsOn(Boolean value);

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
	 * @see collaviz.CollavizPackage#getLight_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link collaviz.Light#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Light
