package ro.ase.acs.cts.design.patterns.smart.api.facade;

import ro.ase.acs.cts.smart.devices.EntryDoor;
import ro.ase.acs.cts.smart.devices.WashingMachine;
import ro.ase.acs.cts.smart.devices.WaterFaucet;
import ro.ase.acs.cts.smart.devices.Window;

public class ApartmentAPIFacade {
	Window window;
	WaterFaucet faucet;
	EntryDoor door;
	WashingMachine washer;
	
	public ApartmentAPIFacade(Window window, 
	WaterFaucet faucet, 
	EntryDoor door, 
	WashingMachine washer){
		this.window = window;
		this.faucet = faucet;
		this.door = door;
		this.washer = washer;
	}
	
	public void lock(){
		this.window.close();
		this.faucet.close();
		this.washer.stop();
		this.door.close();
	}
	
	public void startWashingMachine(){
		this.faucet.open();
		this.washer.start();
	}
	
	

}
