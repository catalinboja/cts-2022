package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class Pistol extends AbstractWeapon {
	
	boolean isUsingWater;

	public Pistol(String model, boolean isUsingWater) {
		super(model);
		this.isUsingWater = isUsingWater;
	}

	@Override
	public void reload() {
		System.out.println("Pistol is reloading");
	}

	@Override
	public void shoot() {
		System.out.println("----->");
	}
}
