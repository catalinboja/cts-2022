package ro.ase.cts.design.patterns.decorator;

public abstract class AbstractHero {
	String name;
	int points;
	
	public AbstractHero(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public abstract void move(int distance);
	public abstract void defend(int hitPoints);
}
