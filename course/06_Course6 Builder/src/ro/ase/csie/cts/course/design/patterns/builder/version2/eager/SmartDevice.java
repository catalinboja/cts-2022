package ro.ase.csie.cts.course.design.patterns.builder.version2.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataDisplay;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataExternalMemory;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataGPS;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfataSIMCard;

public class SmartDevice {
	
	String model;
	String manufacturer;
	
	boolean hasWiFi;
	
	InterfataSIMCard SIM;
	InterfataGPS GPSModule;
	InterfataDisplay display;
	InterfataExternalMemory memoryCard;
	
	SmartDevice(){
		
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public boolean isHasWiFi() {
		return hasWiFi;
	}

	public InterfataSIMCard getSIM() {
		return SIM;
	}

	public InterfataGPS getGPSModule() {
		return GPSModule;
	}

	public InterfataDisplay getDisplay() {
		return display;
	}

	public InterfataExternalMemory getMemoryCard() {
		return memoryCard;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	void setSIM(InterfataSIMCard sIM) {
		SIM = sIM;
	}

	void setGPSModule(InterfataGPS gPSModule) {
		if(gPSModule == null) {
			throw new NullPointerException();
		}
		GPSModule = gPSModule;
	}

	void setDisplay(InterfataDisplay display) {
		this.display = display;
	}

	void setMemoryCard(InterfataExternalMemory memoryCard) {
		this.memoryCard = memoryCard;
	}
	
}
