package CollavizKermeta2.VisitorMondePackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait VisitorInterfaceAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.CollavizKermeta2.VisitorMondePackage.VisitorInterface{

    def visitCollaviz(c : _root_.collaviz.Collaviz, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def visitBall(b : _root_.collaviz.Ball, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def visitJuncture(j : _root_.collaviz.Juncture, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def visitDirectionalLight(l : _root_.collaviz.DirectionalLight, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def visitPointLight(l : _root_.collaviz.PointLight, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("VisitorMondePackage.VisitorInterface"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

