package ro.ase.csie.cts.g1099.design.patterns.chain;

public class PrivateHandler extends AbstractMessageHandler{

	@Override
	public void process(Message msg) {
		
		if(!msg.getDestination().toLowerCase().equals("@everyone")) {
			System.out.println("Private message for " + msg.getDestination());
		} else
		{
			if(this.next != null) {
				this.next.process(msg);
			}
		}	
	}
}
