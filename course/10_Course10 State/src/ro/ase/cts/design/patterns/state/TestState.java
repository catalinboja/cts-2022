package ro.ase.cts.design.patterns.state;

public class TestState {
	
	public static void main(String[] args){
		Editor editor = new Editor();
	
		editor.print("Hello World !");
		
		editor.selectFirstWordBoldOption();
		
		editor.print("Hello World Java!");
		
		editor.print("Hello World !");
		
	}
}
