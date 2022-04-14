package ro.ase.acs.cts.printer.laser;

import java.util.ArrayList;

import ro.ase.acs.cts.design.patterns.adapter.objects.Laser2InkPrinterAdapter;
import ro.ase.acs.cts.printer.InkPrinter;
import ro.ase.acs.cts.printer.InkPrinterInterface;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<InkPrinterInterface> inkPrinters = new ArrayList<>();
		
		InkPrinterInterface hrPrinter = new InkPrinter();
		InkPrinterInterface devFloorPrinter = new InkPrinter();
		
		inkPrinters.add(hrPrinter);
		inkPrinters.add(devFloorPrinter);
		
		
		hrPrinter.print("CV.doc");
		
		LaserPrinterInterface ceoPrinter = new LaserPinter();
		Laser2InkPrinterAdapter laserAdapter = 
				new Laser2InkPrinterAdapter(ceoPrinter);
		//inkPrinters.add(ceoPrinter);
		
		inkPrinters.add(laserAdapter);
		
		for(InkPrinterInterface printer : inkPrinters) {
			printer.print("Hello ! \n How are you ?");
		}
		
		
		

	}

}
