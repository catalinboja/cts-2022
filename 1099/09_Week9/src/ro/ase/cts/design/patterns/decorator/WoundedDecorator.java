package ro.ase.cts.design.patterns.decorator;

public class WoundedDecorator extends HeroDecorator {

	public static final int CRITICAL_LEVEL = 30;
	
	public WoundedDecorator(AbstractHero hero) {
		super(hero);
	}

	@Override
	public void defend(int hitPoints) {
		this.hero.defend(hitPoints);
	}

	@Override
	public void move(int distance) {
		System.out.println("Hero points: " + this.getPoints());
		if(this.hero.getPoints() < CRITICAL_LEVEL) {
			System.out.println("Is not moving at all. Is critical wounded");
		}
		else
			this.hero.move(distance);
	}
	
	

}
