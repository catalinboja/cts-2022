package ro.ase.csie.cts.g1099.design.patterns.state.initial;

public class Hero implements HeroInterface{
	
	int points;
	String name;
	
	public Hero(int points, String name) {
		super();
		this.points = points;
		this.name = name;
	}

	@Override
	public void move() {
		if(this.points >= 50)
			System.out.println(this.name + " is running");
		else if (this.points >= 20){
			System.out.println(this.name  + " is limping");
		} else {
			System.out.println(this.name + " is laying down. Critical wounded");
		}
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoints() {
		return this.points;
	}

	@Override
	public void setPoints(int points) {
		this.points = points;
	}

}
