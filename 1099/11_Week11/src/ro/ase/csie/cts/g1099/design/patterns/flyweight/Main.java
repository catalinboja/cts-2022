package ro.ase.csie.cts.g1099.design.patterns.flyweight;


public class Main {

	public static void main(String[] args) {

		BuildingModelInterface building1 = 
				BuildingFactory.getBuildingModel("victorian house.model");
		
		BuildingModelInterface building2 = 
				BuildingFactory.getBuildingModel("victorian house.model");
		
		BuildingModelInterface building3 = 
				BuildingFactory.getBuildingModel("victorian house.model");
		
		building1.display(new DisplaySettings(10, 10, "Grey"));
		building2.display(new DisplaySettings(500, 150, "Light Grey"));
		building3.display(new DisplaySettings(400, 200, "Light Grey"));
		
	}

}
