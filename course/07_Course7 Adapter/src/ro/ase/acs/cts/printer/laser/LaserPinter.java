package ro.ase.acs.cts.printer.laser;

public class LaserPinter implements LaserPrinterInterface{

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
