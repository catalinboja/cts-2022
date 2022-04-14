package ro.ase.acs.cts.design.patterns.adapter.classes.version2;

import ro.ase.acs.cts.printer.laser.LaserPrinterInterface;

public class Laser2InkClassAdapter 
	extends InkPrinterAbstractClass implements LaserPrinterInterface{

	@Override
	public void laserPrint(String[] paragraphs) {
		StringBuilder sb = new StringBuilder();
		for(String paragraph : paragraphs) {
			sb.append(paragraph);
		}
		super.print(sb.toString());
	}

	@Override
	public void cancelPrint() {
		super.cancel();
	}

}
