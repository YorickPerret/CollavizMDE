/**
 */
package collaviz.util;

import collaviz.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see collaviz.CollavizPackage
 * @generated
 */
public class CollavizAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CollavizPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollavizAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CollavizPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollavizSwitch<Adapter> modelSwitch =
    new CollavizSwitch<Adapter>()
    {
      @Override
      public Adapter caseWorldObject(WorldObject object)
      {
        return createWorldObjectAdapter();
      }
      @Override
      public Adapter caseJuncture(Juncture object)
      {
        return createJunctureAdapter();
      }
      @Override
      public Adapter caseBall(Ball object)
      {
        return createBallAdapter();
      }
      @Override
      public Adapter caseQuat4d(Quat4d object)
      {
        return createQuat4dAdapter();
      }
      @Override
      public Adapter caseVector3d(Vector3d object)
      {
        return createVector3dAdapter();
      }
      @Override
      public Adapter caseTransform(Transform object)
      {
        return createTransformAdapter();
      }
      @Override
      public Adapter caseSupportedObject(SupportedObject object)
      {
        return createSupportedObjectAdapter();
      }
      @Override
      public Adapter caseCollaviz(Collaviz object)
      {
        return createCollavizAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseLight(Light object)
      {
        return createLightAdapter();
      }
      @Override
      public Adapter caseDirectionalLight(DirectionalLight object)
      {
        return createDirectionalLightAdapter();
      }
      @Override
      public Adapter casePointLight(PointLight object)
      {
        return createPointLightAdapter();
      }
      @Override
      public Adapter caseDeformableObject(DeformableObject object)
      {
        return createDeformableObjectAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link collaviz.WorldObject <em>World Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.WorldObject
   * @generated
   */
  public Adapter createWorldObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Juncture <em>Juncture</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Juncture
   * @generated
   */
  public Adapter createJunctureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Ball <em>Ball</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Ball
   * @generated
   */
  public Adapter createBallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Quat4d <em>Quat4d</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Quat4d
   * @generated
   */
  public Adapter createQuat4dAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Vector3d <em>Vector3d</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Vector3d
   * @generated
   */
  public Adapter createVector3dAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Transform <em>Transform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Transform
   * @generated
   */
  public Adapter createTransformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.SupportedObject <em>Supported Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.SupportedObject
   * @generated
   */
  public Adapter createSupportedObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Collaviz <em>Collaviz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Collaviz
   * @generated
   */
  public Adapter createCollavizAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.Light <em>Light</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.Light
   * @generated
   */
  public Adapter createLightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.DirectionalLight <em>Directional Light</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.DirectionalLight
   * @generated
   */
  public Adapter createDirectionalLightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.PointLight <em>Point Light</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.PointLight
   * @generated
   */
  public Adapter createPointLightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link collaviz.DeformableObject <em>Deformable Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see collaviz.DeformableObject
   * @generated
   */
  public Adapter createDeformableObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CollavizAdapterFactory
