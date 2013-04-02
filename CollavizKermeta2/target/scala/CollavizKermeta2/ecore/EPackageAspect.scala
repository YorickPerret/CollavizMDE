package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EPackageAspect extends CollavizKermeta2.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.EPackage{
  def ScalansURI : _root_.java.lang.String={this.getNsURI().asInstanceOf[_root_.java.lang.String]}
  def ScalansURI_=(`~value` : _root_.java.lang.String):Unit={
	this.setNsURI(`~value`)  }
  def ScalansPrefix : _root_.java.lang.String={this.getNsPrefix().asInstanceOf[_root_.java.lang.String]}
  def ScalansPrefix_=(`~value` : _root_.java.lang.String):Unit={
	this.setNsPrefix(`~value`)  }
  def ScalaeFactoryInstance : _root_.org.eclipse.emf.ecore.EFactory={this.getEFactoryInstance().asInstanceOf[_root_.org.eclipse.emf.ecore.EFactory]}
  def ScalaeFactoryInstance_=(`~value` : _root_.org.eclipse.emf.ecore.EFactory):Unit={
	this.setEFactoryInstance(`~value`)  }
  def ScalaeClassifiers : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EClassifier]={    new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EClassifier](thisUpper = -1,value=this.getEClassifiers())}
  def ScalaeClassifiers_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClassifier]):Unit={
	this.getEClassifiers().clear
	this.getEClassifiers().addAll(`~value`)
	  }
  def ScalaeSubpackages : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EPackage]={    new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EPackage](thisUpper = -1,value=this.getESubpackages())}
  def ScalaeSubpackages_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EPackage]):Unit={
	this.getESubpackages().clear
	this.getESubpackages().addAll(`~value`)
	  }
  def ScalaeSuperPackage : _root_.org.eclipse.emf.ecore.EPackage={this.getESuperPackage().asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EPackage"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

