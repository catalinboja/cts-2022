package ro.ase.cts.g1098.lab1.main.exceptions;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException() {
		
	}
	
	public InsufficientFundsException(String msg){
		super(msg);
	}
}
