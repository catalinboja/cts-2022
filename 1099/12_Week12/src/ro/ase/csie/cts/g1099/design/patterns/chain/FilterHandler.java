package ro.ase.csie.cts.g1099.design.patterns.chain;

public class FilterHandler extends AbstractMessageHandler {

	private String[] forbiddenWords = {"violence", "stupid", "hate"};
	
	@Override
	public void process(Message msg) {
		
		boolean isOk = true;
		
		for(String word : msg.getText().split(" ")) {
			for(String forbiddenWord : forbiddenWords) {
				if(word.toLowerCase().equals(forbiddenWord)) {			
					isOk = false;
					break;
				}
			}
		}
		
		if(isOk) {
			if(this.next != null)
				this.next.process(msg);
		}
		else {
			System.out.println("Drop  message");
		}
		
	}
	
	
}
