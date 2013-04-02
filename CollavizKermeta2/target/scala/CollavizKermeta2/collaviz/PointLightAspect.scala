package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait PointLightAspect extends CollavizKermeta2.collaviz.LightAspect with CollavizKermeta2.VisitorMondePackage.VisitableAspect with `_root_`.collaviz.PointLight{
  def ScalaAttenuation : _root_.collaviz.Vector3d={this.getAttenuation().asInstanceOf[_root_.collaviz.Vector3d]}
  def ScalaAttenuation_=(`~value` : _root_.collaviz.Vector3d):Unit={
	this.setAttenuation(`~value`)  }
  def ScalaTransform : _root_.collaviz.Transform={this.getTransform().asInstanceOf[_root_.collaviz.Transform]}
  def ScalaTransform_=(`~value` : _root_.collaviz.Transform):Unit={
	this.setTransform(`~value`)  }
  def ScalaIsPickable : _root_.java.lang.Boolean={this.getIsPickable().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaIsPickable_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setIsPickable(`~value`)  }
  def ScalaIsCullable : _root_.java.lang.Boolean={this.getIsCullable().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaIsCullable_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setIsCullable(`~value`)  }

    override def accept(v : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ((v).visitPointLight(this, indentation)).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.PointLight"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

