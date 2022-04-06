package ro.ase.csie.cts.course.design.patterns.builder.version1.eager;

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
	
	private SmartDevice(){
		
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

	private void setModel(String model) {
		this.model = model;
	}

	private void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	private void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	private void setSIM(InterfataSIMCard sIM) {
		SIM = sIM;
	}

	private void setGPSModule(InterfataGPS gPSModule) {
		if(gPSModule == null) {
			throw new NullPointerException();
		}
		GPSModule = gPSModule;
	}

	private void setDisplay(InterfataDisplay display) {
		this.display = display;
	}

	private void setMemoryCard(InterfataExternalMemory memoryCard) {
		this.memoryCard = memoryCard;
	}
	
	
	
//	private SmartDevice(String model, String manufacturer) {
//		this.model = model;
//		this.manufacturer = manufacturer;
//	}

//	private SmartDevice(
//			String model, 
//			String producator, 
//			boolean WiFiIntegrat,
//			InterfataSIMCard sim,
//			InterfataGPS modulGPS,
//			InterfataDisplay display,
//			InterfataExternalMemory cardMemorie){
//	this.model = model;
//	this.manufacturer = producator;
//	this.hasWiFi = WiFiIntegrat;
//	this.SIM = sim;
//	this.GPSModule = modulGPS;
//	this.display = display;
//	this.memoryCard = cardMemorie;
//	}
	

	public static class SmartDeviceBuilder {
		
		
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
	

	
}
