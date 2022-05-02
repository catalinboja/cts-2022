package ro.ase.csie.cts.g1098.deisign.patterns.weapons;

public class Bazooka implements IWeapon{

	String model;
	float maxDistance;
	
	
	public Bazooka(String model, float maxDistance) {
		super();
		this.model = model;
		this.maxDistance = maxDistance;
	}


	@Override
	public void reload(int ammo) {
		System.out.println("Add rocket");
	}


	@Override
	public void shoot() {
		System.out.println("Boom -------> ******** ");
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public float getMaxDistance() {
		return maxDistance;
	}


	public void setMaxDistance(float maxDistance) {
		this.maxDistance = maxDistance;
	}
	
	
	
}
