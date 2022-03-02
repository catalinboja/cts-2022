package ro.ase.cts.g1099.laboratory1.exceptions;

public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
	public InsufficientFundsException() {
		//super();
	}
}
