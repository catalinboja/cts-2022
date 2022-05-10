package ro.ase.csie.cts.g1098.design.patterns.flyweight.initial;

public class Main {

	public static void main(String[] args) {
		
		Building3DModel building1 = 
				new Building3DModel(
						"Normal building.draw", 
						new DisplaySettings(10,10,"Grey"));
		
		Building3DModel building2 = 
				new Building3DModel(
						"Normal building.draw", 
						new DisplaySettings(50,320,"Light Grey"));
		
		Building3DModel building3 = 
				new Building3DModel(
						"Normal building.draw", 
						new DisplaySettings(200,350,"Grey"));
		
	}

}
