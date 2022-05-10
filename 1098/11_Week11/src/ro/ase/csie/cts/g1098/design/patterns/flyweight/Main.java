package ro.ase.csie.cts.g1098.design.patterns.flyweight;

public class Main {

	public static void main(String[] args) {

		FlyweightInterface building1 = 
				Models3DFactory.get3DModel("Normal building.draw");
		
		FlyweightInterface building2 = 
				Models3DFactory.get3DModel("Normal building.draw");
				
		FlyweightInterface building3 = 
				Models3DFactory.get3DModel("Normal building.draw");
		
		building1.display(new DisplaySettings(10,10,"Grey"));
		building2.display(new DisplaySettings(200,10,"Light Grey"));
		building3.display(new DisplaySettings(300,58,"Green"));
		
		//you can use only 1 reference to same building
//		building1.display(new DisplaySettings(10,10,"Grey"));
//		building1.display(new DisplaySettings(200,10,"Light Grey"));
//		building1.display(new DisplaySettings(300,58,"Green"));
		
		
		//if this takes a lot for each object
		//we need a prototype
		Model3D test1 = new Model3D("Normal building.draw");
		Model3D test2 = new Model3D("Normal building.draw");
		Model3D test5 = new Model3D("Normal building.draw");
		
	}

}
