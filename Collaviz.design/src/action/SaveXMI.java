package action;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.viewpoint.business.internal.metamodel.spec.DSemanticDiagramSpec;
import fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction;

public class SaveXMI implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		System.out.println(true);
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		
	}

}
