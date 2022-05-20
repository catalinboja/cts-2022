package ro.ase.csie.cts.g1099.design.patterns.chain;

public abstract class AbstractMessageHandler {

	AbstractMessageHandler next;
	
	public void setNextHandler(AbstractMessageHandler next) {
		this.next = next;
	}
	
	public abstract void process(Message msg);
	
}
