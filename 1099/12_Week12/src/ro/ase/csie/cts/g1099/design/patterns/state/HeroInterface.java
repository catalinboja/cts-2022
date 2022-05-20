package ro.ase.csie.cts.g1099.design.patterns.state;

public interface HeroInterface {
	public abstract void move();
	public abstract void heal(int points);
	public abstract void defend(int points);
	
	public abstract int getPoints();
	public abstract void setPoints(int points);
	
	public abstract void setState(HeroAbstractState state);
	
}
