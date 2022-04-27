package ro.ase.acs.cts.models.initial;

public class TestIninitial {

	private static PrintableCharacter[] textCharacters = new PrintableCharacter[100];
	private static int noCharacters = 0;

	public static void pressKey(String character, int location, String color) {
		textCharacters[noCharacters] = new PrintableCharacter(character, location, color);
		noCharacters++;
	}

	public static void main(String[] args) {

		pressKey("a", noCharacters, "black");
		pressKey("a", noCharacters, "black");
		pressKey("a", noCharacters, "black");
		pressKey("a", noCharacters, "blue");
		pressKey("b", noCharacters, "red");
		pressKey("b", noCharacters, "red");
		pressKey("b", noCharacters, "black");

		for (int i = 0; i < noCharacters; i++)
			textCharacters[i].printCharacter();

		System.out.println("\n No of created objects: " + noCharacters);

	}

}
