package ro.ase.csie.cts.g1099.design.patterns.state;

public abstract class HeroAbstractState {
	
	HeroInterface hero;
	
	public HeroAbstractState(HeroInterface hero) {
		super();
		this.hero = hero;
	}
	
	public abstract void moveAction();
	public abstract void defendAction(int points);
	public abstract void healAction(int points);
	
}
