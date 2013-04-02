package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait LightAspect extends CollavizKermeta2.VisitorMondePackage.VisitableAspect with `_root_`.collaviz.Light{
  def ScalaLightColor : _root_.collaviz.Color={this.getLightColor().asInstanceOf[_root_.collaviz.Color]}
  def ScalaLightColor_=(`~value` : _root_.collaviz.Color):Unit={
	this.setLightColor(`~value`)  }
  def Scalageometry : _root_.java.lang.String={this.getGeometry().asInstanceOf[_root_.java.lang.String]}
  def Scalageometry_=(`~value` : _root_.java.lang.String):Unit={
	this.setGeometry(`~value`)  }
  def ScalaIsOn : _root_.java.lang.Boolean={this.getIsOn().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaIsOn_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setIsOn(`~value`)  }
  def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
  def Scalaname_=(`~value` : _root_.java.lang.String):Unit={
	this.setName(`~value`)  }

    override def accept(v : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ("visit light").asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Light"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

