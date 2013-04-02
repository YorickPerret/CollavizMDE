/**
 */
package collaviz.impl;

import collaviz.CollavizPackage;
import collaviz.SupportedObject;
import collaviz.Transform;
import collaviz.WorldObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.SupportedObjectImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link collaviz.impl.SupportedObjectImpl#getSupport <em>Support</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SupportedObjectImpl extends WorldObjectImpl implements SupportedObject
{
  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected Transform offset;

  /**
   * The cached value of the '{@link #getSupport() <em>Support</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupport()
   * @generated
   * @ordered
   */
  protected WorldObject support;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SupportedObjectImpl()
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
    return CollavizPackage.Literals.SUPPORTED_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transform getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOffset(Transform newOffset, NotificationChain msgs)
  {
    Transform oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.SUPPORTED_OBJECT__OFFSET, oldOffset, newOffset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset(Transform newOffset)
  {
    if (newOffset != offset)
    {
      NotificationChain msgs = null;
      if (offset != null)
        msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.SUPPORTED_OBJECT__OFFSET, null, msgs);
      if (newOffset != null)
        msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.SUPPORTED_OBJECT__OFFSET, null, msgs);
      msgs = basicSetOffset(newOffset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.SUPPORTED_OBJECT__OFFSET, newOffset, newOffset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorldObject getSupport()
  {
    if (support != null && support.eIsProxy())
    {
      InternalEObject oldSupport = (InternalEObject)support;
      support = (WorldObject)eResolveProxy(oldSupport);
      if (support != oldSupport)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollavizPackage.SUPPORTED_OBJECT__SUPPORT, oldSupport, support));
      }
    }
    return support;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorldObject basicGetSupport()
  {
    return support;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSupport(WorldObject newSupport, NotificationChain msgs)
  {
    WorldObject oldSupport = support;
    support = newSupport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.SUPPORTED_OBJECT__SUPPORT, oldSupport, newSupport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupport(WorldObject newSupport)
  {
    if (newSupport != support)
    {
      NotificationChain msgs = null;
      if (support != null)
        msgs = ((InternalEObject)support).eInverseRemove(this, CollavizPackage.WORLD_OBJECT__SUPPORTED, WorldObject.class, msgs);
      if (newSupport != null)
        msgs = ((InternalEObject)newSupport).eInverseAdd(this, CollavizPackage.WORLD_OBJECT__SUPPORTED, WorldObject.class, msgs);
      msgs = basicSetSupport(newSupport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.SUPPORTED_OBJECT__SUPPORT, newSupport, newSupport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CollavizPackage.SUPPORTED_OBJECT__SUPPORT:
        if (support != null)
          msgs = ((InternalEObject)support).eInverseRemove(this, CollavizPackage.WORLD_OBJECT__SUPPORTED, WorldObject.class, msgs);
        return basicSetSupport((WorldObject)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case CollavizPackage.SUPPORTED_OBJECT__OFFSET:
        return basicSetOffset(null, msgs);
      case CollavizPackage.SUPPORTED_OBJECT__SUPPORT:
        return basicSetSupport(null, msgs);
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
      case CollavizPackage.SUPPORTED_OBJECT__OFFSET:
        return getOffset();
      case CollavizPackage.SUPPORTED_OBJECT__SUPPORT:
        if (resolve) return getSupport();
        return basicGetSupport();
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
      case CollavizPackage.SUPPORTED_OBJECT__OFFSET:
        setOffset((Transform)newValue);
        return;
      case CollavizPackage.SUPPORTED_OBJECT__SUPPORT:
        setSupport((WorldObject)newValue);
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
      case CollavizPackage.SUPPORTED_OBJECT__OFFSET:
        setOffset((Transform)null);
        return;
      case CollavizPackage.SUPPORTED_OBJECT__SUPPORT:
        setSupport((WorldObject)null);
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
      case CollavizPackage.SUPPORTED_OBJECT__OFFSET:
        return offset != null;
      case CollavizPackage.SUPPORTED_OBJECT__SUPPORT:
        return support != null;
    }
    return super.eIsSet(featureID);
  }

} //SupportedObjectImpl
