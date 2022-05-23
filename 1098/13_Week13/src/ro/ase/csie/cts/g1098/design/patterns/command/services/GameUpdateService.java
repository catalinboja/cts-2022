package ro.ase.csie.cts.g1098.design.patterns.command.services;

public class GameUpdateService implements ExecutorServiceInterface{

	@Override
	public void executeService(String details, String serviceIP) {
		System.out.println("Updating game data from " + serviceIP);
	}

}
