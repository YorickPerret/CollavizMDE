package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait JunctureAspect extends CollavizKermeta2.collaviz.DeformableObjectAspect with CollavizKermeta2.VisitorMondePackage.VisitableAspect with `_root_`.collaviz.Juncture{
  def ScalabeginBall : _root_.collaviz.Ball={this.getBeginBall().asInstanceOf[_root_.collaviz.Ball]}
  def ScalabeginBall_=(`~value` : _root_.collaviz.Ball):Unit={
	this.setBeginBall(`~value`)  }
  def ScalaendBall : _root_.collaviz.Ball={this.getEndBall().asInstanceOf[_root_.collaviz.Ball]}
  def ScalaendBall_=(`~value` : _root_.collaviz.Ball):Unit={
	this.setEndBall(`~value`)  }
  def Scalaradius : _root_.java.lang.Float={this.getRadius().asInstanceOf[_root_.java.lang.Float]}
  def Scalaradius_=(`~value` : _root_.java.lang.Float):Unit={
	this.setRadius(`~value`)  }

    override def accept(v : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ((v).visitJuncture(this, indentation)).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Juncture"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

