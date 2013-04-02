/**
 */
package collaviz.impl;

import collaviz.Ball;
import collaviz.CollavizPackage;
import collaviz.Juncture;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ball</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.BallImpl#getJunctures <em>Junctures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BallImpl extends SupportedObjectImpl implements Ball {
	/**
	 * The cached value of the '{@link #getJunctures() <em>Junctures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJunctures()
	 * @generated
	 * @ordered
	 */
	protected EList<Juncture> junctures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollavizPackage.Literals.BALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Juncture> getJunctures() {
		if (junctures == null) {
			junctures = new EObjectResolvingEList<Juncture>(Juncture.class, this, CollavizPackage.BALL__JUNCTURES);
		}
		return junctures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollavizPackage.BALL__JUNCTURES:
				return getJunctures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollavizPackage.BALL__JUNCTURES:
				getJunctures().clear();
				getJunctures().addAll((Collection<? extends Juncture>)newValue);
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
			case CollavizPackage.BALL__JUNCTURES:
				getJunctures().clear();
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
			case CollavizPackage.BALL__JUNCTURES:
				return junctures != null && !junctures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BallImpl
