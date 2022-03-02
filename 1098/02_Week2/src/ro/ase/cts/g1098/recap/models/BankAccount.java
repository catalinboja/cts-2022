package ro.ase.cts.g1098.recap.models;

import ro.ase.cts.g1098.recap.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.recap.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account{

	protected String iban;
	protected double balance = 0;
	
	public BankAccount(String iban) {
		this.iban = iban;
	}
	
	@Override 
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double amount) throws IllegalTransferException {
		if(amount < 0) {
			throw new IllegalTransferException();
		}
		
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) 
			throws IllegalTransferException, InsufficientFundsException {
		if(amount < 0) {
			throw new IllegalTransferException();
		}
		if(amount > this.balance) {
			throw new InsufficientFundsException();
		}
		
		this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, double amount) 
			throws IllegalTransferException, InsufficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
}
