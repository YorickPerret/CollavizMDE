package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EAnnotationAspect extends CollavizKermeta2.ecore.EModelElementAspect with `_root_`.org.eclipse.emf.ecore.EAnnotation{
  def Scalasource : _root_.java.lang.String={this.getSource().asInstanceOf[_root_.java.lang.String]}
  def Scalasource_=(`~value` : _root_.java.lang.String):Unit={
	this.setSource(`~value`)  }
  def Scaladetails : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.ecore.EAnnotationAspect,_root_.java.util.Map.Entry[String,String]]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.ecore.EAnnotationAspect,_root_.java.util.Map.Entry[String,String]](thisUpper = -1,value=this.getDetails())}
  def Scaladetails_=(`~value` : k2.standard.KermetaOrderedSet[_root_.java.util.Map.Entry[String,String]]):Unit={
	this.getDetails().clear
	this.getDetails().addAll(`~value`)
	  }
  def ScalaeModelElement : _root_.org.eclipse.emf.ecore.EModelElement={this.getEModelElement().asInstanceOf[_root_.org.eclipse.emf.ecore.EModelElement]}
  def ScalaeModelElement_=(`~value` : _root_.org.eclipse.emf.ecore.EModelElement):Unit={
	this.setEModelElement(`~value`)  }
  def Scalacontents : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.ecore.EAnnotationAspect,Any]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.ecore.EAnnotationAspect,Any](thisUpper = -1,value=this.getContents())}
  def Scalacontents_=(`~value` : k2.standard.KermetaOrderedSet[Any]):Unit={
	this.getContents().clear
	this.getContents().addAll(`~value`)
	  }
  def Scalareferences : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.ecore.EAnnotationAspect,Any]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.ecore.EAnnotationAspect,Any](thisUpper = -1,value=this.getReferences())}
  def Scalareferences_=(`~value` : k2.standard.KermetaOrderedSet[Any]):Unit={
	this.getReferences().clear
	this.getReferences().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EAnnotation"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

