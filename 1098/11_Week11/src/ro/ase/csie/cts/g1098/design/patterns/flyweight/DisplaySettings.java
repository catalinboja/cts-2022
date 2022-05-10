package ro.ase.csie.cts.g1098.design.patterns.flyweight;

public class DisplaySettings {
	
	int X;
	int Y;
	String textureColor;
	
	public DisplaySettings(int x, int y, String textureColor) {
		super();
		X = x;
		Y = y;
		this.textureColor = textureColor;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public String getTextureColor() {
		return textureColor;
	}
	
	
}
