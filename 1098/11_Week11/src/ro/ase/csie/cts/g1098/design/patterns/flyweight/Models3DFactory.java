package ro.ase.csie.cts.g1098.design.patterns.flyweight;

import java.util.HashMap;

public class Models3DFactory {
	
	private static HashMap<String, FlyweightInterface> models = new HashMap<>();
	
	public static FlyweightInterface get3DModel(String filename) {
		FlyweightInterface model = models.get(filename);
		if(model == null) {
			model = new Model3D(filename);
			models.put(filename, model);
		}
		
		return model;
	}
}
