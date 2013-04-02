/**
 */
package collaviz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see collaviz.CollavizFactory
 * @model kind="package"
 * @generated
 */
public interface CollavizPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collaviz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Collaviz/model/Collaviz/collaviz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collaviz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollavizPackage eINSTANCE = collaviz.impl.CollavizPackageImpl.init();

	/**
	 * The meta object id for the '{@link collaviz.impl.WorldObjectImpl <em>World Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.WorldObjectImpl
	 * @see collaviz.impl.CollavizPackageImpl#getWorldObject()
	 * @generated
	 */
	int WORLD_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OBJECT__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OBJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OBJECT__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OBJECT__SUPPORTED = 3;

	/**
	 * The number of structural features of the '<em>World Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link collaviz.impl.SupportedObjectImpl <em>Supported Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.SupportedObjectImpl
	 * @see collaviz.impl.CollavizPackageImpl#getSupportedObject()
	 * @generated
	 */
	int SUPPORTED_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT__POSITION = WORLD_OBJECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT__NAME = WORLD_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT__COLOR = WORLD_OBJECT__COLOR;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT__SUPPORTED = WORLD_OBJECT__SUPPORTED;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT__OFFSET = WORLD_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT__SUPPORT = WORLD_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supported Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_OBJECT_FEATURE_COUNT = WORLD_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link collaviz.impl.DeformableObjectImpl <em>Deformable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.DeformableObjectImpl
	 * @see collaviz.impl.CollavizPackageImpl#getDeformableObject()
	 * @generated
	 */
	int DEFORMABLE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT__POSITION = SUPPORTED_OBJECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT__NAME = SUPPORTED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT__COLOR = SUPPORTED_OBJECT__COLOR;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT__SUPPORTED = SUPPORTED_OBJECT__SUPPORTED;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT__OFFSET = SUPPORTED_OBJECT__OFFSET;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT__SUPPORT = SUPPORTED_OBJECT__SUPPORT;

	/**
	 * The number of structural features of the '<em>Deformable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFORMABLE_OBJECT_FEATURE_COUNT = SUPPORTED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link collaviz.impl.JunctureImpl <em>Juncture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.JunctureImpl
	 * @see collaviz.impl.CollavizPackageImpl#getJuncture()
	 * @generated
	 */
	int JUNCTURE = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__POSITION = DEFORMABLE_OBJECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__NAME = DEFORMABLE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__COLOR = DEFORMABLE_OBJECT__COLOR;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__SUPPORTED = DEFORMABLE_OBJECT__SUPPORTED;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__OFFSET = DEFORMABLE_OBJECT__OFFSET;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__SUPPORT = DEFORMABLE_OBJECT__SUPPORT;

	/**
	 * The feature id for the '<em><b>Begin Ball</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__BEGIN_BALL = DEFORMABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Ball</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__END_BALL = DEFORMABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__RADIUS = DEFORMABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Juncture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE_FEATURE_COUNT = DEFORMABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link collaviz.impl.BallImpl <em>Ball</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.BallImpl
	 * @see collaviz.impl.CollavizPackageImpl#getBall()
	 * @generated
	 */
	int BALL = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__POSITION = SUPPORTED_OBJECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__NAME = SUPPORTED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__COLOR = SUPPORTED_OBJECT__COLOR;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__SUPPORTED = SUPPORTED_OBJECT__SUPPORTED;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__OFFSET = SUPPORTED_OBJECT__OFFSET;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__SUPPORT = SUPPORTED_OBJECT__SUPPORT;

	/**
	 * The feature id for the '<em><b>Junctures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL__JUNCTURES = SUPPORTED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ball</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_FEATURE_COUNT = SUPPORTED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link collaviz.impl.Quat4dImpl <em>Quat4d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.Quat4dImpl
	 * @see collaviz.impl.CollavizPackageImpl#getQuat4d()
	 * @generated
	 */
	int QUAT4D = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAT4D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAT4D__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAT4D__Z = 2;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAT4D__W = 3;

	/**
	 * The number of structural features of the '<em>Quat4d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAT4D_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link collaviz.impl.Vector3dImpl <em>Vector3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.Vector3dImpl
	 * @see collaviz.impl.CollavizPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D__Z = 2;

	/**
	 * The number of structural features of the '<em>Vector3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link collaviz.impl.TransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.TransformImpl
	 * @see collaviz.impl.CollavizPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 5;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__TRANSLATION = 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__ROTATION = 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__SCALE = 2;

	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link collaviz.impl.CollavizImpl <em>Collaviz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.CollavizImpl
	 * @see collaviz.impl.CollavizPackageImpl#getCollaviz()
	 * @generated
	 */
	int COLLAVIZ = 7;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAVIZ__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Lights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAVIZ__LIGHTS = 1;

	/**
	 * The number of structural features of the '<em>Collaviz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAVIZ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link collaviz.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.ColorImpl
	 * @see collaviz.impl.CollavizPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 8;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__B = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link collaviz.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.LightImpl
	 * @see collaviz.impl.CollavizPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 9;

	/**
	 * The feature id for the '<em><b>Light Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__LIGHT_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__IS_ON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link collaviz.impl.DirectionalLightImpl <em>Directional Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.DirectionalLightImpl
	 * @see collaviz.impl.CollavizPackageImpl#getDirectionalLight()
	 * @generated
	 */
	int DIRECTIONAL_LIGHT = 10;

	/**
	 * The feature id for the '<em><b>Light Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__LIGHT_COLOR = LIGHT__LIGHT_COLOR;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__GEOMETRY = LIGHT__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__IS_ON = LIGHT__IS_ON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__NAME = LIGHT__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__DIRECTION = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directional Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link collaviz.impl.PointLightImpl <em>Point Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaviz.impl.PointLightImpl
	 * @see collaviz.impl.CollavizPackageImpl#getPointLight()
	 * @generated
	 */
	int POINT_LIGHT = 11;

	/**
	 * The feature id for the '<em><b>Light Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__LIGHT_COLOR = LIGHT__LIGHT_COLOR;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__GEOMETRY = LIGHT__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__IS_ON = LIGHT__IS_ON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__NAME = LIGHT__NAME;

	/**
	 * The feature id for the '<em><b>Attenuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__ATTENUATION = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__TRANSFORM = LIGHT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Pickable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__IS_PICKABLE = LIGHT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Cullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__IS_CULLABLE = LIGHT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Point Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link collaviz.WorldObject <em>World Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Object</em>'.
	 * @see collaviz.WorldObject
	 * @generated
	 */
	EClass getWorldObject();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.WorldObject#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see collaviz.WorldObject#getPosition()
	 * @see #getWorldObject()
	 * @generated
	 */
	EReference getWorldObject_Position();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.WorldObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see collaviz.WorldObject#getName()
	 * @see #getWorldObject()
	 * @generated
	 */
	EAttribute getWorldObject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.WorldObject#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see collaviz.WorldObject#getColor()
	 * @see #getWorldObject()
	 * @generated
	 */
	EReference getWorldObject_Color();

	/**
	 * Returns the meta object for the reference list '{@link collaviz.WorldObject#getSupported <em>Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported</em>'.
	 * @see collaviz.WorldObject#getSupported()
	 * @see #getWorldObject()
	 * @generated
	 */
	EReference getWorldObject_Supported();

	/**
	 * Returns the meta object for class '{@link collaviz.Juncture <em>Juncture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Juncture</em>'.
	 * @see collaviz.Juncture
	 * @generated
	 */
	EClass getJuncture();

	/**
	 * Returns the meta object for the reference '{@link collaviz.Juncture#getBeginBall <em>Begin Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Begin Ball</em>'.
	 * @see collaviz.Juncture#getBeginBall()
	 * @see #getJuncture()
	 * @generated
	 */
	EReference getJuncture_BeginBall();

	/**
	 * Returns the meta object for the reference '{@link collaviz.Juncture#getEndBall <em>End Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Ball</em>'.
	 * @see collaviz.Juncture#getEndBall()
	 * @see #getJuncture()
	 * @generated
	 */
	EReference getJuncture_EndBall();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Juncture#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see collaviz.Juncture#getRadius()
	 * @see #getJuncture()
	 * @generated
	 */
	EAttribute getJuncture_Radius();

	/**
	 * Returns the meta object for class '{@link collaviz.Ball <em>Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ball</em>'.
	 * @see collaviz.Ball
	 * @generated
	 */
	EClass getBall();

	/**
	 * Returns the meta object for the reference list '{@link collaviz.Ball#getJunctures <em>Junctures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Junctures</em>'.
	 * @see collaviz.Ball#getJunctures()
	 * @see #getBall()
	 * @generated
	 */
	EReference getBall_Junctures();

	/**
	 * Returns the meta object for class '{@link collaviz.Quat4d <em>Quat4d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quat4d</em>'.
	 * @see collaviz.Quat4d
	 * @generated
	 */
	EClass getQuat4d();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Quat4d#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see collaviz.Quat4d#getX()
	 * @see #getQuat4d()
	 * @generated
	 */
	EAttribute getQuat4d_X();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Quat4d#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see collaviz.Quat4d#getY()
	 * @see #getQuat4d()
	 * @generated
	 */
	EAttribute getQuat4d_Y();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Quat4d#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see collaviz.Quat4d#getZ()
	 * @see #getQuat4d()
	 * @generated
	 */
	EAttribute getQuat4d_Z();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Quat4d#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see collaviz.Quat4d#getW()
	 * @see #getQuat4d()
	 * @generated
	 */
	EAttribute getQuat4d_W();

	/**
	 * Returns the meta object for class '{@link collaviz.Vector3d <em>Vector3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3d</em>'.
	 * @see collaviz.Vector3d
	 * @generated
	 */
	EClass getVector3d();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Vector3d#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see collaviz.Vector3d#getX()
	 * @see #getVector3d()
	 * @generated
	 */
	EAttribute getVector3d_X();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Vector3d#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see collaviz.Vector3d#getY()
	 * @see #getVector3d()
	 * @generated
	 */
	EAttribute getVector3d_Y();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Vector3d#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see collaviz.Vector3d#getZ()
	 * @see #getVector3d()
	 * @generated
	 */
	EAttribute getVector3d_Z();

	/**
	 * Returns the meta object for class '{@link collaviz.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see collaviz.Transform
	 * @generated
	 */
	EClass getTransform();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.Transform#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see collaviz.Transform#getTranslation()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.Transform#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see collaviz.Transform#getRotation()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.Transform#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see collaviz.Transform#getScale()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Scale();

	/**
	 * Returns the meta object for class '{@link collaviz.SupportedObject <em>Supported Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Object</em>'.
	 * @see collaviz.SupportedObject
	 * @generated
	 */
	EClass getSupportedObject();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.SupportedObject#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see collaviz.SupportedObject#getOffset()
	 * @see #getSupportedObject()
	 * @generated
	 */
	EReference getSupportedObject_Offset();

	/**
	 * Returns the meta object for the reference '{@link collaviz.SupportedObject#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Support</em>'.
	 * @see collaviz.SupportedObject#getSupport()
	 * @see #getSupportedObject()
	 * @generated
	 */
	EReference getSupportedObject_Support();

	/**
	 * Returns the meta object for class '{@link collaviz.Collaviz <em>Collaviz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaviz</em>'.
	 * @see collaviz.Collaviz
	 * @generated
	 */
	EClass getCollaviz();

	/**
	 * Returns the meta object for the containment reference list '{@link collaviz.Collaviz#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see collaviz.Collaviz#getObjects()
	 * @see #getCollaviz()
	 * @generated
	 */
	EReference getCollaviz_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link collaviz.Collaviz#getLights <em>Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lights</em>'.
	 * @see collaviz.Collaviz#getLights()
	 * @see #getCollaviz()
	 * @generated
	 */
	EReference getCollaviz_Lights();

	/**
	 * Returns the meta object for class '{@link collaviz.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see collaviz.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Color#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see collaviz.Color#getR()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_R();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Color#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see collaviz.Color#getG()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_G();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Color#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see collaviz.Color#getB()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_B();

	/**
	 * Returns the meta object for class '{@link collaviz.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see collaviz.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.Light#getLightColor <em>Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Color</em>'.
	 * @see collaviz.Light#getLightColor()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_LightColor();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Light#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see collaviz.Light#getGeometry()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Light#getIsOn <em>Is On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is On</em>'.
	 * @see collaviz.Light#getIsOn()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_IsOn();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.Light#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see collaviz.Light#getName()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Name();

	/**
	 * Returns the meta object for class '{@link collaviz.DirectionalLight <em>Directional Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directional Light</em>'.
	 * @see collaviz.DirectionalLight
	 * @generated
	 */
	EClass getDirectionalLight();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.DirectionalLight#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see collaviz.DirectionalLight#getDirection()
	 * @see #getDirectionalLight()
	 * @generated
	 */
	EReference getDirectionalLight_Direction();

	/**
	 * Returns the meta object for class '{@link collaviz.PointLight <em>Point Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Light</em>'.
	 * @see collaviz.PointLight
	 * @generated
	 */
	EClass getPointLight();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.PointLight#getAttenuation <em>Attenuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attenuation</em>'.
	 * @see collaviz.PointLight#getAttenuation()
	 * @see #getPointLight()
	 * @generated
	 */
	EReference getPointLight_Attenuation();

	/**
	 * Returns the meta object for the containment reference '{@link collaviz.PointLight#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see collaviz.PointLight#getTransform()
	 * @see #getPointLight()
	 * @generated
	 */
	EReference getPointLight_Transform();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.PointLight#getIsPickable <em>Is Pickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pickable</em>'.
	 * @see collaviz.PointLight#getIsPickable()
	 * @see #getPointLight()
	 * @generated
	 */
	EAttribute getPointLight_IsPickable();

	/**
	 * Returns the meta object for the attribute '{@link collaviz.PointLight#getIsCullable <em>Is Cullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cullable</em>'.
	 * @see collaviz.PointLight#getIsCullable()
	 * @see #getPointLight()
	 * @generated
	 */
	EAttribute getPointLight_IsCullable();

	/**
	 * Returns the meta object for class '{@link collaviz.DeformableObject <em>Deformable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deformable Object</em>'.
	 * @see collaviz.DeformableObject
	 * @generated
	 */
	EClass getDeformableObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollavizFactory getCollavizFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link collaviz.impl.WorldObjectImpl <em>World Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.WorldObjectImpl
		 * @see collaviz.impl.CollavizPackageImpl#getWorldObject()
		 * @generated
		 */
		EClass WORLD_OBJECT = eINSTANCE.getWorldObject();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_OBJECT__POSITION = eINSTANCE.getWorldObject_Position();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_OBJECT__NAME = eINSTANCE.getWorldObject_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_OBJECT__COLOR = eINSTANCE.getWorldObject_Color();

		/**
		 * The meta object literal for the '<em><b>Supported</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_OBJECT__SUPPORTED = eINSTANCE.getWorldObject_Supported();

		/**
		 * The meta object literal for the '{@link collaviz.impl.JunctureImpl <em>Juncture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.JunctureImpl
		 * @see collaviz.impl.CollavizPackageImpl#getJuncture()
		 * @generated
		 */
		EClass JUNCTURE = eINSTANCE.getJuncture();

		/**
		 * The meta object literal for the '<em><b>Begin Ball</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTURE__BEGIN_BALL = eINSTANCE.getJuncture_BeginBall();

		/**
		 * The meta object literal for the '<em><b>End Ball</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTURE__END_BALL = eINSTANCE.getJuncture_EndBall();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTURE__RADIUS = eINSTANCE.getJuncture_Radius();

		/**
		 * The meta object literal for the '{@link collaviz.impl.BallImpl <em>Ball</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.BallImpl
		 * @see collaviz.impl.CollavizPackageImpl#getBall()
		 * @generated
		 */
		EClass BALL = eINSTANCE.getBall();

		/**
		 * The meta object literal for the '<em><b>Junctures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALL__JUNCTURES = eINSTANCE.getBall_Junctures();

		/**
		 * The meta object literal for the '{@link collaviz.impl.Quat4dImpl <em>Quat4d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.Quat4dImpl
		 * @see collaviz.impl.CollavizPackageImpl#getQuat4d()
		 * @generated
		 */
		EClass QUAT4D = eINSTANCE.getQuat4d();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAT4D__X = eINSTANCE.getQuat4d_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAT4D__Y = eINSTANCE.getQuat4d_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAT4D__Z = eINSTANCE.getQuat4d_Z();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAT4D__W = eINSTANCE.getQuat4d_W();

		/**
		 * The meta object literal for the '{@link collaviz.impl.Vector3dImpl <em>Vector3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.Vector3dImpl
		 * @see collaviz.impl.CollavizPackageImpl#getVector3d()
		 * @generated
		 */
		EClass VECTOR3D = eINSTANCE.getVector3d();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3D__X = eINSTANCE.getVector3d_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3D__Y = eINSTANCE.getVector3d_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3D__Z = eINSTANCE.getVector3d_Z();

		/**
		 * The meta object literal for the '{@link collaviz.impl.TransformImpl <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.TransformImpl
		 * @see collaviz.impl.CollavizPackageImpl#getTransform()
		 * @generated
		 */
		EClass TRANSFORM = eINSTANCE.getTransform();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__TRANSLATION = eINSTANCE.getTransform_Translation();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__ROTATION = eINSTANCE.getTransform_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__SCALE = eINSTANCE.getTransform_Scale();

		/**
		 * The meta object literal for the '{@link collaviz.impl.SupportedObjectImpl <em>Supported Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.SupportedObjectImpl
		 * @see collaviz.impl.CollavizPackageImpl#getSupportedObject()
		 * @generated
		 */
		EClass SUPPORTED_OBJECT = eINSTANCE.getSupportedObject();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_OBJECT__OFFSET = eINSTANCE.getSupportedObject_Offset();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_OBJECT__SUPPORT = eINSTANCE.getSupportedObject_Support();

		/**
		 * The meta object literal for the '{@link collaviz.impl.CollavizImpl <em>Collaviz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.CollavizImpl
		 * @see collaviz.impl.CollavizPackageImpl#getCollaviz()
		 * @generated
		 */
		EClass COLLAVIZ = eINSTANCE.getCollaviz();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLAVIZ__OBJECTS = eINSTANCE.getCollaviz_Objects();

		/**
		 * The meta object literal for the '<em><b>Lights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLAVIZ__LIGHTS = eINSTANCE.getCollaviz_Lights();

		/**
		 * The meta object literal for the '{@link collaviz.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.ColorImpl
		 * @see collaviz.impl.CollavizPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__R = eINSTANCE.getColor_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__G = eINSTANCE.getColor_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__B = eINSTANCE.getColor_B();

		/**
		 * The meta object literal for the '{@link collaviz.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.LightImpl
		 * @see collaviz.impl.CollavizPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>Light Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__LIGHT_COLOR = eINSTANCE.getLight_LightColor();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__GEOMETRY = eINSTANCE.getLight_Geometry();

		/**
		 * The meta object literal for the '<em><b>Is On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__IS_ON = eINSTANCE.getLight_IsOn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__NAME = eINSTANCE.getLight_Name();

		/**
		 * The meta object literal for the '{@link collaviz.impl.DirectionalLightImpl <em>Directional Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.DirectionalLightImpl
		 * @see collaviz.impl.CollavizPackageImpl#getDirectionalLight()
		 * @generated
		 */
		EClass DIRECTIONAL_LIGHT = eINSTANCE.getDirectionalLight();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIONAL_LIGHT__DIRECTION = eINSTANCE.getDirectionalLight_Direction();

		/**
		 * The meta object literal for the '{@link collaviz.impl.PointLightImpl <em>Point Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.PointLightImpl
		 * @see collaviz.impl.CollavizPackageImpl#getPointLight()
		 * @generated
		 */
		EClass POINT_LIGHT = eINSTANCE.getPointLight();

		/**
		 * The meta object literal for the '<em><b>Attenuation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_LIGHT__ATTENUATION = eINSTANCE.getPointLight_Attenuation();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_LIGHT__TRANSFORM = eINSTANCE.getPointLight_Transform();

		/**
		 * The meta object literal for the '<em><b>Is Pickable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_LIGHT__IS_PICKABLE = eINSTANCE.getPointLight_IsPickable();

		/**
		 * The meta object literal for the '<em><b>Is Cullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_LIGHT__IS_CULLABLE = eINSTANCE.getPointLight_IsCullable();

		/**
		 * The meta object literal for the '{@link collaviz.impl.DeformableObjectImpl <em>Deformable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaviz.impl.DeformableObjectImpl
		 * @see collaviz.impl.CollavizPackageImpl#getDeformableObject()
		 * @generated
		 */
		EClass DEFORMABLE_OBJECT = eINSTANCE.getDeformableObject();

	}

} //CollavizPackage
