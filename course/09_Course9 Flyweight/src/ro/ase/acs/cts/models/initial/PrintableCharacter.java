package ro.ase.acs.cts.models.initial;


public class PrintableCharacter {

	private final String character;
	private final int textLocation;
	private final String color;
	
	
	public PrintableCharacter(String value, int textLocation, String color){
		this.character = value;
		this.textLocation = textLocation;
		this.color = color;
	}
	
	public String getCharacter(){
		return this.character;
	}

	
	public void printCharacter() {
		System.out.println(
				this.character+ " is on location " + this.textLocation);	
	}

}
