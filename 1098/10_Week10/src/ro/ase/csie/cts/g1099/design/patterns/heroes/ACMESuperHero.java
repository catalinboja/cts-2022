package ro.ase.csie.cts.g1099.design.patterns.heroes;

public class ACMESuperHero implements ACMEHeroInterface{
	
	String name;
	int points;
	
	
	public ACMESuperHero(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}


	@Override
	public void run() {
		System.out.println(this.name + " is running");
	}


	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing");
		this.points += points;
	}


	@Override
	public void defend(int points) {
		System.out.println(this.name + " takes a hit");
		this.points -= points;
	}
	
	

}
