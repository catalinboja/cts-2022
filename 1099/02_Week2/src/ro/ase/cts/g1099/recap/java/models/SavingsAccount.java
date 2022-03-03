package ro.ase.cts.g1099.recap.java.models;

import ro.ase.cts.g1099.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1099.recap.java.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount implements Profitable{

	public static final double MIN_BALANCE = 100;
	
	public SavingsAccount(String iban) throws IllegalTransferException {
		super(iban);
		this.deposit(SavingsAccount.MIN_BALANCE);
	}

	@Override
	public void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException {
		
		if(amount > this.balance - SavingsAccount.MIN_BALANCE)
			throw new InsufficientFundsException();
		
		super.withdraw(amount);
	}

	@Override
	public void addInterest(double interestPercentage) {
		this.balance *= (1 + interestPercentage/100);
	}
	
	

}
