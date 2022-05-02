package ro.ase.csie.cts.g1098.deisign.patterns.weapons;

public class WeaponsFactory {

	public static IWeapon getWeapon(WeaponType type, String model) {
		switch(type) {
		case PISTOL:
			return new Pistol(model, Pistol.NOT_USING_WATER);
		case MACHINE_GUN:
			//don't use magic numbers
			return new MachineGun(model, 100, 50);
		case BAZOOKA:
			return new Bazooka(model, 1000);
		default:
			throw new UnsupportedOperationException();
		}
	}
	
}
