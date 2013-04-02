package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait ColorAspect extends k2.standard.KermetaObjectAspect with `_root_`.collaviz.Color{
  def Scalar : _root_.java.lang.Float={this.getR().asInstanceOf[_root_.java.lang.Float]}
  def Scalar_=(`~value` : _root_.java.lang.Float):Unit={
	this.setR(`~value`)  }
  def Scalag : _root_.java.lang.Float={this.getG().asInstanceOf[_root_.java.lang.Float]}
  def Scalag_=(`~value` : _root_.java.lang.Float):Unit={
	this.setG(`~value`)  }
  def Scalab : _root_.java.lang.Float={this.getB().asInstanceOf[_root_.java.lang.Float]}
  def Scalab_=(`~value` : _root_.java.lang.Float):Unit={
	this.setB(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Color"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

