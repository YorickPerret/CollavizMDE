/**
 */
package collaviz.impl;

import collaviz.CollavizPackage;
import collaviz.Quat4d;
import collaviz.Transform;
import collaviz.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.TransformImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link collaviz.impl.TransformImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link collaviz.impl.TransformImpl#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformImpl extends EObjectImpl implements Transform
{
  /**
   * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslation()
   * @generated
   * @ordered
   */
  protected Vector3d translation;

  /**
   * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotation()
   * @generated
   * @ordered
   */
  protected Quat4d rotation;

  /**
   * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
  protected Vector3d scale;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformImpl()
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
    return CollavizPackage.Literals.TRANSFORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector3d getTranslation()
  {
    return translation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTranslation(Vector3d newTranslation, NotificationChain msgs)
  {
    Vector3d oldTranslation = translation;
    translation = newTranslation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.TRANSFORM__TRANSLATION, oldTranslation, newTranslation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTranslation(Vector3d newTranslation)
  {
    if (newTranslation != translation)
    {
      NotificationChain msgs = null;
      if (translation != null)
        msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.TRANSFORM__TRANSLATION, null, msgs);
      if (newTranslation != null)
        msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.TRANSFORM__TRANSLATION, null, msgs);
      msgs = basicSetTranslation(newTranslation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.TRANSFORM__TRANSLATION, newTranslation, newTranslation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quat4d getRotation()
  {
    return rotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotation(Quat4d newRotation, NotificationChain msgs)
  {
    Quat4d oldRotation = rotation;
    rotation = newRotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.TRANSFORM__ROTATION, oldRotation, newRotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotation(Quat4d newRotation)
  {
    if (newRotation != rotation)
    {
      NotificationChain msgs = null;
      if (rotation != null)
        msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.TRANSFORM__ROTATION, null, msgs);
      if (newRotation != null)
        msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.TRANSFORM__ROTATION, null, msgs);
      msgs = basicSetRotation(newRotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.TRANSFORM__ROTATION, newRotation, newRotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector3d getScale()
  {
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScale(Vector3d newScale, NotificationChain msgs)
  {
    Vector3d oldScale = scale;
    scale = newScale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.TRANSFORM__SCALE, oldScale, newScale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScale(Vector3d newScale)
  {
    if (newScale != scale)
    {
      NotificationChain msgs = null;
      if (scale != null)
        msgs = ((InternalEObject)scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.TRANSFORM__SCALE, null, msgs);
      if (newScale != null)
        msgs = ((InternalEObject)newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.TRANSFORM__SCALE, null, msgs);
      msgs = basicSetScale(newScale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.TRANSFORM__SCALE, newScale, newScale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CollavizPackage.TRANSFORM__TRANSLATION:
        return basicSetTranslation(null, msgs);
      case CollavizPackage.TRANSFORM__ROTATION:
        return basicSetRotation(null, msgs);
      case CollavizPackage.TRANSFORM__SCALE:
        return basicSetScale(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CollavizPackage.TRANSFORM__TRANSLATION:
        return getTranslation();
      case CollavizPackage.TRANSFORM__ROTATION:
        return getRotation();
      case CollavizPackage.TRANSFORM__SCALE:
        return getScale();
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
      case CollavizPackage.TRANSFORM__TRANSLATION:
        setTranslation((Vector3d)newValue);
        return;
      case CollavizPackage.TRANSFORM__ROTATION:
        setRotation((Quat4d)newValue);
        return;
      case CollavizPackage.TRANSFORM__SCALE:
        setScale((Vector3d)newValue);
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
      case CollavizPackage.TRANSFORM__TRANSLATION:
        setTranslation((Vector3d)null);
        return;
      case CollavizPackage.TRANSFORM__ROTATION:
        setRotation((Quat4d)null);
        return;
      case CollavizPackage.TRANSFORM__SCALE:
        setScale((Vector3d)null);
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
      case CollavizPackage.TRANSFORM__TRANSLATION:
        return translation != null;
      case CollavizPackage.TRANSFORM__ROTATION:
        return rotation != null;
      case CollavizPackage.TRANSFORM__SCALE:
        return scale != null;
    }
    return super.eIsSet(featureID);
  }

} //TransformImpl
