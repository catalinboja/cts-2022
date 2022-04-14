package ro.ase.acs.cts.printer;

import java.util.ArrayList;

import ro.ase.acs.cts.printer.laser.LaserPinter;
import ro.ase.acs.cts.printer.laser.LaserPrinterInterface;

public class Main {

	public static void main(String[] args) {
		
		InkPrinterInterface hrPrinter = new InkPrinter();
		InkPrinterInterface devFloorPrinter = new InkPrinter();
		
		hrPrinter.print("CV.doc");
		
		LaserPrinterInterface ceoPrinter = new LaserPinter();
		
		
		ArrayList<InkPrinterInterface> oldPrinters;
		ArrayList<LaserPrinterInterface> newPrinters;
		
	}

}
