package ro.ase.acs.cts.design.patterns.decorator;

import ro.ase.acs.cts.controls.AbstractVisualControl;

public class ImprovedClickDecorator extends AbstractVisualControlDecorator{

	public ImprovedClickDecorator(AbstractVisualControl theControl) {
		super(theControl);
	}

	@Override
	public void click() {
		System.out.println("Improved sound  for click!");
		this.theControl.click();
	}
	
	

}
