/**
 */
package collaviz.impl;

import collaviz.Ball;
import collaviz.CollavizPackage;
import collaviz.Juncture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Juncture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.JunctureImpl#getBeginBall <em>Begin Ball</em>}</li>
 *   <li>{@link collaviz.impl.JunctureImpl#getEndBall <em>End Ball</em>}</li>
 *   <li>{@link collaviz.impl.JunctureImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JunctureImpl extends DeformableObjectImpl implements Juncture {
	/**
	 * The cached value of the '{@link #getBeginBall() <em>Begin Ball</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginBall()
	 * @generated
	 * @ordered
	 */
	protected Ball beginBall;

	/**
	 * The cached value of the '{@link #getEndBall() <em>End Ball</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndBall()
	 * @generated
	 * @ordered
	 */
	protected Ball endBall;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Float RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected Float radius = RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunctureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollavizPackage.Literals.JUNCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ball getBeginBall() {
		if (beginBall != null && beginBall.eIsProxy()) {
			InternalEObject oldBeginBall = (InternalEObject)beginBall;
			beginBall = (Ball)eResolveProxy(oldBeginBall);
			if (beginBall != oldBeginBall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollavizPackage.JUNCTURE__BEGIN_BALL, oldBeginBall, beginBall));
			}
		}
		return beginBall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ball basicGetBeginBall() {
		return beginBall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginBall(Ball newBeginBall) {
		Ball oldBeginBall = beginBall;
		beginBall = newBeginBall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.JUNCTURE__BEGIN_BALL, oldBeginBall, beginBall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ball getEndBall() {
		if (endBall != null && endBall.eIsProxy()) {
			InternalEObject oldEndBall = (InternalEObject)endBall;
			endBall = (Ball)eResolveProxy(oldEndBall);
			if (endBall != oldEndBall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollavizPackage.JUNCTURE__END_BALL, oldEndBall, endBall));
			}
		}
		return endBall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ball basicGetEndBall() {
		return endBall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndBall(Ball newEndBall) {
		Ball oldEndBall = endBall;
		endBall = newEndBall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.JUNCTURE__END_BALL, oldEndBall, endBall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(Float newRadius) {
		Float oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollavizPackage.JUNCTURE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollavizPackage.JUNCTURE__BEGIN_BALL:
				if (resolve) return getBeginBall();
				return basicGetBeginBall();
			case CollavizPackage.JUNCTURE__END_BALL:
				if (resolve) return getEndBall();
				return basicGetEndBall();
			case CollavizPackage.JUNCTURE__RADIUS:
				return getRadius();
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
			case CollavizPackage.JUNCTURE__BEGIN_BALL:
				setBeginBall((Ball)newValue);
				return;
			case CollavizPackage.JUNCTURE__END_BALL:
				setEndBall((Ball)newValue);
				return;
			case CollavizPackage.JUNCTURE__RADIUS:
				setRadius((Float)newValue);
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
			case CollavizPackage.JUNCTURE__BEGIN_BALL:
				setBeginBall((Ball)null);
				return;
			case CollavizPackage.JUNCTURE__END_BALL:
				setEndBall((Ball)null);
				return;
			case CollavizPackage.JUNCTURE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
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
			case CollavizPackage.JUNCTURE__BEGIN_BALL:
				return beginBall != null;
			case CollavizPackage.JUNCTURE__END_BALL:
				return endBall != null;
			case CollavizPackage.JUNCTURE__RADIUS:
				return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //JunctureImpl
