package Action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;

import collaviz.Collaviz;
import fr.obeo.dsl.viewpoint.*;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.ViewpointGMFHelper;






public class Save implements fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction{

	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		ArrayList<EObject> param = (ArrayList<EObject>) parameters.get(new String("essai"));
		System.out.println(param.get(0));
		EList<EObject> l = param.get(0).eContents();
		LinkedList<DNode> ldnode = getDNode(l);
		
		for(DNode dn : ldnode){
			System.out.println(dn);
			System.out.println(dn.getName());
			System.out.println(dn.getOwnedStyle().eContents().get(2));
			Node v = ViewpointGMFHelper.getGmfNode(dn);
			Bounds lc = (Bounds) v.getLayoutConstraint();
			System.out.println("constraints "+lc.getX()+" "+lc.getY());
			
		}
		//on récupère Collaviz (le modèle)
		Collaviz c = (Collaviz) selections.iterator().next();
		System.out.println(c);
	}
	
	private LinkedList<DNode> getDNode(EList<EObject> l){
		LinkedList<DNode> res = new LinkedList<DNode>();
		for(EObject o : l){
			if(o.eClass().getName().equals("DNode")){
				res.add((DNode) o);
			}
		}
		return res;
		
	}

}
