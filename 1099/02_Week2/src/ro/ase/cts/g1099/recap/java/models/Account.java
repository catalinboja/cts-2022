package ro.ase.cts.g1099.recap.java.models;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void transfer(Account destination, double amount);
	public abstract double getBalance();
	
}
