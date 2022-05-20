package ro.ase.csie.cts.g1099.design.patterns.state;

public class Main {

	public static void main(String[] args) {
		
		HeroInterface superman = new Hero(100, "Superman");
		superman.move();
		superman.defend(20);
		superman.defend(40);
		superman.move();
		superman.heal(30);
		superman.move();
		superman.defend(60);
		superman.move();
		superman.heal(20);
		superman.move();
		
	}

}
