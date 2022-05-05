package ro.ase.cts.design.patterns.decorator;

public class ShieldDecorator extends HeroDecorator{
	
	public ShieldDecorator(AbstractHero hero, int shieldPoints) {
		super(hero);
		this.shieldStrength = shieldPoints;
	}

	int shieldStrength;

	@Override
	public void defend(int hitPoints) {
		System.out.println("The kinght is using a shield");
		hitPoints -= this.shieldStrength;
		if(hitPoints > 0)
			this.hero.defend(hitPoints);
	}

}
