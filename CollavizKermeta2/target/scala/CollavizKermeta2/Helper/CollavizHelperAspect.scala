package CollavizKermeta2.Helper
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait CollavizHelperAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.CollavizKermeta2.Helper.CollavizHelper{
var authorizedClasses : k2.standard.KermetaSet[_root_.java.lang.String] = k2.standard.KerRichFactory.createSet[_root_.java.lang.String]
  def KergetAuthorizedClasses() : k2.standard.KermetaSet[_root_.java.lang.String]={this.authorizedClasses}
  def KersetAuthorizedClasses(arg:k2.standard.KermetaSet[_root_.java.lang.String])={ this.authorizedClasses = arg}
  def ScalaauthorizedClasses : k2.standard.ReflectiveSet[CollavizKermeta2.Helper.CollavizHelperAspect,_root_.java.lang.String]={    new k2.standard.RichReflectiveSet[CollavizKermeta2.Helper.CollavizHelperAspect,_root_.java.lang.String](thisUpper = -1,value=this.KergetAuthorizedClasses())}
  def ScalaauthorizedClasses_=(`~value` : k2.standard.KermetaSet[_root_.java.lang.String]):Unit={
	this.KergetAuthorizedClasses().clear
	this.KergetAuthorizedClasses().addAll(`~value`)
	  }

    def searchRootElement(o : _root_.collaviz.WorldObject):_root_.collaviz.WorldObject = {
var `~result` : _root_.collaviz.WorldObject = null.asInstanceOf[_root_.collaviz.WorldObject]; 
  { 


{
var so : _root_.collaviz.SupportedObject = null.asInstanceOf[_root_.collaviz.SupportedObject];
try{
so = (o).asInstanceOf[_root_.collaviz.SupportedObject];
}catch { case e:ClassCastException => {}}

if (_root_.k2.utils.UTilScala.isNotEqual((so),null))

{
if (_root_.k2.utils.UTilScala.isNotEqual(((so).Scalasupport),null))

{
try{
`~result` = ((this).searchRootElement((so).Scalasupport)).asInstanceOf[_root_.collaviz.WorldObject];
}catch { case e:ClassCastException => {}}
}
else 


{
try{
`~result` = (so).asInstanceOf[_root_.collaviz.WorldObject];
}catch { case e:ClassCastException => {}}
}
}
else 


{
try{
`~result` = (o).asInstanceOf[_root_.collaviz.WorldObject];
}catch { case e:ClassCastException => {}}
}
}
        }
 return `~result`
}

    def loadModel(uri : _root_.java.lang.String):_root_.k2.standard.KermetaObject = {
var `~result` : _root_.k2.standard.KermetaObject = null.asInstanceOf[_root_.k2.standard.KermetaObject]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(uri);
(resource).load(null)
try{
`~result` = (((resource).kgetContents()).one()).asInstanceOf[_root_.k2.standard.KermetaObject];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    def initAuthorizedClasses():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
((this).ScalaauthorizedClasses).add("Ball")
((this).ScalaauthorizedClasses).add("Juncture")}
        }
 
}

    def isAuthorizedClasse(nameClasse : _root_.java.lang.String):_root_.java.lang.Boolean = {
var `~result` : _root_.java.lang.Boolean = null.asInstanceOf[_root_.java.lang.Boolean]; 
  { 


{
try{
`~result` = (((this).ScalaauthorizedClasses).exists({(n : _root_.java.lang.String)=>

{
((n) == (nameClasse))}
})).asInstanceOf[_root_.java.lang.Boolean];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("Helper.CollavizHelper"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

