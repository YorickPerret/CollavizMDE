package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EDataTypeAspect extends CollavizKermeta2.ecore.EClassifierAspect with `_root_`.org.eclipse.emf.ecore.EDataType{
  def Scalaserializable : _root_.java.lang.Boolean={this.isSerializable().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalaserializable_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setSerializable(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EDataType"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

