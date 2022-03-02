package ro.ase.cts.g1098.lab1.models;

public abstract class Account {
	
	public abstract void Deposit(double amount);
	public abstract void Withdraw(double amount);
	public abstract void Transfer(Account destination, double amount);
	public abstract double getBalance();

}
