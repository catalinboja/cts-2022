package ro.ase.acs.cts.design.patterns.smart.api.facade;

import ro.ase.acs.cts.smart.devices.EntryDoor;
import ro.ase.acs.cts.smart.devices.WashingMachine;
import ro.ase.acs.cts.smart.devices.WaterFaucet;
import ro.ase.acs.cts.smart.devices.Window;

public class TestFacade {

	public static void main(String[] args) {
		
		
		Window kitchenWindow = new Window();
		WaterFaucet tapWaterFaucet = new WaterFaucet();
		EntryDoor apartmentDoor = new EntryDoor();
		WashingMachine washingMachine = new WashingMachine();
		
		//close the apartment
		kitchenWindow.close();
		tapWaterFaucet.close();
		apartmentDoor.close();
		washingMachine.stop();
		
		//start washing machine
		tapWaterFaucet.open();
		washingMachine.start();
		
			
		ApartmentAPIFacade apartament = new ApartmentAPIFacade(new Window(), new WaterFaucet(), new EntryDoor(), new WashingMachine());
		apartament.lock();
		//later ...
		apartament.startWashingMachine();
		

	}

}
