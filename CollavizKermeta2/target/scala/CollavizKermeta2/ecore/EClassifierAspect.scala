package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EClassifierAspect extends CollavizKermeta2.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.EClassifier{
  def ScalainstanceClassName : _root_.java.lang.String={this.getInstanceClassName().asInstanceOf[_root_.java.lang.String]}
  def ScalainstanceClassName_=(`~value` : _root_.java.lang.String):Unit={
	this.setInstanceClassName(`~value`)  }
  def ScalainstanceClass : java.lang.Class[Any]={this.getInstanceClass().asInstanceOf[java.lang.Class[Any]]}
  def ScaladefaultValue : _root_.k2.standard.KermetaObject={this.getDefaultValue().asInstanceOf[_root_.k2.standard.KermetaObject]}
  def ScalainstanceTypeName : _root_.java.lang.String={this.getInstanceTypeName().asInstanceOf[_root_.java.lang.String]}
  def ScalainstanceTypeName_=(`~value` : _root_.java.lang.String):Unit={
	this.setInstanceTypeName(`~value`)  }
  def ScalaePackage : _root_.org.eclipse.emf.ecore.EPackage={this.getEPackage().asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]}
  def ScalaeTypeParameters : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.ecore.EClassifierAspect,_root_.org.eclipse.emf.ecore.ETypeParameter]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.ecore.EClassifierAspect,_root_.org.eclipse.emf.ecore.ETypeParameter](thisUpper = -1,value=this.getETypeParameters())}
  def ScalaeTypeParameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.ETypeParameter]):Unit={
	this.getETypeParameters().clear
	this.getETypeParameters().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EClassifier"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

