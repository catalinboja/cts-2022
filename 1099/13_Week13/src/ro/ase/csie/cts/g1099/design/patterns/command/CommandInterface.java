package ro.ase.csie.cts.g1099.design.patterns.command;

public interface CommandInterface {
	public abstract void execute();
	public abstract int getPriority();
}
