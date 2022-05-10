package ro.ase.csie.cts.g1099.design.patterns.heroes.disney;

public class DisneySuperHero implements DisneyHeroInterface{

	String heroName;
	int lifepoints;
	boolean isGoodHero;
	
	
	public DisneySuperHero(String heroName, int lifepoints, boolean isGoodHero) {
		super();
		this.heroName = heroName;
		this.lifepoints = lifepoints;
		this.isGoodHero = isGoodHero;
	}


	@Override
	public void move(int distance) {
		System.out.println("Hero is moving");
	}


	@Override
	public void restorePoints(int points) {
		System.out.println("Restoring points");
	}


	@Override
	public void addPopints(int points) {
		System.out.println("Add points");
	}
	
	
	
}
