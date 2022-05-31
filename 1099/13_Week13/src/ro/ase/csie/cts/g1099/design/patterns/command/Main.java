package ro.ase.csie.cts.g1099.design.patterns.command;

import ro.ase.csie.cts.g1099.design.patterns.command.services.BackupService;
import ro.ase.csie.cts.g1099.design.patterns.command.services.ForumUpdate;
import ro.ase.csie.cts.g1099.design.patterns.command.services.ServiceInterface;

public class Main {

	public static void main(String[] args) {
		
		//define the services
		ServiceInterface backup = new BackupService();
		ServiceInterface forum = new ForumUpdate();
		
		//define the command manager
		AsyncTasksManager manager = new AsyncTasksManager();
		
		System.out.println("Game starts....");
		System.out.println("Player is playing....");
		//create an async task for backup
		manager.addAsyncCommand(
				new AsyncCommand(backup, "Auto-backup", "10.0.0.1", 5));
		manager.addAsyncCommand(new AsyncCommand(backup, "@john", "127.0.0.1", 3));
		
		System.out.println("Player is playing....");
		
		manager.executeNextTask();
		
		System.out.println("Player is playing....");
		
		manager.executeNextTask();
		
	}

}
