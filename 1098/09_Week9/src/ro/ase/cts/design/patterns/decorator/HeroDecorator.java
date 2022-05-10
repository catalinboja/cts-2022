package ro.ase.cts.design.patterns.decorator;

public abstract class HeroDecorator extends AbstractHero{

	protected AbstractHero hero;
	
	public HeroDecorator(AbstractHero hero) {
		super(hero.name, hero.points);
		this.hero = hero;
	}

	@Override
	public void move(int distance) {
		this.hero.move(distance);
	}

	@Override
	public int getPoints() {
		return this.hero.getPoints();
	}
	
	public AbstractHero removeDecorator() {
		return this.hero;
	}
	
	

}
