package ro.ase.csie.cts.g1099.design.patterns.state;

public class Hero implements HeroInterface{
	
	int points;
	String name;
	
	HeroAbstractState state;
	
	public void setState(HeroAbstractState state) {
		this.state = state;
	}
	
	public Hero(int points, String name) {
		super();
		this.points = points;
		this.name = name;
		
		//set initial state
		this.setState(new NormalState(this));
	}

	@Override
	public void move() {
		if(this.state != null) {
			this.state.moveAction();
		}
	}

	@Override
	public void heal(int points) {
		if(this.state != null) {
			this.state.healAction(points);
		}
	}

	@Override
	public void defend(int points) {
		if(this.state != null) {
			this.state.defendAction(points);
		}
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
