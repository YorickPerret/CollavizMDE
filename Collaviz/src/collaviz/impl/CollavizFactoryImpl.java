/**
 */
package collaviz.impl;

import collaviz.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollavizFactoryImpl extends EFactoryImpl implements CollavizFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollavizFactory init() {
		try {
			CollavizFactory theCollavizFactory = (CollavizFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/Collaviz/model/Collaviz/collaviz.ecore"); 
			if (theCollavizFactory != null) {
				return theCollavizFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollavizFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollavizFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CollavizPackage.JUNCTURE: return createJuncture();
			case CollavizPackage.BALL: return createBall();
			case CollavizPackage.QUAT4D: return createQuat4d();
			case CollavizPackage.VECTOR3D: return createVector3d();
			case CollavizPackage.TRANSFORM: return createTransform();
			case CollavizPackage.COLLAVIZ: return createCollaviz();
			case CollavizPackage.COLOR: return createColor();
			case CollavizPackage.DIRECTIONAL_LIGHT: return createDirectionalLight();
			case CollavizPackage.POINT_LIGHT: return createPointLight();
			case CollavizPackage.DEFORMABLE_OBJECT: return createDeformableObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Juncture createJuncture() {
		JunctureImpl juncture = new JunctureImpl();
		return juncture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ball createBall() {
		BallImpl ball = new BallImpl();
		return ball;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quat4d createQuat4d() {
		Quat4dImpl quat4d = new Quat4dImpl();
		return quat4d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d createVector3d() {
		Vector3dImpl vector3d = new Vector3dImpl();
		return vector3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform createTransform() {
		TransformImpl transform = new TransformImpl();
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaviz createCollaviz() {
		CollavizImpl collaviz = new CollavizImpl();
		return collaviz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionalLight createDirectionalLight() {
		DirectionalLightImpl directionalLight = new DirectionalLightImpl();
		return directionalLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointLight createPointLight() {
		PointLightImpl pointLight = new PointLightImpl();
		return pointLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeformableObject createDeformableObject() {
		DeformableObjectImpl deformableObject = new DeformableObjectImpl();
		return deformableObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollavizPackage getCollavizPackage() {
		return (CollavizPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollavizPackage getPackage() {
		return CollavizPackage.eINSTANCE;
	}

} //CollavizFactoryImpl
