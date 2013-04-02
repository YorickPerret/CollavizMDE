package CollavizKermeta2.VisitorMondePackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.CollavizKermeta2.ImplicitConversion._
trait VisitorCollavizAspect  extends _root_.CollavizKermeta2.VisitorMondePackage.VisitorInterfaceAspect with `_root_`.CollavizKermeta2.VisitorMondePackage.VisitorCollaviz{

    override def visitCollaviz(c : _root_.collaviz.Collaviz, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var generateWorld : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
var wg : _root_.CollavizKermeta2.Generator.WorldGenerator = _root_.CollavizKermeta2.Generator.KerRichFactory.createWorldGenerator;
var collavizHelper : _root_.CollavizKermeta2.Helper.CollavizHelper = _root_.CollavizKermeta2.Helper.KerRichFactory.createCollavizHelper;
((c).Scalaobjects).each({(o : _root_.collaviz.WorldObject)=>

{
try{
(o).Scalavisit = (false).asInstanceOf[_root_.java.lang.Boolean];
}catch { case e:ClassCastException => {}}
}
})
(generateWorld).append((wg).generateIndex())
((c).Scalalights).each({(l : _root_.collaviz.Light)=>

{
(generateWorld).append((l).accept(this, "\t"))}
})
((c).Scalaobjects).each({(o : _root_.collaviz.WorldObject)=>

{
if ((((o).Scalavisit) == (false)))

{
var e : _root_.collaviz.WorldObject = null.asInstanceOf[_root_.collaviz.WorldObject];
try{
e = ((collavizHelper).searchRootElement(o)).asInstanceOf[_root_.collaviz.WorldObject];
}catch { case e:ClassCastException => {}}

(generateWorld).append((e).accept(this, "\t"))}
}
})
(generateWorld).append((wg).generateEnd())
try{
`~result` = (_root_.k2.utils.UTilScala.toString((generateWorld))).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    override def visitBall(b : _root_.collaviz.Ball, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var stringBuffer : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
(stringBuffer).append((((("\n").plus(indentation)).plus("<virtualObject id=\"")).plus((b).Scalaname)).plus("\" type=\"BallObject\">\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<owners>All</owners>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<accessLevel>3</accessLevel>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<refProxy>true</refProxy>\n"))
(stringBuffer).append(((((((((((((((((((((indentation).plus("\t")).plus("<param name=\"Transform\" type=\"Transform\">")).plus((((b).Scalaposition).Scalatranslation).Scalax)).plus(" ")).plus((((b).Scalaposition).Scalatranslation).Scalay)).plus(" ")).plus((((b).Scalaposition).Scalatranslation).Scalaz)).plus(" ")).plus((((b).Scalaposition).Scalarotation).Scalax)).plus(" ")).plus((((b).Scalaposition).Scalarotation).Scalay)).plus(" ")).plus((((b).Scalaposition).Scalarotation).Scalaz)).plus(" ")).plus((((b).Scalaposition).Scalascale).Scalax)).plus(" ")).plus((((b).Scalaposition).Scalascale).Scalay)).plus(" ")).plus((((b).Scalaposition).Scalascale).Scalaz)).plus("</param>\n"))
(stringBuffer).append((((((((((indentation).plus("\t")).plus("<param name=\"Color\" type=\"Color\">")).plus(((b).Scalacolor).Scalar)).plus(" ")).plus(((b).Scalacolor).Scalag)).plus(" ")).plus(((b).Scalacolor).Scalab)).plus(" ")).plus("</param>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<param name=\"Geometry\" type=\"String\">ball</param>\n"))
((b).Scalasupported).each({(o : _root_.collaviz.SupportedObject)=>

{
(stringBuffer).append((o).accept(this, (indentation).plus("\t")))}
})
(stringBuffer).append((indentation).plus("</virtualObject>\n"))
try{
(b).Scalavisit = (true).asInstanceOf[_root_.java.lang.Boolean];
}catch { case e:ClassCastException => {}}

try{
`~result` = (_root_.k2.utils.UTilScala.toString((stringBuffer))).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    override def visitJuncture(juncture : _root_.collaviz.Juncture, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var stringBuffer : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
(stringBuffer).append((((("\n").plus(indentation)).plus("<virtualObject id=\"")).plus((juncture).Scalaname)).plus("\" type=\"JunctureObject\">\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<owners>All</owners>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<accessLevel>3</accessLevel>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<refProxy>true</refProxy>\n"))
(stringBuffer).append((((((((((indentation).plus("\t")).plus("<param name=\"Color\" type=\"Color\">")).plus(((juncture).Scalacolor).Scalar)).plus(" ")).plus(((juncture).Scalacolor).Scalag)).plus(" ")).plus(((juncture).Scalacolor).Scalab)).plus(" ")).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"End1\" type=\"String\">")).plus(((juncture).ScalabeginBall).Scalaname)).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"End2\" type=\"String\">")).plus(((juncture).ScalaendBall).Scalaname)).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"Radius\" type=\"double\">")).plus((juncture).Scalaradius)).plus("</param>\n"))
((juncture).Scalasupported).each({(o : _root_.collaviz.SupportedObject)=>

{
(stringBuffer).append((o).accept(this, (indentation).plus("\t")))}
})
(stringBuffer).append((indentation).plus("</virtualObject>\n\n"))
try{
(juncture).Scalavisit = (true).asInstanceOf[_root_.java.lang.Boolean];
}catch { case e:ClassCastException => {}}

