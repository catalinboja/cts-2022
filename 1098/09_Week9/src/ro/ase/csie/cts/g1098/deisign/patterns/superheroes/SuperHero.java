package ro.ase.csie.cts.g1098.deisign.patterns.superheroes;

public class SuperHero implements IACMESuperHero{
	
	String name;
	int lifepoints;
	
	public SuperHero(String name, int lifepoints) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
	}

	@Override
	public void run(int distance) {
		System.out.println(this.name + " is running");
	}

	@Override
	public void defend(int points) {
		System.out.println(this.name + " is hit");
		this.lifepoints -= points;
	}

	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing");
		this.lifepoints += points;
	};
	
	
	
}
