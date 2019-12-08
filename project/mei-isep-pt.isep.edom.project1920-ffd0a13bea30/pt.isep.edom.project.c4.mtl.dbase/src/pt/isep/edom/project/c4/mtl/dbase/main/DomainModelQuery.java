package pt.isep.edom.project.c4.mtl.dbase.main;

import java.io.IOException;
import java.util.Collections;

import pt.isep.edom.project.c3.mm.domain.DomainFactory;
import pt.isep.edom.project.c3.mm.domain.DomainModel;
import pt.isep.edom.project.c3.mm.domain.DomainPackage;
import pt.isep.edom.project.c3.mm.domain.Entity;
import pt.isep.edom.project.c4.mm.dbase.Table;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class DomainModelQuery {
	
	private static DomainModel myModel = null;
	private static String modelPath = null;

	public static void setModelPath(String path) {
		modelPath=path;
	}
	
	public DomainModelQuery() {
	}
	
	public DomainModel getModel() {
		if (myModel != null) {
			return myModel;
		} else {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("domain",
					new XMIResourceFactoryImpl());

			// Initialize the model
			DomainPackage.eINSTANCE.eClass();

			// Retrieve the default factory singleton
			DomainFactory factory = DomainFactory.eINSTANCE;

			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();

			Resource resource = resSet.getResource(URI.createURI(modelPath), true);

			try {
				resource.load(Collections.EMPTY_MAP);

				EObject root = resource.getContents().get(0);
				myModel = (DomainModel) root;
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			}
			return myModel;
		}
	}
	
	public Entity getDomainEntity(Table table) {
		DomainModel model = getModel();
		Entity myEntity = null;
		for(Entity e: model.getEntities()) {
			if(e.getName().equals(table.getName())) {
				myEntity = e;
			}
		}

		return myEntity;
	}
}
