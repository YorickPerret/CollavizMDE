package CollavizKermeta2.mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait MainGeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.CollavizKermeta2.mainPackage.MainGenerator{

    def loadModel(uri : _root_.java.lang.String):_root_.collaviz.Collaviz = {
var `~result` : _root_.collaviz.Collaviz = null.asInstanceOf[_root_.collaviz.Collaviz]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(uri);
(resource).load(null)
try{
`~result` = (((resource).kgetContents()).one()).asInstanceOf[_root_.collaviz.Collaviz];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    def mainOperation(uriModel : _root_.java.lang.String, nameWorld : _root_.java.lang.String):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(_root_.k2.io.StdIO).writeln("loading model")
var c : _root_.collaviz.Collaviz = null.asInstanceOf[_root_.collaviz.Collaviz];
try{
c = ((this).loadModel(uriModel)).asInstanceOf[_root_.collaviz.Collaviz];
}catch { case e:ClassCastException => {}}

var visitor : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface = _root_.CollavizKermeta2.VisitorMondePackage.KerRichFactory.createVisitorCollaviz;
if (_root_.k2.utils.UTilScala.isNotEqual((c),null))

{
(_root_.k2.io.StdIO).writeln("load model success")
(c).checkAllInvariants()
var generateWorld : _root_.java.lang.String = "";
try{
generateWorld = ((c).accept(visitor, "")).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}

(_root_.k2.io.StdIO).writeln("saving world")
var resWorld : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String];
try{
resWorld = (("platform:/resource/CollavizKermeta2/src/main/world/").plus(nameWorld)).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}

(_root_.k2.io.FileIO).writeTextFile((resWorld).toURI(), _root_.k2.utils.UTilScala.toString((generateWorld)))
(_root_.k2.io.StdIO).writeln("save world success")}
else 


{
(_root_.k2.io.StdIO).writeln("load model failed")}
}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.MainGenerator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

