package ro.ase.csie.cts.g1098.design.patterns.state;

public class CriticalState implements HeroStateInterface {
	
	HeroInterface hero;
	
	public CriticalState(HeroInterface hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void walk() {
		System.out.println("Is laying down");
	}

	@Override
	public void losePoints(int points) {
		hero.substractPoints((int) (points * 1.1));
		if(this.hero.getPoints() <= 0) {
			System.out.println("Game Over !");
		}
	}
}
