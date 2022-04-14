package ro.ase.acs.cts.design.patterns.decorator;

import ro.ase.acs.cts.controls.AbstractVisualControl;

public class Button3DDecorator extends AbstractVisualControlDecorator{

	String effect3D;
	
	
	public Button3DDecorator(AbstractVisualControl theControl, String effect) {
		super(theControl);
		this.effect3D = effect;
	}


	@Override
	public void click() {
		
		System.out.println("Show 3d effect: " + this.effect3D);
		this.theControl.click();
	}
	
	
	

}
