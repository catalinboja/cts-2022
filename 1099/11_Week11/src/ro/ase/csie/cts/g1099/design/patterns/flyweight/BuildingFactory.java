package ro.ase.csie.cts.g1099.design.patterns.flyweight;

import java.util.HashMap;

public class BuildingFactory {
	
	static private HashMap<String, BuildingModelInterface> models = new HashMap<>();
	
	public static BuildingModelInterface getBuildingModel(String fileName) {
		
		BuildingModelInterface model = models.get(fileName);
		
		if(model == null) {
			model = new BuildingModelFlyweight(fileName);
			models.put(fileName, model);
		}
		
		return model;
		
	}
}
