package ro.ase.acs.cts.design.patterns.adapter.classes;

import ro.ase.acs.cts.printer.InkPrinterInterface;
import ro.ase.acs.cts.printer.laser.LaserPrinterInterface;

public class Laser2InkClassAdapter implements LaserPrinterInterface, InkPrinterInterface{

	@Override
	public void print(String text) {
		System.out.println("Printer: Printing ... "+text);
		
	}

	@Override
	public void cancel() {
		System.out.println("Printer: CANCEL print");
	}

	@Override
	public void laserPrint(String[] paragraphs) {
		for(String paragraph : paragraphs) {
			System.out.println(paragraph);
		}
	}

	@Override
	public void cancelPrint() {
		System.out.println("Laser printer: cancel job");
	}

}
