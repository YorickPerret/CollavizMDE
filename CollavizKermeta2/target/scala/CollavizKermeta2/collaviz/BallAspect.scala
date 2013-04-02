package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait BallAspect extends CollavizKermeta2.collaviz.SupportedObjectAspect with CollavizKermeta2.VisitorMondePackage.VisitableAspect with `_root_`.collaviz.Ball{
  def Scalajunctures : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.collaviz.BallAspect,_root_.collaviz.Juncture]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.collaviz.BallAspect,_root_.collaviz.Juncture](thisUpper = -1,value=this.getJunctures())}
  def Scalajunctures_=(`~value` : k2.standard.KermetaOrderedSet[_root_.collaviz.Juncture]):Unit={
	this.getJunctures().clear
	this.getJunctures().addAll(`~value`)
	  }

    override def accept(v : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ((v).visitBall(this, indentation)).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Ball"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

