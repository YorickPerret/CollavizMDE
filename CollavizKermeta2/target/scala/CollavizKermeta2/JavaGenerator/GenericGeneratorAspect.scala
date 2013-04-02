package CollavizKermeta2.JavaGenerator
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait GenericGeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.CollavizKermeta2.JavaGenerator.GenericGenerator{

    def generateInterface(eclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateBeginClasse(eclass : _root_.org.eclipse.emf.ecore.EClass, esuperclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateConstructor(eclass : _root_.org.eclipse.emf.ecore.EClass, esuperclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateOperation(o : _root_.org.eclipse.emf.ecore.EOperation):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateParameterPut():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateRegisterModificationCallback(a : _root_.org.eclipse.emf.ecore.EAttribute):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateProcessUpdate():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateProcessModify():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 
        }
 return `~result`
}

    def generateEndClasse():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
try{
`~result` = ("\n}").asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("JavaGenerator.GenericGenerator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

