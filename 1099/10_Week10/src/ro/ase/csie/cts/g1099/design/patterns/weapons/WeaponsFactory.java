package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class WeaponsFactory {
	
	public static AbstractWeapon getWeapon(WeaponType type, String model) {
		
		boolean isUsingWater = false;
		
		switch(type) {
		case PISTOL:
			return new Pistol(model, isUsingWater);
		case MACHINE_GUN:
			return new MachineGun(model, MachineGun.DEFAULT_FIRE_RATE, 0);
		case BAZOOKA:
			return new Bazooka(model, 500);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
