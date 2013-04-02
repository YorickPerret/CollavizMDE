package CollavizKermeta2.VisitorMondePackage
trait VisitorCollaviz extends `_root_`.CollavizKermeta2.VisitorMondePackage.VisitorInterface{

    override def visitCollaviz(c : _root_.collaviz.Collaviz, indentation : _root_.java.lang.String):_root_.java.lang.String
    override def visitBall(b : _root_.collaviz.Ball, indentation : _root_.java.lang.String):_root_.java.lang.String
    override def visitJuncture(juncture : _root_.collaviz.Juncture, indentation : _root_.java.lang.String):_root_.java.lang.String
    override def visitDirectionalLight(l : _root_.collaviz.DirectionalLight, indentation : _root_.java.lang.String):_root_.java.lang.String
    override def visitPointLight(l : _root_.collaviz.PointLight, indentation : _root_.java.lang.String):_root_.java.lang.String
}

