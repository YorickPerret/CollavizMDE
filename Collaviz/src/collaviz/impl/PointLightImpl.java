/**
 */
package collaviz.impl;

import collaviz.CollavizPackage;
import collaviz.PointLight;
import collaviz.Transform;
import collaviz.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.PointLightImpl#getAttenuation <em>Attenuation</em>}</li>
 *   <li>{@link collaviz.impl.PointLightImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link collaviz.impl.PointLightImpl#getIsPickable <em>Is Pickable</em>}</li>
 *   <li>{@link collaviz.impl.PointLightImpl#getIsCullable <em>Is Cullable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointLightImpl extends LightImpl implements PointLight {
	/**
	 * The cached value of the '{@link #getAttenuation() <em>Attenuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttenuation()
	 * @generated
	 * @ordered
	 */
	protected Vector3d attenuation;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Transform transform;

	/**
	 * The default value of the '{@link #getIsPickable() <em>Is Pickable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPickable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PICKABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPickable() <em>Is Pickable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPickable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPickable = IS_PICKABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsCullable() <em>Is Cullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCullable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CULLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCullable() <em>Is Cullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCullable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCullable = IS_CULLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollavizPackage.Literals.POINT_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d getAttenuation() {
		return attenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttenuation(Vector3d newAttenuation, NotificationChain msgs) {
		Vector3d oldAttenuation = attenuation;
		attenuation = newAttenuation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.POINT_LIGHT__ATTENUATION, oldAttenuation, newAttenuation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttenuation(Vector3d newAttenuation) {
		if (newAttenuation != attenuation) {
			NotificationChain msgs = null;
			if (attenuation != null)
				msgs = ((InternalEObject)attenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.POINT_LIGHT__ATTENUATION, null, msgs);
			if (newAttenuation != null)
				msgs = ((InternalEObject)newAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.POINT_LIGHT__ATTENUATION, null, msgs);
			msgs = basicSetAttenuation(newAttenuation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.POINT_LIGHT__ATTENUATION, newAttenuation, newAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Transform newTransform, NotificationChain msgs) {
		Transform oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.POINT_LIGHT__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Transform newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.POINT_LIGHT__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.POINT_LIGHT__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.POINT_LIGHT__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPickable() {
		return isPickable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPickable(Boolean newIsPickable) {
		Boolean oldIsPickable = isPickable;
		isPickable = newIsPickable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.POINT_LIGHT__IS_PICKABLE, oldIsPickable, isPickable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCullable() {
		return isCullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCullable(Boolean newIsCullable) {
		Boolean oldIsCullable = isCullable;
		isCullable = newIsCullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.POINT_LIGHT__IS_CULLABLE, oldIsCullable, isCullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollavizPackage.POINT_LIGHT__ATTENUATION:
				return basicSetAttenuation(null, msgs);
			case CollavizPackage.POINT_LIGHT__TRANSFORM:
				return basicSetTransform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollavizPackage.POINT_LIGHT__ATTENUATION:
				return getAttenuation();
			case CollavizPackage.POINT_LIGHT__TRANSFORM:
				return getTransform();
			case CollavizPackage.POINT_LIGHT__IS_PICKABLE:
				return getIsPickable();
			case CollavizPackage.POINT_LIGHT__IS_CULLABLE:
				return getIsCullable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollavizPackage.POINT_LIGHT__ATTENUATION:
				setAttenuation((Vector3d)newValue);
				return;
			case CollavizPackage.POINT_LIGHT__TRANSFORM:
				setTransform((Transform)newValue);
				return;
			case CollavizPackage.POINT_LIGHT__IS_PICKABLE:
				setIsPickable((Boolean)newValue);
				return;
			case CollavizPackage.POINT_LIGHT__IS_CULLABLE:
				setIsCullable((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CollavizPackage.POINT_LIGHT__ATTENUATION:
				setAttenuation((Vector3d)null);
				return;
			case CollavizPackage.POINT_LIGHT__TRANSFORM:
				setTransform((Transform)null);
				return;
			case CollavizPackage.POINT_LIGHT__IS_PICKABLE:
				setIsPickable(IS_PICKABLE_EDEFAULT);
				return;
			case CollavizPackage.POINT_LIGHT__IS_CULLABLE:
				setIsCullable(IS_CULLABLE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CollavizPackage.POINT_LIGHT__ATTENUATION:
				return attenuation != null;
			case CollavizPackage.POINT_LIGHT__TRANSFORM:
				return transform != null;
			case CollavizPackage.POINT_LIGHT__IS_PICKABLE:
				return IS_PICKABLE_EDEFAULT == null ? isPickable != null : !IS_PICKABLE_EDEFAULT.equals(isPickable);
			case CollavizPackage.POINT_LIGHT__IS_CULLABLE:
				return IS_CULLABLE_EDEFAULT == null ? isCullable != null : !IS_CULLABLE_EDEFAULT.equals(isCullable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IsPickable: ");
		result.append(isPickable);
		result.append(", IsCullable: ");
		result.append(isCullable);
		result.append(')');
		return result.toString();
	}

} //PointLightImpl
