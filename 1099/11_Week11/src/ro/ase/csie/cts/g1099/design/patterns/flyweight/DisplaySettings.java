package ro.ase.csie.cts.g1099.design.patterns.flyweight;

public class DisplaySettings {
	
	int x;
	int y;
	String color;
	
	
	public DisplaySettings(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public String getColor() {
		return color;
	}
	
	
	
}
