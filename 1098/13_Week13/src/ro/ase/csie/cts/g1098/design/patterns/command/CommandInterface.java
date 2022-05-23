package ro.ase.csie.cts.g1098.design.patterns.command;

public interface CommandInterface {
	
	public abstract void executeFutureAction();
	public abstract int getPriority();
}