try{
`~result` = (_root_.k2.utils.UTilScala.toString((stringBuffer))).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    override def visitDirectionalLight(l : _root_.collaviz.DirectionalLight, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var stringBuffer : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
(stringBuffer).append((((("\n").plus(indentation)).plus("<virtualObject id=\"")).plus((l).Scalaname)).plus("\" type=\"DirectionalLight\">\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<owners>All</owners>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<accessLevel>3</accessLevel>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<refProxy>true</refProxy>\n"))
(stringBuffer).append(((((((((indentation).plus("\t")).plus("<param name=\"Direction\" type=\"Vector3d\">")).plus(((l).ScalaDirection).Scalax)).plus(" ")).plus(((l).ScalaDirection).Scalay)).plus(" ")).plus(((l).ScalaDirection).Scalaz)).plus("</param>\n"))
(stringBuffer).append(((((((((indentation).plus("\t")).plus("<param name=\"LightColor\" type=\"Color\">")).plus(((l).ScalaLightColor).Scalar)).plus(" ")).plus(((l).ScalaLightColor).Scalab)).plus(" ")).plus(((l).ScalaLightColor).Scalag)).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"Geometry\" type=\"String\">")).plus((l).Scalageometry)).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"IsOn\" type=\"boolean\">")).plus((l).ScalaIsOn)).plus("</param>\n"))
try{
`~result` = (_root_.k2.utils.UTilScala.toString((stringBuffer))).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    override def visitPointLight(l : _root_.collaviz.PointLight, indentation : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var stringBuffer : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
(stringBuffer).append((((("\n").plus(indentation)).plus("<virtualObject id=\"")).plus((l).Scalaname)).plus("\" type=\"PointLight\">\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<owners>All</owners>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<accessLevel>3</accessLevel>\n"))
(stringBuffer).append(((indentation).plus("\t")).plus("<refProxy>true</refProxy>\n"))
(stringBuffer).append(((((((((indentation).plus("\t")).plus("<param name=\"LightColor\" type=\"Color\">")).plus(((l).ScalaLightColor).Scalar)).plus(" ")).plus(((l).ScalaLightColor).Scalab)).plus(" ")).plus(((l).ScalaLightColor).Scalag)).plus("</param>\n"))
(stringBuffer).append(((((((((indentation).plus("\t")).plus("<param name=\"Attenuation\" type=\"Vector3d\">")).plus(((l).ScalaAttenuation).Scalax)).plus(" ")).plus(((l).ScalaAttenuation).Scalay)).plus(" ")).plus(((l).ScalaAttenuation).Scalaz)).plus("</param>\n"))
(stringBuffer).append(((((((((((((((((((((indentation).plus("\t")).plus("<param name=\"Transform\" type=\"Transform\">")).plus((((l).ScalaTransform).Scalatranslation).Scalax)).plus(" ")).plus((((l).ScalaTransform).Scalatranslation).Scalay)).plus(" ")).plus((((l).ScalaTransform).Scalatranslation).Scalaz)).plus(" ")).plus((((l).ScalaTransform).Scalarotation).Scalax)).plus(" ")).plus((((l).ScalaTransform).Scalarotation).Scalay)).plus(" ")).plus((((l).ScalaTransform).Scalarotation).Scalaz)).plus(" ")).plus((((l).ScalaTransform).Scalascale).Scalax)).plus(" ")).plus((((l).ScalaTransform).Scalascale).Scalay)).plus(" ")).plus((((l).ScalaTransform).Scalascale).Scalaz)).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"Geometry\" type=\"String\">")).plus((l).Scalageometry)).plus("</param>\n"))
(stringBuffer).append(((((indentation).plus("\t")).plus("<param name=\"IsOn\" type=\"boolean\">")).plus((l).ScalaIsOn)).plus("</param>\n"))
try{
`~result` = (_root_.k2.utils.UTilScala.toString((stringBuffer))).asInstanceOf[_root_.java.lang.String];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("VisitorMondePackage.VisitorCollaviz"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

