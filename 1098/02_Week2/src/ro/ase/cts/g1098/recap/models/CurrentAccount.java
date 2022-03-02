package ro.ase.cts.g1098.recap.models;

public class CurrentAccount extends BankAccount{
	
	public static final double MAX_CREDIT = 5000;

	public CurrentAccount(String iban) {
		super(iban);
		this.balance = CurrentAccount.MAX_CREDIT;
	}
	
	

}
