package ro.ase.csie.cts.g1098.deisign.patterns.weapons;

public class Main {

	public static void main(String[] args) {
		
		//using weapons without the factory
		IWeapon weapon = new Pistol("Water pistol", true);
		//IWeapon secondWeapon = new MachineGun("Ultimate rifle", 100);
		
		
		IWeapon anotherWeapon = 
				WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Army");
		((Bazooka)anotherWeapon).setMaxDistance(2000);
	}

}
