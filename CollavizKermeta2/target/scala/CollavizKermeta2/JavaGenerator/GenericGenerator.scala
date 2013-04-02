package CollavizKermeta2.JavaGenerator
trait GenericGenerator extends `_root_`.k2.standard.KermetaObject{

    def generateInterface(eclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String
    def generateBeginClasse(eclass : _root_.org.eclipse.emf.ecore.EClass, esuperclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String
    def generateConstructor(eclass : _root_.org.eclipse.emf.ecore.EClass, esuperclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String
    def generateOperation(o : _root_.org.eclipse.emf.ecore.EOperation):_root_.java.lang.String
    def generateParameterPut():_root_.java.lang.String
    def generateRegisterModificationCallback(a : _root_.org.eclipse.emf.ecore.EAttribute):_root_.java.lang.String
    def generateProcessUpdate():_root_.java.lang.String
    def generateProcessModify():_root_.java.lang.String
    def generateEndClasse():_root_.java.lang.String
}

