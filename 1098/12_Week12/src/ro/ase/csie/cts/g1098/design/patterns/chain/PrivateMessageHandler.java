package ro.ase.csie.cts.g1098.design.patterns.chain;

public class PrivateMessageHandler extends ChatMessageAbstractHandler {

	@Override
	public void processMessage(ChatMessage message) {
		if(!message.getDestination().toLowerCase().equals("@everyone")) {
			System.out.println("Private message for " + message.getDestination());
			System.out.println(message.getText());
		}
		else
		{
			if(this.next!= null) {
				this.next.processMessage(message);
			}
		}
	}

}
