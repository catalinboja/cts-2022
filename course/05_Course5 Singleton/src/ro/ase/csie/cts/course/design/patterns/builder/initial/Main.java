package ro.ase.csie.cts.course.design.patterns.builder.initial;

import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;
import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;

public class Main {

	public static void main(String[] args) {
		
		SmartDevice smartDevice = 
				new SmartDevice();
		
		//TO DO: set the attributes
		smartDevice.setModel("S22");
		smartDevice.setProducator("Samsung");
		//the others
		
		SmartDevice samsungSmartDevice = 
				new SmartDevice("S22","Samsung");
		
		SmartDevice S22SmartPhone = 
				new SmartDevice(
						"S22","Samsung", true, null, null, null, null);
		
		DisplaySuperAmoled display = new DisplaySuperAmoled(10);
		SDCard sdCard = new SDCard(128);
		
		SmartDevice S21SmartPhone = 
				new SmartDevice(
						"S22","Samsung", false, null, null, display, sdCard);
	}

}
