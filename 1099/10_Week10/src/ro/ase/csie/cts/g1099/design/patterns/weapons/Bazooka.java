package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class Bazooka extends AbstractWeapon{

	int distance;
	
	protected Bazooka(String model, int distance) {
		super(model);
		this.distance = distance;
	}

	@Override
	public void reload() {
		System.out.println("Reloading rocket");
	}

	@Override
	public void shoot() {
		System.out.println("-----(********)");
	}
	
	
}
