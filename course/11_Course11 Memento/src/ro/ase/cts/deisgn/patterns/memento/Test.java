package ro.ase.cts.deisgn.patterns.memento;

public class Test {

	public static void main(String[] args) {
		
		Notepad notepadApp = new Notepad();
		TextFile file = new TextFile("Test.txt");
		
		file.addText("Hello ! How are you ?");
		file.addText("\nWhere are you going ?.");
		
		notepadApp.addSnapshot(file.save());
		
		file.addText("\nIt's a fine day");
		
		notepadApp.addSnapshot(file.save());
		
		file.addText("\nIs spring time");
		
		// System.out.println(file.getText());
		
		file.ctrlZ(notepadApp.recoverLastVersion());
		file.ctrlZ(notepadApp.recoverLastVersion());
		file.ctrlZ(notepadApp.recoverLastVersion());
		
		System.out.println(file.getText());
		
	}

}
