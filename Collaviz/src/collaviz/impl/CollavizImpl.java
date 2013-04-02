/**
 */
package collaviz.impl;

import collaviz.Collaviz;
import collaviz.CollavizPackage;
import collaviz.Light;
import collaviz.WorldObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaviz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link collaviz.impl.CollavizImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link collaviz.impl.CollavizImpl#getLights <em>Lights</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollavizImpl extends EObjectImpl implements Collaviz {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<WorldObject> objects;

	/**
	 * The cached value of the '{@link #getLights() <em>Lights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights()
	 * @generated
	 * @ordered
	 */
	protected EList<Light> lights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollavizImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollavizPackage.Literals.COLLAVIZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorldObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<WorldObject>(WorldObject.class, this, CollavizPackage.COLLAVIZ__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Light> getLights() {
		if (lights == null) {
			lights = new EObjectContainmentEList<Light>(Light.class, this, CollavizPackage.COLLAVIZ__LIGHTS);
		}
		return lights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollavizPackage.COLLAVIZ__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case CollavizPackage.COLLAVIZ__LIGHTS:
				return ((InternalEList<?>)getLights()).basicRemove(otherEnd, msgs);
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
			case CollavizPackage.COLLAVIZ__OBJECTS:
				return getObjects();
			case CollavizPackage.COLLAVIZ__LIGHTS:
				return getLights();
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
			case CollavizPackage.COLLAVIZ__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends WorldObject>)newValue);
				return;
			case CollavizPackage.COLLAVIZ__LIGHTS:
				getLights().clear();
				getLights().addAll((Collection<? extends Light>)newValue);
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
			case CollavizPackage.COLLAVIZ__OBJECTS:
				getObjects().clear();
				return;
			case CollavizPackage.COLLAVIZ__LIGHTS:
				getLights().clear();
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
			case CollavizPackage.COLLAVIZ__OBJECTS:
				return objects != null && !objects.isEmpty();
			case CollavizPackage.COLLAVIZ__LIGHTS:
				return lights != null && !lights.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollavizImpl
