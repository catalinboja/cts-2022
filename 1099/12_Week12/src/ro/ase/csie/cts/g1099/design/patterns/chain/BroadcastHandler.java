package ro.ase.csie.cts.g1099.design.patterns.chain;

public class BroadcastHandler extends AbstractMessageHandler{

	@Override
	public void process(Message msg) {
		
		if(msg.getDestination().toLowerCase().equals("@everyone")) {
			System.out.println("Message for everyone " + msg.getText());
		} else
		{
			if(this.next != null) {
				this.next.process(msg);
			}
		}	
	}

}
