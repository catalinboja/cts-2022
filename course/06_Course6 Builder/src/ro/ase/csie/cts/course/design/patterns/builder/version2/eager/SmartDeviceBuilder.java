package ro.ase.csie.cts.course.design.patterns.builder.version2.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataDisplay;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataExternalMemory;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataGPS;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataSIMCard;

public class SmartDeviceBuilder {
	private SmartDevice smartdevice = null;
	
	public SmartDeviceBuilder(String model, String manufacturer) {
		this.smartdevice = new SmartDevice();
		this.smartdevice.setModel(model);
		this.smartdevice.setManufacturer(manufacturer);
	}
	
	public SmartDeviceBuilder addWiFi() {
		this.smartdevice.setHasWiFi(true);
		return this;
	}
	
	public SmartDeviceBuilder addSIM(InterfataSIMCard sIM) {
		this.smartdevice.setSIM(sIM);
		return this;
	}
	
	public SmartDeviceBuilder addGPS(InterfataGPS gPSModule) {
		this.smartdevice.setGPSModule(gPSModule);
		return this;
	}
	
	public SmartDeviceBuilder addDisplay(InterfataDisplay display) {
		this.smartdevice.setDisplay(display);
		return this;
	}
	
	public SmartDeviceBuilder addMemoryCard(InterfataExternalMemory memoryCard) {
		this.addMemoryCard(memoryCard);
		return this;
	}
	
	public SmartDevice build() {
		return this.smartdevice;
	}
}
