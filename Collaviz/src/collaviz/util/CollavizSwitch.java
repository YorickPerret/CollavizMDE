/**
 */
package collaviz.util;

import collaviz.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see collaviz.CollavizPackage
 * @generated
 */
public class CollavizSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollavizPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollavizSwitch() {
		if (modelPackage == null) {
			modelPackage = CollavizPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CollavizPackage.WORLD_OBJECT: {
				WorldObject worldObject = (WorldObject)theEObject;
				T result = caseWorldObject(worldObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.JUNCTURE: {
				Juncture juncture = (Juncture)theEObject;
				T result = caseJuncture(juncture);
				if (result == null) result = caseDeformableObject(juncture);
				if (result == null) result = caseSupportedObject(juncture);
				if (result == null) result = caseWorldObject(juncture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.BALL: {
				Ball ball = (Ball)theEObject;
				T result = caseBall(ball);
				if (result == null) result = caseSupportedObject(ball);
				if (result == null) result = caseWorldObject(ball);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.QUAT4D: {
				Quat4d quat4d = (Quat4d)theEObject;
				T result = caseQuat4d(quat4d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.VECTOR3D: {
				Vector3d vector3d = (Vector3d)theEObject;
				T result = caseVector3d(vector3d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.TRANSFORM: {
				Transform transform = (Transform)theEObject;
				T result = caseTransform(transform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.SUPPORTED_OBJECT: {
				SupportedObject supportedObject = (SupportedObject)theEObject;
				T result = caseSupportedObject(supportedObject);
				if (result == null) result = caseWorldObject(supportedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.COLLAVIZ: {
				Collaviz collaviz = (Collaviz)theEObject;
				T result = caseCollaviz(collaviz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.COLOR: {
				Color color = (Color)theEObject;
				T result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.LIGHT: {
				Light light = (Light)theEObject;
				T result = caseLight(light);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.DIRECTIONAL_LIGHT: {
				DirectionalLight directionalLight = (DirectionalLight)theEObject;
				T result = caseDirectionalLight(directionalLight);
				if (result == null) result = caseLight(directionalLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.POINT_LIGHT: {
				PointLight pointLight = (PointLight)theEObject;
				T result = casePointLight(pointLight);
				if (result == null) result = caseLight(pointLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollavizPackage.DEFORMABLE_OBJECT: {
				DeformableObject deformableObject = (DeformableObject)theEObject;
				T result = caseDeformableObject(deformableObject);
				if (result == null) result = caseSupportedObject(deformableObject);
				if (result == null) result = caseWorldObject(deformableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldObject(WorldObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Juncture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Juncture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJuncture(Juncture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ball</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ball</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBall(Ball object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quat4d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quat4d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuat4d(Quat4d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector3d(Vector3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransform(Transform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedObject(SupportedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaviz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaviz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaviz(Collaviz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLight(Light object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directional Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directional Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionalLight(DirectionalLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointLight(PointLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deformable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deformable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeformableObject(DeformableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CollavizSwitch
