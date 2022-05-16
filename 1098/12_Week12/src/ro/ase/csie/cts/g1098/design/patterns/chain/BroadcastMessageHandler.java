package ro.ase.csie.cts.g1098.design.patterns.chain;

public class BroadcastMessageHandler extends ChatMessageAbstractHandler{

	@Override
	public void processMessage(ChatMessage message) {
		if(message.getDestination().toLowerCase().equals("@everyone")) {
			System.out.println(
					"Message for all players: " + message.getText());
		}
		else {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
	}

}
