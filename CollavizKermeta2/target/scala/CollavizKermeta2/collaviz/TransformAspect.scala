package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait TransformAspect extends k2.standard.KermetaObjectAspect with `_root_`.collaviz.Transform{
  def Scalatranslation : _root_.collaviz.Vector3d={this.getTranslation().asInstanceOf[_root_.collaviz.Vector3d]}
  def Scalatranslation_=(`~value` : _root_.collaviz.Vector3d):Unit={
	this.setTranslation(`~value`)  }
  def Scalarotation : _root_.collaviz.Quat4d={this.getRotation().asInstanceOf[_root_.collaviz.Quat4d]}
  def Scalarotation_=(`~value` : _root_.collaviz.Quat4d):Unit={
	this.setRotation(`~value`)  }
  def Scalascale : _root_.collaviz.Vector3d={this.getScale().asInstanceOf[_root_.collaviz.Vector3d]}
  def Scalascale_=(`~value` : _root_.collaviz.Vector3d):Unit={
	this.setScale(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Transform"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

