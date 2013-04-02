package CollavizKermeta2.ecore
import ScalaImplicit.CollavizKermeta2.ImplicitConversion._
object KerRichFactory extends org.eclipse.emf.ecore.impl.EcoreFactoryImpl{
 override def createEAttribute() : org.eclipse.emf.ecore.EAttribute = { new _root_.CollavizKermeta2.ecore.RichEAttribute }
 override def createEAnnotation() : org.eclipse.emf.ecore.EAnnotation = { new _root_.CollavizKermeta2.ecore.RichEAnnotation }
 override def createEClass() : org.eclipse.emf.ecore.EClass = { new _root_.CollavizKermeta2.ecore.RichEClass }
 override def createEDataType() : org.eclipse.emf.ecore.EDataType = { new _root_.CollavizKermeta2.ecore.RichEDataType }
 override def createEEnum() : org.eclipse.emf.ecore.EEnum = { new _root_.CollavizKermeta2.ecore.RichEEnum }
 override def createEEnumLiteral() : org.eclipse.emf.ecore.EEnumLiteral = { new _root_.CollavizKermeta2.ecore.RichEEnumLiteral }
 override def createEFactory() : org.eclipse.emf.ecore.EFactory = { new _root_.CollavizKermeta2.ecore.RichEFactory }
 override def createEObject() : org.eclipse.emf.ecore.EObject = { new _root_.CollavizKermeta2.ecore.RichEObject }
 override def createEOperation() : org.eclipse.emf.ecore.EOperation = { new _root_.CollavizKermeta2.ecore.RichEOperation }
 override def createEPackage() : org.eclipse.emf.ecore.EPackage = { new _root_.CollavizKermeta2.ecore.RichEPackage }
 override def createEParameter() : org.eclipse.emf.ecore.EParameter = { new _root_.CollavizKermeta2.ecore.RichEParameter }
 override def createEReference() : org.eclipse.emf.ecore.EReference = { new _root_.CollavizKermeta2.ecore.RichEReference }
 override def createEStringToStringMapEntry() : java.util.Map.Entry[String,String] = { new _root_.CollavizKermeta2.ecore.RichEStringToStringMapEntry }
 override def createEGenericType() : org.eclipse.emf.ecore.EGenericType = { new _root_.CollavizKermeta2.ecore.RichEGenericType }
 override def createETypeParameter() : org.eclipse.emf.ecore.ETypeParameter = { new _root_.CollavizKermeta2.ecore.RichETypeParameter }
}

