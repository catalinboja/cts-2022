package ro.ase.csie.cts.g1098.design.patterns.state;

public class WoundedState implements HeroStateInterface{
	
	HeroInterface hero;
	
	public WoundedState(HeroInterface hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void walk() {
		System.out.println("Is walking slowly");
	}

	@Override
	public void losePoints(int points) {
		hero.substractPoints(points);
		if(this.hero.getPoints() < 50) {
			this.hero.setState(new CriticalState(this.hero));
		}
	}


}
