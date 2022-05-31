package ro.ase.csie.cts.g1099.design.patterns.command.services;

public class BackupService implements ServiceInterface{

	@Override
	public void action(String details, String serviceIp) {
		System.out.println("Backing up the player data");
		System.out.println("Connecting to " + serviceIp);
	}

}
