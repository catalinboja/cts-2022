package ro.ase.cts.g1098.recap.models;

public class Banker {
	
	String bankName;
	private int nextId = 1;
	
	public Banker(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	public BankAccount openAccount(AccountType type) {
		
		String iban = this.bankName + " - " + this.nextId;
		this.nextId += 1;
		
		if(type == AccountType.CURRENT)
			return new CurrentAccount(iban);
		if(type == AccountType.SAVNGS)
			return new SavingsAccount(iban);
		
		return null;
	}
	
	

}
