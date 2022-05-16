package ro.ase.csie.cts.g1098.design.patterns.chain;

public class FilterHandler extends ChatMessageAbstractHandler {

	private String[] forbiddenWords = {"hate", "violence", "stupid"};
	
	@Override
	public void processMessage(ChatMessage message) {
		
		boolean isOk = true;
		for(String word : message.getText().split(" ")) {
			
			for(String forbiddenWord : forbiddenWords) {
				if(word.toLowerCase().equals(forbiddenWord))
				{
					System.out.println("Cancel message: " + message.getText());
					isOk = false;
				}
			}
		}
		
		if(isOk && this.next!=null) {
			this.next.processMessage(message);
		}
	}

}
