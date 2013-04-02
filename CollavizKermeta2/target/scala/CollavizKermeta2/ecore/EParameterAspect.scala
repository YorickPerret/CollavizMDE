package CollavizKermeta2.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait EParameterAspect extends CollavizKermeta2.ecore.ETypedElementAspect with `_root_`.org.eclipse.emf.ecore.EParameter{
  def ScalaeOperation : _root_.org.eclipse.emf.ecore.EOperation={this.getEOperation().asInstanceOf[_root_.org.eclipse.emf.ecore.EOperation]}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EParameter"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

