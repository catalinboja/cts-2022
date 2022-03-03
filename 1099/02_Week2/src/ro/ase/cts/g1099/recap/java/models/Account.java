package ro.ase.cts.g1099.recap.java.models;

import ro.ase.cts.g1099.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1099.recap.java.exceptions.InsufficientFundsException;

public abstract class Account {
	
	public abstract void deposit(double amount) throws IllegalTransferException;
	public abstract void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException;
	public abstract void transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();
	
}
