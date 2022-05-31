package ro.ase.csie.cts.g1099.design.patterns.command;

import java.util.ArrayList;

public class AsyncTasksManager {
	
	ArrayList<CommandInterface> asyncTasks = new ArrayList<>();
	
	public void addAsyncCommand(CommandInterface task) {
		this.asyncTasks.add(task);
	}
	
	public void executeNextTask() {
		//get the next task with the highest priority
		
		//get the next task from the queue
		if(asyncTasks.size() > 0) {
			CommandInterface command = asyncTasks.get(0);
			asyncTasks.remove(0);
			command.execute();
		}
		
	}
	
}
