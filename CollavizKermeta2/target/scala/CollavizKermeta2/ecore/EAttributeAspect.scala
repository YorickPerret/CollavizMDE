package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EAttributeAspect extends CollavizKermeta2.ecore.EStructuralFeatureAspect with `_root_`.org.eclipse.emf.ecore.EAttribute{
  def ScalaiD : _root_.java.lang.Boolean={this.isID().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaiD_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setID(`~value`)  }
  def ScalaeAttributeType : _root_.org.eclipse.emf.ecore.EDataType={this.getEAttributeType().asInstanceOf[_root_.org.eclipse.emf.ecore.EDataType]}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EAttribute"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

