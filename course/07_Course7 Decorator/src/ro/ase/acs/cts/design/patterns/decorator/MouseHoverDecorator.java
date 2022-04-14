package ro.ase.acs.cts.design.patterns.decorator;

import ro.ase.acs.cts.controls.AbstractVisualControl;

public class MouseHoverDecorator extends AbstractVisualControlDecorator{

	public MouseHoverDecorator(AbstractVisualControl theControl) {
		super(theControl);
	}

	public void mouseHover() {
		System.out.println("Mouse over control");
	}
}
