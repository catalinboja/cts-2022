package ro.ase.csie.cts.g1099.design.patterns.state;

public class NormalState extends HeroAbstractState{

	public NormalState(HeroInterface hero) {
		super(hero);
	}

	@Override
	public void moveAction() {
		System.out.println("Is running");
	}

	@Override
	public void defendAction(int points) {
		System.out.println("Is defending");
		this.hero.setPoints(this.hero.getPoints() - points);
		if(this.hero.getPoints() < 50) {
			this.hero.setState(new WoundedState(this.hero));
		}
		if(this.hero.getPoints() < 20) {
			this.hero.setState(new CriticalState(this.hero));
		}
	}

	@Override
	public void healAction(int points) {
		System.out.println("Is healing");
		this.hero.setPoints(this.hero.getPoints() + points);
	}

}
