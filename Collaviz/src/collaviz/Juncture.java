/**
 */
package collaviz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Juncture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.Juncture#getBeginBall <em>Begin Ball</em>}</li>
 *   <li>{@link collaviz.Juncture#getEndBall <em>End Ball</em>}</li>
 *   <li>{@link collaviz.Juncture#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getJuncture()
 * @model
 * @generated
 */
public interface Juncture extends DeformableObject {
	/**
	 * Returns the value of the '<em><b>Begin Ball</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Ball</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Ball</em>' reference.
	 * @see #setBeginBall(Ball)
	 * @see collaviz.CollavizPackage#getJuncture_BeginBall()
	 * @model required="true"
	 * @generated
	 */
	Ball getBeginBall();

	/**
	 * Sets the value of the '{@link collaviz.Juncture#getBeginBall <em>Begin Ball</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Ball</em>' reference.
	 * @see #getBeginBall()
	 * @generated
	 */
	void setBeginBall(Ball value);

	/**
	 * Returns the value of the '<em><b>End Ball</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Ball</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Ball</em>' reference.
	 * @see #setEndBall(Ball)
	 * @see collaviz.CollavizPackage#getJuncture_EndBall()
	 * @model required="true"
	 * @generated
	 */
	Ball getEndBall();

	/**
	 * Sets the value of the '{@link collaviz.Juncture#getEndBall <em>End Ball</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Ball</em>' reference.
	 * @see #getEndBall()
	 * @generated
	 */
	void setEndBall(Ball value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(Float)
	 * @see collaviz.CollavizPackage#getJuncture_Radius()
	 * @model required="true"
	 * @generated
	 */
	Float getRadius();

	/**
	 * Sets the value of the '{@link collaviz.Juncture#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Float value);

} // Juncture
