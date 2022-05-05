package ro.ase.cts.design.patterns.observer;

import ro.ase.cts.design.patterns.observer.event.handlers.HandlerA;
import ro.ase.cts.design.patterns.observer.event.handlers.HandlerB;
import ro.ase.cts.design.patterns.observer.event.handlers.HandlerClick;

public class TestObserver {
	
	public static void main(String[] args){
	
	Button buton = new Button();
	
	HandlerA handlerA = new HandlerA();
	HandlerB handlerB = new HandlerB();
	
	buton.registerHandler(handlerA);
	buton.registerHandler(handlerB);
	
	buton.Click();
	
	System.out.println("-----------------------------");
	
	buton.setClicked();
	buton.unregisterHandler(handlerA);
	buton.registerHandler(new HandlerClick() {
		
		@Override
		public void doClick() {
			// TODO Auto-generated method stub
			System.out.println("A new action");
		}
	});
	
	buton.Click();
	
	}
}
