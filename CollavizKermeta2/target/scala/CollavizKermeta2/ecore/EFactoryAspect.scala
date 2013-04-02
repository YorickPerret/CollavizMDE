package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EFactoryAspect extends CollavizKermeta2.ecore.EModelElementAspect with `_root_`.org.eclipse.emf.ecore.EFactory{
  def ScalaePackage : _root_.org.eclipse.emf.ecore.EPackage={this.getEPackage().asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]}
  def ScalaePackage_=(`~value` : _root_.org.eclipse.emf.ecore.EPackage):Unit={
	this.setEPackage(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EFactory"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

