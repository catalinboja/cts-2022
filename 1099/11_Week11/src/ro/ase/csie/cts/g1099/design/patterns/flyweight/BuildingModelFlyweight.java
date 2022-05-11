package ro.ase.csie.cts.g1099.design.patterns.flyweight;

public class BuildingModelFlyweight implements BuildingModelInterface {

	String fileName;
	int[] points;
	
	
	
	public BuildingModelFlyweight(String fileName) {
		super();
		this.fileName = fileName;
		System.out.println("Loading tge model from " + this.fileName);
		this.points = new int[(int) 1e6];
	}


	@Override
	public void display(DisplaySettings settings) {
		System.out.println("Displaying the building");
		System.out.println(
				String.format("Coordinates %d,%d and color %s",
						settings.getX(),
						settings.getY(),
						settings.getColor()));
	}

}
