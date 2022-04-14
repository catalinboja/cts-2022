package ro.ase.acs.cts.design.patterns.adapter.objects;

import ro.ase.acs.cts.printer.InkPrinterInterface;
import ro.ase.acs.cts.printer.laser.LaserPrinterInterface;

public class Laser2InkPrinterAdapter implements InkPrinterInterface{
	LaserPrinterInterface laserPrinter;
	
	public Laser2InkPrinterAdapter(LaserPrinterInterface laserPrinter) {
		this.laserPrinter = laserPrinter;
	}

	@Override
	public void print(String text) {
		
		String[] paragraphs = text.split("\n");
		this.laserPrinter.laserPrint(paragraphs);
		
	}

	@Override
	public void cancel() {
		this.laserPrinter.cancelPrint();
	}
	
	
}
