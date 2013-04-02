package CollavizKermeta2runner.mainPackage 
import CollavizKermeta2runner.DefaultRunner
import ScalaImplicit.CollavizKermeta2.ImplicitConversion._
object MainGenerator_mainOperation extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
    _root_.CollavizKermeta2.mainPackage.KerRichFactory.createMainGenerator.mainOperation(args(0) , args(1))
  }
}
