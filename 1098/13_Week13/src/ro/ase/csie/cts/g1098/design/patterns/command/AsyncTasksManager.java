package ro.ase.csie.cts.g1098.design.patterns.command;
import java.util.ArrayList;

public class AsyncTasksManager {
	
	ArrayList<CommandInterface> tasks = new ArrayList<>();
	
	public void addTask(CommandInterface cmd) {
		this.tasks.add(cmd);
	}
	
	public void executeNextCommand() {
		if(tasks.size() > 0) {
			CommandInterface cmd = tasks.get(0);
			tasks.remove(0);
			cmd.executeFutureAction();
		}
	}
	
}
