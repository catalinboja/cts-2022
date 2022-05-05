package ro.ase.cts.design.patterns.observer;

import java.util.ArrayList;

import ro.ase.cts.design.patterns.observer.event.handlers.HandlerClick;

public abstract class Clickable {
	//observers collection
	ArrayList<HandlerClick> observers =  new ArrayList<>();
	
	public void registerHandler(HandlerClick handler){
		if(observers!=null)
			observers.add(handler);
	}
	public void unregisterHandler(HandlerClick handler){
		if(observers!=null)
			observers.remove(handler);
	}
	public void notifyObservers(){
		if(observers!=null)
			for(int i = 0;i<observers.size();i++)
				observers.get(i).doClick();
	}
	
}
