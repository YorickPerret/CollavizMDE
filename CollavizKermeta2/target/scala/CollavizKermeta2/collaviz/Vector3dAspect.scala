package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait Vector3dAspect extends k2.standard.KermetaObjectAspect with `_root_`.collaviz.Vector3d{
  def Scalax : _root_.java.lang.Integer={this.getX().asInstanceOf[_root_.java.lang.Integer]}
  def Scalax_=(`~value` : _root_.java.lang.Integer):Unit={
	this.setX(`~value`)  }
  def Scalay : _root_.java.lang.Integer={this.getY().asInstanceOf[_root_.java.lang.Integer]}
  def Scalay_=(`~value` : _root_.java.lang.Integer):Unit={
	this.setY(`~value`)  }
  def Scalaz : _root_.java.lang.Integer={this.getZ().asInstanceOf[_root_.java.lang.Integer]}
  def Scalaz_=(`~value` : _root_.java.lang.Integer):Unit={
	this.setZ(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Vector3d"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

