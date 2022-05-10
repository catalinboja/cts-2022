package ro.ase.csie.cts.g1099.design.patterns.heroes;

import ro.ase.csie.cts.g1099.design.patterns.heroes.disney.Disney2ACMEAdapter;
import ro.ase.csie.cts.g1099.design.patterns.heroes.disney.DisneyHeroInterface;
import ro.ase.csie.cts.g1099.design.patterns.heroes.disney.DisneySuperHero;

public class Main {

	public static void main(String[] args) {
		
		ACMEHeroInterface superman = new ACMESuperHero("Superman", 100);
		superman.run();
		ACMEHeroInterface batman = new ACMESuperHero("Batman", 200);
		batman.defend(20);
		
		DisneyHeroInterface vader = new DisneySuperHero("Vader", 1000, false);
		ACMEHeroInterface acmeVader = new Disney2ACMEAdapter(vader);
		acmeVader.run();
		acmeVader.defend(40);
		
		ACMEHeroInterface acmeLuke = 
				new Disney2ACMEAdapter(new DisneySuperHero("Luke", 500, true));
		acmeLuke.run();
	}

}
