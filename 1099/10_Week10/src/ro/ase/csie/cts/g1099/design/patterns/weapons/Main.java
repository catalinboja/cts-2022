package ro.ase.csie.cts.g1099.design.patterns.weapons;

public class Main {

	public static void main(String[] args) {
		
		boolean isUsingWater = true;
		AbstractWeapon pistol = new Pistol("Water gun", isUsingWater);
		//AbstractWeapon machineGun = new MachineGun("MP32", MachineGun.DEFAULT_FIRE_RATE);
		
		//using the factory
		AbstractWeapon machineGun = 
				WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MP40");
		pistol = WeaponsFactory.getWeapon(WeaponType.PISTOL, "PT10");
		
		if(machineGun instanceof MachineGun) {
			MachineGun mg = (MachineGun)machineGun;
			mg.setFireRate(50);
		}
	}

}
