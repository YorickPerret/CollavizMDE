/**
 */
package collaviz.impl;

import collaviz.CollavizPackage;
import collaviz.Color;
import collaviz.Light;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.LightImpl#getLightColor <em>Light Color</em>}</li>
 *   <li>{@link collaviz.impl.LightImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link collaviz.impl.LightImpl#getIsOn <em>Is On</em>}</li>
 *   <li>{@link collaviz.impl.LightImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LightImpl extends EObjectImpl implements Light {
	/**
	 * The cached value of the '{@link #getLightColor() <em>Light Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightColor()
	 * @generated
	 * @ordered
	 */
	protected Color lightColor;

	/**
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected String geometry = GEOMETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsOn() <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOn() <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOn()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOn = IS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollavizPackage.Literals.LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getLightColor() {
		return lightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightColor(Color newLightColor, NotificationChain msgs) {
		Color oldLightColor = lightColor;
		lightColor = newLightColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollavizPackage.LIGHT__LIGHT_COLOR, oldLightColor, newLightColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightColor(Color newLightColor) {
		if (newLightColor != lightColor) {
			NotificationChain msgs = null;
			if (lightColor != null)
				msgs = ((InternalEObject)lightColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.LIGHT__LIGHT_COLOR, null, msgs);
			if (newLightColor != null)
				msgs = ((InternalEObject)newLightColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollavizPackage.LIGHT__LIGHT_COLOR, null, msgs);
			msgs = basicSetLightColor(newLightColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.LIGHT__LIGHT_COLOR, newLightColor, newLightColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		String oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.LIGHT__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOn() {
		return isOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOn(Boolean newIsOn) {
		Boolean oldIsOn = isOn;
		isOn = newIsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.LIGHT__IS_ON, oldIsOn, isOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.LIGHT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollavizPackage.LIGHT__LIGHT_COLOR:
				return basicSetLightColor(null, msgs);
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
			case CollavizPackage.LIGHT__LIGHT_COLOR:
				return getLightColor();
			case CollavizPackage.LIGHT__GEOMETRY:
				return getGeometry();
			case CollavizPackage.LIGHT__IS_ON:
				return getIsOn();
			case CollavizPackage.LIGHT__NAME:
				return getName();
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
			case CollavizPackage.LIGHT__LIGHT_COLOR:
				setLightColor((Color)newValue);
				return;
			case CollavizPackage.LIGHT__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case CollavizPackage.LIGHT__IS_ON:
				setIsOn((Boolean)newValue);
				return;
			case CollavizPackage.LIGHT__NAME:
				setName((String)newValue);
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
			case CollavizPackage.LIGHT__LIGHT_COLOR:
				setLightColor((Color)null);
				return;
			case CollavizPackage.LIGHT__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case CollavizPackage.LIGHT__IS_ON:
				setIsOn(IS_ON_EDEFAULT);
				return;
			case CollavizPackage.LIGHT__NAME:
				setName(NAME_EDEFAULT);
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
			case CollavizPackage.LIGHT__LIGHT_COLOR:
				return lightColor != null;
			case CollavizPackage.LIGHT__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case CollavizPackage.LIGHT__IS_ON:
				return IS_ON_EDEFAULT == null ? isOn != null : !IS_ON_EDEFAULT.equals(isOn);
			case CollavizPackage.LIGHT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (geometry: ");
		result.append(geometry);
		result.append(", IsOn: ");
		result.append(isOn);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LightImpl
