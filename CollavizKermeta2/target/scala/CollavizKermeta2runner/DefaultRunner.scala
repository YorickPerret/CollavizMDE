package CollavizKermeta2runner 
import java.io.PrintStream
import ScalaImplicit.CollavizKermeta2.ImplicitConversion._
class DefaultRunner  {
  def init() : Unit = {
        k2.persistence.EcorePackages.workspaceURI = "null"
    k2.persistence.EcorePackages.pluginURI = "null";

    {
      var pack : _root_.org.eclipse.emf.ecore.EcorePackage =  _root_.org.eclipse.emf.ecore.impl.EcorePackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)
      pack.setEFactoryInstance(CollavizKermeta2.ecore.KerRichFactory)
       var f : java.lang.reflect.Field = classOf[_root_.org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
      f.setAccessible(true)
      f.set(pack, CollavizKermeta2.ecore.KerRichFactory)
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
      org.eclipse.emf.ecore.impl.EcorePackageImpl.init
    }

    {
      var pack : _root_.org.kermeta.language.behavior.BehaviorPackage = _root_.org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`kermeta_standard`.org.kermeta.language.behavior.KerRichFactory)
    }


    {
      var pack : _root_.org.kermeta.language.structure.StructurePackage = _root_.org.kermeta.language.structure.impl.StructurePackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`kermeta_standard`.org.kermeta.language.structure.KerRichFactory)
    }


    {
      var pack : _root_.collaviz.CollavizPackage = _root_.collaviz.impl.CollavizPackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.collaviz.CollavizPackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.collaviz.CollavizPackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(CollavizKermeta2.collaviz.KerRichFactory)
    }


      k2.utils.ReflexivityLoader.pref("CollavizKermeta2")

      k2.utils.UTilScala.setScalaAspectPrefix("CollavizKermeta2")
  }
  def init4eclipse() : Unit = {
	_root_.org.eclipse.emf.ecore.impl.EcorePackageImpl.init().setEFactoryInstance(CollavizKermeta2.ecore.KerRichFactory)
_root_.org.kermeta.language.behavior.impl.BehaviorPackageImpl.init().setEFactoryInstance(`kermeta_standard`.org.kermeta.language.behavior.KerRichFactory)
_root_.org.kermeta.language.structure.impl.StructurePackageImpl.init().setEFactoryInstance(`kermeta_standard`.org.kermeta.language.structure.KerRichFactory)
_root_.collaviz.impl.CollavizPackageImpl.init().setEFactoryInstance(CollavizKermeta2.collaviz.KerRichFactory)

    k2.utils.ReflexivityLoader.pref("CollavizKermeta2")

    k2.utils.UTilScala.setScalaAspectPrefix("CollavizKermeta2")
  }
}
object DefaultRunner extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)

  }
}
