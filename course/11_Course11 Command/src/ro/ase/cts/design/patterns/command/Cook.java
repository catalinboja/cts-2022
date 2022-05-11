package ro.ase.cts.design.patterns.command;

//Receiver

public class Cook {
	
	private String nume;
	
	public Cook(String nume){
		this.nume = nume;
	}
	
	public void preparaPizza(String tipPizza){
		System.out.println("Prepare a pizza: "+tipPizza);
	}
	
	public void prepareSoup(String soupType){
		System.out.println("Prepare a soup: "+soupType);
	}
}
