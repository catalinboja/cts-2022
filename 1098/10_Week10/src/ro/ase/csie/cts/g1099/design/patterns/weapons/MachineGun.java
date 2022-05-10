package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class MachineGun extends AbstractWeapon{

	public static final float DEFAULT_FIRE_RATE = 32;
	float fireRate;
	int distance;
	
	protected MachineGun(String model, float fireRate, int distance) {
		super(model);
		this.fireRate = fireRate;
		this.distance = distance;
	}

	@Override
	public void reload() {
		System.out.println("Machine gun reloading");
	}

	@Override
	public void shoot() {
		System.out.println("-->--->--->--->");
	}

	public float getFireRate() {
		return fireRate;
	}

	public void setFireRate(float fireRate) {
		this.fireRate = fireRate;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	

}
