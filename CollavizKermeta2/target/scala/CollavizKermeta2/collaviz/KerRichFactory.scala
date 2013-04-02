package CollavizKermeta2.collaviz
import ScalaImplicit.CollavizKermeta2.ImplicitConversion._
object KerRichFactory extends collaviz.impl.CollavizFactoryImpl{
 override def createJuncture() : collaviz.Juncture = { new _root_.CollavizKermeta2.collaviz.RichJuncture }
 override def createBall() : collaviz.Ball = { new _root_.CollavizKermeta2.collaviz.RichBall }
 override def createQuat4d() : collaviz.Quat4d = { new _root_.CollavizKermeta2.collaviz.RichQuat4d }
 override def createVector3d() : collaviz.Vector3d = { new _root_.CollavizKermeta2.collaviz.RichVector3d }
 override def createTransform() : collaviz.Transform = { new _root_.CollavizKermeta2.collaviz.RichTransform }
 override def createCollaviz() : collaviz.Collaviz = { new _root_.CollavizKermeta2.collaviz.RichCollaviz }
 override def createColor() : collaviz.Color = { new _root_.CollavizKermeta2.collaviz.RichColor }
 override def createDirectionalLight() : collaviz.DirectionalLight = { new _root_.CollavizKermeta2.collaviz.RichDirectionalLight }
 override def createPointLight() : collaviz.PointLight = { new _root_.CollavizKermeta2.collaviz.RichPointLight }
 override def createDeformableObject() : collaviz.DeformableObject = { new _root_.CollavizKermeta2.collaviz.RichDeformableObject }
}

