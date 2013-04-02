package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait ETypeParameterAspect extends CollavizKermeta2.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.ETypeParameter{
  def ScalaeBounds : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.ecore.ETypeParameterAspect,_root_.org.eclipse.emf.ecore.EGenericType]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.ecore.ETypeParameterAspect,_root_.org.eclipse.emf.ecore.EGenericType](thisUpper = -1,value=this.getEBounds())}
  def ScalaeBounds_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EGenericType]):Unit={
	this.getEBounds().clear
	this.getEBounds().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.ETypeParameter"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
