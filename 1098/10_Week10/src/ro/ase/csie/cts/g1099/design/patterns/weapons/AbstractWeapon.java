package ro.ase.csie.cts.g1099.design.patterns.weapons;

public abstract class AbstractWeapon {
	String model;
	
	protected AbstractWeapon(String model) {
		super();
		this.model = model;
	}
	public abstract void reload();
	public abstract void shoot();
}
