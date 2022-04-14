package ro.ase.acs.cts.design.patterns.decorator;

import ro.ase.acs.cts.controls.AbstractVisualControl;

public abstract class AbstractVisualControlDecorator extends AbstractVisualControl{
	
	AbstractVisualControl theControl;
	

	public AbstractVisualControlDecorator(AbstractVisualControl theControl) {
		super();
		this.theControl = theControl;
	}


	@Override
	public void click() {
		this.theControl.click();
		
	}
	

}
