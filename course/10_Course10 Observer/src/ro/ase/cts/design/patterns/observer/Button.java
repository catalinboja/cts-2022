package ro.ase.cts.design.patterns.observer;

public class Button extends Clickable{
	private boolean isClicked = false;
	
	public void setClicked(){
		if(!isClicked)
		{
			isClicked = true;
			this.notifyObservers();
		}
		else
			isClicked = false;
	}
	
	public void Click(){
		System.out.println("Button clicked");
		setClicked();
		//or
		//this.notifyObservers();
	}
}
