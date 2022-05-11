package ro.ase.csie.cts.g1099.design.patterns.flyweight.initial;

public class Main {
	public static void main(String[] args) {
		
		Building3DModel building1 = 
				new Building3DModel("victorian house.model",
						new DisplaySettings(10, 10, "Grey"));
		
		Building3DModel building2 = 
				new Building3DModel("victorian house.model",
						new DisplaySettings(509, 100, "Light Grey"));
		
		Building3DModel building3 = 
				new Building3DModel("victorian house.model",
						new DisplaySettings(78, 100, "Grey"));
		
		building1.display();
		building2.display();
		building3.display();
		
	}
}
