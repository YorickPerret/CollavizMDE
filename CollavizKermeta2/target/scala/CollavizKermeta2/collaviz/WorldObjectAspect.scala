package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait WorldObjectAspect extends CollavizKermeta2.VisitorMondePackage.VisitableAspect with `_root_`.collaviz.WorldObject{
  def Scalaposition : _root_.collaviz.Transform={this.getPosition().asInstanceOf[_root_.collaviz.Transform]}
  def Scalaposition_=(`~value` : _root_.collaviz.Transform):Unit={
	this.setPosition(`~value`)  }
  def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
  def Scalaname_=(`~value` : _root_.java.lang.String):Unit={
	this.setName(`~value`)  }
  def Scalacolor : _root_.collaviz.Color={this.getColor().asInstanceOf[_root_.collaviz.Color]}
  def Scalacolor_=(`~value` : _root_.collaviz.Color):Unit={
	this.setColor(`~value`)  }
  def Scalasupported : k2.standard.ReflectiveOrderedSet[_root_.collaviz.WorldObject,_root_.collaviz.SupportedObject]={    new k2.standard.RichReflectiveOrderedSet[_root_.collaviz.WorldObject,_root_.collaviz.SupportedObject](thisUpper = -1,value=this.getSupported())}
  def Scalasupported_=(`~value` : k2.standard.KermetaOrderedSet[_root_.collaviz.SupportedObject]):Unit={
	this.getSupported().clear
	this.getSupported().addAll(`~value`)
	  }
var visit : _root_.java.lang.Boolean= _
  def KergetVisit() : _root_.java.lang.Boolean={this.visit}
  def KersetVisit(arg:_root_.java.lang.Boolean)={ this.visit = arg}
  def Scalavisit : _root_.java.lang.Boolean={this.KergetVisit().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalavisit_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.KersetVisit(`~value`)  }

    override def accept(v : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ("visit world object").asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.WorldObject"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

