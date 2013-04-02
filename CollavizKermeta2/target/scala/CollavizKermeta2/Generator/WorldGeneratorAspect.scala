package CollavizKermeta2.Generator
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait WorldGeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.CollavizKermeta2.Generator.WorldGenerator{

    def generateIndex():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var stringBuffer : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
(stringBuffer).append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\t\t\n<worldDescription>\n\t\n\t<virtualObject id=\"grille\" type=\"WorldObject\">\n\t\t<owners>All</owners>\n\t\t<accessLevel>3</accessLevel>\n\t\t<refProxy>true</refProxy>\n\t\t<param name=\"Transform\" type=\"Transform\">0 0 0 0 0 0</param>\n\t\t<param name=\"Geometry\" type=\"String\">grille.wrl</param>\n\t\t<param name=\"IsPickable\" type=\"boolean\">false</param>\n\t</virtualObject>\n\t\n")
try{
`~result` = (_root_.k2.utils.UTilScala.toString((stringBuffer))).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    def generateEnd():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ("\n</worldDescription>").asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("Generator.WorldGenerator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

