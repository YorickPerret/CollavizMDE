package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait SupportedObjectAspect extends CollavizKermeta2.collaviz.WorldObjectAspect with `_root_`.collaviz.SupportedObject{
  def Scalaoffset : _root_.collaviz.Transform={this.getOffset().asInstanceOf[_root_.collaviz.Transform]}
  def Scalaoffset_=(`~value` : _root_.collaviz.Transform):Unit={
	this.setOffset(`~value`)  }
  def Scalasupport : _root_.collaviz.WorldObject={this.getSupport().asInstanceOf[_root_.collaviz.WorldObject]}
  def Scalasupport_=(`~value` : _root_.collaviz.WorldObject):Unit={
	this.setSupport(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.SupportedObject"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

