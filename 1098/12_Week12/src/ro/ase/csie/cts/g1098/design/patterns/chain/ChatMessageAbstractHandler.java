package ro.ase.csie.cts.g1098.design.patterns.chain;

public abstract class ChatMessageAbstractHandler {
	
	protected ChatMessageAbstractHandler next;
	
	public void setNextHandler(ChatMessageAbstractHandler handler) {
		this.next = handler;
	}
	
	public abstract void processMessage(ChatMessage message);

}
