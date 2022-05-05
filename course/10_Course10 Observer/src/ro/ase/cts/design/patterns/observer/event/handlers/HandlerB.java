package ro.ase.cts.design.patterns.observer.event.handlers;

public class HandlerB implements HandlerClick{

	@Override
	public void doClick() {
		System.out.println("Open login form.......");
	}

}

