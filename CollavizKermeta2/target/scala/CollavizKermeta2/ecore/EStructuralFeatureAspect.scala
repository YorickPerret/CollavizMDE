package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EStructuralFeatureAspect extends CollavizKermeta2.ecore.ETypedElementAspect with `_root_`.org.eclipse.emf.ecore.EStructuralFeature{
  def Scalachangeable : _root_.java.lang.Boolean={this.isChangeable().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalachangeable_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setChangeable(`~value`)  }
  def Scalavolatile : _root_.java.lang.Boolean={this.isVolatile().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalavolatile_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setVolatile(`~value`)  }
  def Scalatransient : _root_.java.lang.Boolean={this.isTransient().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalatransient_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setTransient(`~value`)  }
  def ScaladefaultValueLiteral : _root_.java.lang.String={this.getDefaultValueLiteral().asInstanceOf[_root_.java.lang.String]}
  def ScaladefaultValueLiteral_=(`~value` : _root_.java.lang.String):Unit={
	this.setDefaultValueLiteral(`~value`)  }
  def ScaladefaultValue : _root_.k2.standard.KermetaObject={this.getDefaultValue().asInstanceOf[_root_.k2.standard.KermetaObject]}
  def Scalaunsettable : _root_.java.lang.Boolean={this.isUnsettable().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalaunsettable_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setUnsettable(`~value`)  }
  def Scaladerived : _root_.java.lang.Boolean={this.isDerived().asInstanceOf[_root_.java.lang.Boolean]}
  def Scaladerived_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setDerived(`~value`)  }
  def ScalaeContainingClass : _root_.org.eclipse.emf.ecore.EClass={this.getEContainingClass().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EStructuralFeature"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

