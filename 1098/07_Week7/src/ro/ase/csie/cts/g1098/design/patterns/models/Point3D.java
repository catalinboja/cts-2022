package ro.ase.csie.cts.g1098.design.patterns.models;

public class Point3D implements Cloneable{
	
	public static final int LIMIT = 101;
	
	int x;
	int y;
	int z;
	
	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Point3D(this.x, this.y, this.z);
	}
	
	
	
	
}
