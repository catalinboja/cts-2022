package ro.ase.csie.cts.g1099.design.patterns.command.services;

public class ForumUpdate implements ServiceInterface{

	@Override
	public void action(String details, String serviceIp) {
		System.out.println("Getting new messages from forum.");
		System.out.println("For player: " + details);
	}

}
