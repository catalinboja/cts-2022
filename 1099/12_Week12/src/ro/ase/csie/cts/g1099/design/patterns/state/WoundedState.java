package ro.ase.csie.cts.g1099.design.patterns.state;

public class WoundedState extends HeroAbstractState{

	public WoundedState(HeroInterface hero) {
		super(hero);
	}

	@Override
	public void moveAction() {
		System.out.println("Is limping");
	}

	@Override
	public void defendAction(int points) {
		System.out.println("Is defending");
		this.hero.setPoints(this.hero.getPoints() - points);
		if(this.hero.getPoints() < 20) {
			this.hero.setState(new CriticalState(this.hero));
		}
	}

	@Override
	public void healAction(int points) {
		System.out.println("Is healing");
		this.hero.setPoints(this.hero.getPoints() + points);
		
		if(this.hero.getPoints() >= 50) {
			this.hero.setState(new NormalState(this.hero));
		}
	}
}
