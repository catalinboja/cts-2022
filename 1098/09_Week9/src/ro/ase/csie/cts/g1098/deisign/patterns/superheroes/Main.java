package ro.ase.csie.cts.g1098.deisign.patterns.superheroes;

import ro.ase.csie.cts.g1098.deisign.patterns.superheroes.disney.Disney2AcmeAdapter;
import ro.ase.csie.cts.g1098.deisign.patterns.superheroes.disney.DisneyHero;
import ro.ase.csie.cts.g1098.deisign.patterns.superheroes.disney.IDisneyHero;

public class Main {

	public static void main(String[] args) {
		
		IACMESuperHero superman = new SuperHero("Superman", 100);
		superman.run(500);
		
		IDisneyHero vader = new DisneyHero("Vader");
		
		IACMESuperHero vaderHero = 
				new Disney2AcmeAdapter(vader);
		
		vaderHero.heal(100);
		vaderHero.run(300);
		
		IACMESuperHero luke = 
				new Disney2AcmeAdapter(new DisneyHero("Luke"));
	}

}
