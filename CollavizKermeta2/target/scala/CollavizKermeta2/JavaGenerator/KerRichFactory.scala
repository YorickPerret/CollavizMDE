package CollavizKermeta2.JavaGenerator
import ScalaImplicit.CollavizKermeta2.ImplicitConversion._
object KerRichFactory{
 def createMainJavaGenerator() : CollavizKermeta2.JavaGenerator.MainJavaGenerator = { new _root_.CollavizKermeta2.JavaGenerator.RichMainJavaGenerator }
 def createGeneratorComposite() : CollavizKermeta2.JavaGenerator.GeneratorComposite = { new _root_.CollavizKermeta2.JavaGenerator.RichGeneratorComposite }
 def createControllerGenerator() : CollavizKermeta2.JavaGenerator.ControllerGenerator = { new _root_.CollavizKermeta2.JavaGenerator.RichControllerGenerator }
}

