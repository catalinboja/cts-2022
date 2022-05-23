package ro.ase.csie.cts.g1098.design.patterns.command;

import ro.ase.csie.cts.g1098.design.patterns.command.services.ExecutorServiceInterface;

public class AsyncCommand implements CommandInterface{

	
	ExecutorServiceInterface service;
	String futureActionDetails;
	String futureActionServiceIp;
	int priority;
	
	public AsyncCommand(ExecutorServiceInterface service, String futureActionDetails, String futureActionServiceIp,
			int priority) {
		super();
		this.service = service;
		this.futureActionDetails = futureActionDetails;
		this.futureActionServiceIp = futureActionServiceIp;
		this.priority = priority;
	}

	@Override
	public void executeFutureAction() {
		//callback to the service method
		this.service.executeService(
				futureActionDetails, futureActionServiceIp);
		
	}

	@Override
	public int getPriority() {
		return this.priority;
	}
	
}
