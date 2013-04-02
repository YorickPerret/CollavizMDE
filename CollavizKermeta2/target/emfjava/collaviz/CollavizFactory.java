/**
 */
package collaviz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see collaviz.CollavizPackage
 * @generated
 */
public interface CollavizFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CollavizFactory eINSTANCE = collaviz.impl.CollavizFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Juncture</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Juncture</em>'.
   * @generated
   */
  Juncture createJuncture();

  /**
   * Returns a new object of class '<em>Ball</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ball</em>'.
   * @generated
   */
  Ball createBall();

  /**
   * Returns a new object of class '<em>Quat4d</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quat4d</em>'.
   * @generated
   */
  Quat4d createQuat4d();

  /**
   * Returns a new object of class '<em>Vector3d</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector3d</em>'.
   * @generated
   */
  Vector3d createVector3d();

  /**
   * Returns a new object of class '<em>Transform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transform</em>'.
   * @generated
   */
  Transform createTransform();

  /**
   * Returns a new object of class '<em>Collaviz</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collaviz</em>'.
   * @generated
   */
  Collaviz createCollaviz();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Directional Light</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directional Light</em>'.
   * @generated
   */
  DirectionalLight createDirectionalLight();

  /**
   * Returns a new object of class '<em>Point Light</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point Light</em>'.
   * @generated
   */
  PointLight createPointLight();

  /**
   * Returns a new object of class '<em>Deformable Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deformable Object</em>'.
   * @generated
   */
  DeformableObject createDeformableObject();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CollavizPackage getCollavizPackage();

} //CollavizFactory
