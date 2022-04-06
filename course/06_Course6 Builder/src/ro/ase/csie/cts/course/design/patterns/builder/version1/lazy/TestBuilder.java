package ro.ase.csie.cts.course.design.patterns.builder.version1.lazy;

import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;
import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;
import ro.ase.csie.cts.course.design.patterns.builder.module.TelCoSIMCard;
import ro.ase.csie.cts.course.design.patterns.builder.version1.lazy.SmartDevice.SmartDeviceBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//SmartDevice smartDevice = new SmartDevice();
		
		SmartDeviceBuilder smartDeviceBuilder = 
				new SmartDeviceBuilder("S22", "Samsung");
		SmartDevice smartDevice = 
				smartDeviceBuilder.addWiFi()
				.addMemoryCard(new SDCard(32))
				.addSIM(new TelCoSIMCard())
				.build();
		
		SmartDevice smartDeviceApple = 
				new SmartDeviceBuilder("X22", "Apple")
				.addDisplay(new DisplaySuperAmoled(10))
				.addWiFi()
				.addSIM(new TelCoSIMCard())
				.build();
		
		SmartDeviceDirector samsungDirector = 
				new SmartDeviceDirector(
						new SmartDeviceBuilder("S22", "Samsung"));
		
		
		SmartDevice samsungS22 = samsungDirector.buildSamsungS22();
		
		SmartDevice samsungS22Clone = samsungDirector.buildSamsungS22();
		
		//TO DO: init other attributes
		//smartDevice.set
		
	}

}
