package ro.ase.acs.cts.design.patterns.adapter.classes;

import java.util.ArrayList;

import ro.ase.acs.cts.printer.InkPrinter;
import ro.ase.acs.cts.printer.InkPrinterInterface;

public class Main {

	public static void main(String[] args) {
		ArrayList<InkPrinterInterface> inkPrinters = new ArrayList<>();
		
		InkPrinterInterface hrPrinter = new InkPrinter();
		InkPrinterInterface devFloorPrinter = new InkPrinter();
		
		inkPrinters.add(hrPrinter);
		inkPrinters.add(devFloorPrinter);
		
		Laser2InkClassAdapter laserPrinter = new Laser2InkClassAdapter();
		inkPrinters.add(laserPrinter);
		
		for(InkPrinterInterface printer : inkPrinters) {
			printer.print("Hello ! \n How are you ?");
		}

	}

}
