package ro.ase.acs.cts.design.patterns.adapter.classes.version2;

public abstract class InkPrinterAbstractClass {
	
	private String idPrinter;
	
	public void print(String text) {
		System.out.println("Printer: Printing ... "+text);
		
	}

	public void cancel() {
		System.out.println("Printer: CANCEL print");
	}
}
