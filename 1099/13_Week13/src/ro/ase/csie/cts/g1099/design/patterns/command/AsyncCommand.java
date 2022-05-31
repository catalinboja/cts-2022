package ro.ase.csie.cts.g1099.design.patterns.command;

import ro.ase.csie.cts.g1099.design.patterns.command.services.ServiceInterface;

public class AsyncCommand implements CommandInterface{

	ServiceInterface commandExecutor;
	String commandDetails;
	String serviceIp;
	int priority;
		
	public AsyncCommand(ServiceInterface commandExecutor, String commandDetails, String serviceIp, int priority) {
		super();
		this.commandExecutor = commandExecutor;
		this.commandDetails = commandDetails;
		this.serviceIp = serviceIp;
		this.priority = priority;
	}

	@Override
	public void execute() {
		if(this.commandExecutor != null) {
			this.commandExecutor.action(commandDetails, serviceIp);
		}
	}

	@Override
	public int getPriority() {
		return this.priority;
	}

}
