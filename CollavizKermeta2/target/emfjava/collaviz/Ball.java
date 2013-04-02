/**
 */
package collaviz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ball</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link collaviz.Ball#getJunctures <em>Junctures</em>}</li>
 * </ul>
 * </p>
 *
 * @see collaviz.CollavizPackage#getBall()
 * @model
 * @generated
 */
public interface Ball extends SupportedObject
{
  /**
   * Returns the value of the '<em><b>Junctures</b></em>' reference list.
   * The list contents are of type {@link collaviz.Juncture}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Junctures</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junctures</em>' reference list.
   * @see collaviz.CollavizPackage#getBall_Junctures()
   * @model
   * @generated
   */
  EList<Juncture> getJunctures();

} // Ball
