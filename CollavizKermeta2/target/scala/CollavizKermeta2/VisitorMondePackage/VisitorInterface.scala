package CollavizKermeta2.VisitorMondePackage
trait VisitorInterface extends `_root_`.k2.standard.KermetaObject{

    def visitCollaviz(c : _root_.collaviz.Collaviz, indentation : _root_.java.lang.String):_root_.java.lang.String
    def visitBall(b : _root_.collaviz.Ball, indentation : _root_.java.lang.String):_root_.java.lang.String
    def visitJuncture(j : _root_.collaviz.Juncture, indentation : _root_.java.lang.String):_root_.java.lang.String
    def visitDirectionalLight(l : _root_.collaviz.DirectionalLight, indentation : _root_.java.lang.String):_root_.java.lang.String
    def visitPointLight(l : _root_.collaviz.PointLight, indentation : _root_.java.lang.String):_root_.java.lang.String
}

