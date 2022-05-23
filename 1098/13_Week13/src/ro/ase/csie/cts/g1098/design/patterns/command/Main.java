package ro.ase.csie.cts.g1098.design.patterns.command;

import ro.ase.csie.cts.g1098.design.patterns.command.services.ForumUpdateService;
import ro.ase.csie.cts.g1098.design.patterns.command.services.GameUpdateService;

public class Main {

	public static void main(String[] args) {
		
		CommandInterface forumUpdate = 
				new AsyncCommand(
						new ForumUpdateService(),
						"Update forum",
						"10.0.0.1",
						1);
		
		CommandInterface gameUpdate = 
				new AsyncCommand(new GameUpdateService(), 
						"Update", "127.0.0.1", 5);
		
		AsyncTasksManager manager = new AsyncTasksManager();
		
		System.out.println("Game starts ....");
		//sync call to the action
		//forumUpdate.executeFutureAction();
		
		manager.addTask(forumUpdate);
		manager.addTask(gameUpdate);
		
		System.out.println("Game is still running ....");
		
		//normally on a different thread
		manager.executeNextCommand();
		
		System.out.println("Game is still running ....");
		
		manager.executeNextCommand();
		
		System.out.println("Game is still running ....");
		
	}

}
