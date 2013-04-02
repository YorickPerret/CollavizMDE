package CollavizKermeta2.Helper
trait CollavizHelper extends `_root_`.k2.standard.KermetaObject{

    def searchRootElement(o : _root_.collaviz.WorldObject):_root_.collaviz.WorldObject
    def loadModel(uri : _root_.java.lang.String):_root_.k2.standard.KermetaObject
    def initAuthorizedClasses():_root_.scala.Unit
    def isAuthorizedClasse(nameClasse : _root_.java.lang.String):_root_.java.lang.Boolean
}

