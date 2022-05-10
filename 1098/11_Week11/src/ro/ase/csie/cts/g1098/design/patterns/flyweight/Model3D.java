package ro.ase.csie.cts.g1098.design.patterns.flyweight;

public class Model3D implements FlyweightInterface, Cloneable{
	
	String filename;
	int[] points;

	public Model3D(String filename) {
		super();
		this.filename = filename;
		System.out.println("Loading model from " + this.filename);
		this.points = new int[(int) 1e6];
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void display(DisplaySettings displaySettings) {
		System.out.println("Generating the model based on the points array");
		System.out.println(
				String.format("Coordinates %d, %d", 
						displaySettings.getX(),
						displaySettings.getY()));
		System.out.println("Building color: " + displaySettings.getTextureColor());
	}
	
	//implement clone() for Prototype
}
