package CollavizKermeta2.collaviz
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait CollavizAspect extends CollavizKermeta2.VisitorMondePackage.VisitableAspect with `_root_`.collaviz.Collaviz{
  def Scalaobjects : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.collaviz.CollavizAspect,_root_.collaviz.WorldObject]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.collaviz.CollavizAspect,_root_.collaviz.WorldObject](thisUpper = -1,value=this.getObjects())}
  def Scalaobjects_=(`~value` : k2.standard.KermetaOrderedSet[_root_.collaviz.WorldObject]):Unit={
	this.getObjects().clear
	this.getObjects().addAll(`~value`)
	  }
  def Scalalights : k2.standard.ReflectiveOrderedSet[CollavizKermeta2.collaviz.CollavizAspect,_root_.collaviz.Light]={    new k2.standard.RichReflectiveOrderedSet[CollavizKermeta2.collaviz.CollavizAspect,_root_.collaviz.Light](thisUpper = -1,value=this.getLights())}
  def Scalalights_=(`~value` : k2.standard.KermetaOrderedSet[_root_.collaviz.Light]):Unit={
	this.getLights().clear
	this.getLights().addAll(`~value`)
	  }

    override def accept(v : _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterface, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ((v).visitCollaviz(this, indentation)).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def checkInvariants(stopOnError : Boolean){
    val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("ObjectsHaveNotTheSameName" -> (()=>{


{
((this).Scalaobjects).forAll({(o1 : _root_.collaviz.WorldObject)=>

{
((this).Scalaobjects).forAll({(o2 : _root_.collaviz.WorldObject)=>

{
(((((o1).Scalaname) == ((o2).Scalaname))).not()).or(((o1) == (o2)))}
})}
})}
}
)),("LightsHaveNotTheSameName" -> (()=>{


{
((this).Scalalights).forAll({(l1 : _root_.collaviz.Light)=>

{
((this).Scalalights).forAll({(l2 : _root_.collaviz.Light)=>

{
(((((l1).Scalaname) == ((l2).Scalaname))).not()).or(((l1) == (l2)))}
})}
})}
}
)) )
if(stopOnError)
  checkParamInvariants(invariants)
else
  checkParamInvariants(invariants, constraintDiagnostic)
}
override def checkAllInvariants(stopOnError : Boolean){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("ObjectsHaveNotTheSameName" -> (()=>{


{
((this).Scalaobjects).forAll({(o1 : _root_.collaviz.WorldObject)=>

{
((this).Scalaobjects).forAll({(o2 : _root_.collaviz.WorldObject)=>

{
(((((o1).Scalaname) == ((o2).Scalaname))).not()).or(((o1) == (o2)))}
})}
})}
}
)),("LightsHaveNotTheSameName" -> (()=>{


{
((this).Scalalights).forAll({(l1 : _root_.collaviz.Light)=>

{
((this).Scalalights).forAll({(l2 : _root_.collaviz.Light)=>

{
(((((l1).Scalaname) == ((l2).Scalaname))).not()).or(((l1) == (l2)))}
})}
})}
}
)) )
if(stopOnError)
  checkParamInvariants(invariants)
else
  checkParamInvariants(invariants, constraintDiagnostic)
Scalaobjects.each(e=>
  if(e!=null)
    e.checkAllInvariants(stopOnError))
Scalalights.each(e=>
  if(e!=null)
    e.checkAllInvariants(stopOnError))
}
override def getInvariants() :  scala.collection.immutable.HashMap[String,Condition] = {
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("ObjectsHaveNotTheSameName" -> (()=>{


{
((this).Scalaobjects).forAll({(o1 : _root_.collaviz.WorldObject)=>

{
((this).Scalaobjects).forAll({(o2 : _root_.collaviz.WorldObject)=>

{
(((((o1).Scalaname) == ((o2).Scalaname))).not()).or(((o1) == (o2)))}
})}
})}
}
)),("LightsHaveNotTheSameName" -> (()=>{


{
((this).Scalalights).forAll({(l1 : _root_.collaviz.Light)=>

{
((this).Scalalights).forAll({(l2 : _root_.collaviz.Light)=>

{
(((((l1).Scalaname) == ((l2).Scalaname))).not()).or(((l1) == (l2)))}
})}
})}
}
)) )
return invariants
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("collaviz.Collaviz"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

