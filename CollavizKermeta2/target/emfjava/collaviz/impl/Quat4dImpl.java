/**
 */
package collaviz.impl;

import collaviz.CollavizPackage;
import collaviz.Quat4d;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quat4d</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.Quat4dImpl#getX <em>X</em>}</li>
 *   <li>{@link collaviz.impl.Quat4dImpl#getY <em>Y</em>}</li>
 *   <li>{@link collaviz.impl.Quat4dImpl#getZ <em>Z</em>}</li>
 *   <li>{@link collaviz.impl.Quat4dImpl#getW <em>W</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Quat4dImpl extends EObjectImpl implements Quat4d
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected static final int Z_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected int z = Z_EDEFAULT;

  /**
   * The default value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected static final int W_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected int w = W_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Quat4dImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CollavizPackage.Literals.QUAT4D;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.QUAT4D__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.QUAT4D__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(int newZ)
  {
    int oldZ = z;
    z = newZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.QUAT4D__Z, oldZ, z));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(int newW)
  {
    int oldW = w;
    w = newW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.QUAT4D__W, oldW, w));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CollavizPackage.QUAT4D__X:
        return getX();
      case CollavizPackage.QUAT4D__Y:
        return getY();
      case CollavizPackage.QUAT4D__Z:
        return getZ();
      case CollavizPackage.QUAT4D__W:
        return getW();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CollavizPackage.QUAT4D__X:
        setX((Integer)newValue);
        return;
      case CollavizPackage.QUAT4D__Y:
        setY((Integer)newValue);
        return;
      case CollavizPackage.QUAT4D__Z:
        setZ((Integer)newValue);
        return;
      case CollavizPackage.QUAT4D__W:
        setW((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CollavizPackage.QUAT4D__X:
        setX(X_EDEFAULT);
        return;
      case CollavizPackage.QUAT4D__Y:
        setY(Y_EDEFAULT);
        return;
      case CollavizPackage.QUAT4D__Z:
        setZ(Z_EDEFAULT);
        return;
      case CollavizPackage.QUAT4D__W:
        setW(W_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CollavizPackage.QUAT4D__X:
        return x != X_EDEFAULT;
      case CollavizPackage.QUAT4D__Y:
        return y != Y_EDEFAULT;
      case CollavizPackage.QUAT4D__Z:
        return z != Z_EDEFAULT;
      case CollavizPackage.QUAT4D__W:
        return w != W_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", z: ");
    result.append(z);
    result.append(", w: ");
    result.append(w);
    result.append(')');
    return result.toString();
  }

} //Quat4dImpl
