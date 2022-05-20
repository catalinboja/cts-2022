package ro.ase.csie.cts.g1099.design.patterns.chain;

public class Main {

	public static void main(String[] args) {
		
		AbstractMessageHandler filter = new FilterHandler();
		AbstractMessageHandler privateMessage = new PrivateHandler();
		AbstractMessageHandler broadcast = new BroadcastHandler();
		
		filter.setNextHandler(privateMessage);
		privateMessage.setNextHandler(broadcast);
		
		filter.process(new Message("Hello !", 5, "@john"));
		filter.process(new Message("I hate you", 5, "@everyone"));
		filter.process(new Message("Let's play", 5, "@everyone"));
		
	}

}
