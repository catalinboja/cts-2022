package ro.ase.csie.cts.g1098.design.patterns.main;

import ro.ase.csie.cts.g1098.design.patterns.models.SuperPower;
import ro.ase.csie.cts.g1098.design.patterns.models.Superhero;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Superhero superman = new Superhero();
		
		Superhero superman = 
				new Superhero.SuperheroBuilder("Superman", "superman.3d")
				.setPositive()
				.setLifePoints(1000)
				.setSuperPower(SuperPower.LASER_EYES)
				.build();
		
		
		Superhero superman2 = (Superhero) superman.clone();
		
	}

}
