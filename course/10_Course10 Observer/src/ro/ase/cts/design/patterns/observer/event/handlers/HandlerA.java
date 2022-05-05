package ro.ase.cts.design.patterns.observer.event.handlers;

public class HandlerA implements HandlerClick{

	@Override
	public void doClick() {
		System.out.println("Connect to database ..........");
	}

}
