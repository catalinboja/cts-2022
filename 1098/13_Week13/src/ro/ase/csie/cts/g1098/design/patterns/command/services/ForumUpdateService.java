package ro.ase.csie.cts.g1098.design.patterns.command.services;

public class ForumUpdateService implements ExecutorServiceInterface{

	@Override
	public void executeService(String details, String serviceIP) {
		System.out.println("Updating forum data....");
		System.out.println("Details: " + details);
	}

}
