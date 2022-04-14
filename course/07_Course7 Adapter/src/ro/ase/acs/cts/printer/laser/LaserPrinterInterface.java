package ro.ase.acs.cts.printer.laser;

public interface LaserPrinterInterface {
	public void laserPrint(String[] paragraphs);
	public void cancelPrint();
}
