package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EReferenceAspect extends CollavizKermeta2.ecore.EStructuralFeatureAspect with `_root_`.org.eclipse.emf.ecore.EReference{
  def Scalacontainment : _root_.java.lang.Boolean={this.isContainment().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalacontainment_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setContainment(`~value`)  }
  def Scalacontainer : _root_.java.lang.Boolean={this.isContainer().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaresolveProxies : _root_.java.lang.Boolean={this.isResolveProxies().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaresolveProxies_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setResolveProxies(`~value`)  }
  def ScalaeOpposite : _root_.org.eclipse.emf.ecore.EReference={this.getEOpposite().asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]}
  def ScalaeOpposite_=(`~value` : _root_.org.eclipse.emf.ecore.EReference):Unit={
	this.setEOpposite(`~value`)  }
  def ScalaeReferenceType : _root_.org.eclipse.emf.ecore.EClass={this.getEReferenceType().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}
  def ScalaeKeys : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.ecore.EReferenceAspect,_root_.org.eclipse.emf.ecore.EAttribute]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.ecore.EReferenceAspect,_root_.org.eclipse.emf.ecore.EAttribute](thisUpper = -1,value=this.getEKeys())}
  def ScalaeKeys_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EAttribute]):Unit={
	this.getEKeys().clear
	this.getEKeys().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EReference"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

