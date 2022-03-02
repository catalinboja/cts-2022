package ro.ase.cts.g1098.recap.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.g1098.recap.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.recap.exceptions.InsufficientFundsException;
import ro.ase.cts.g1098.recap.models.AccountType;
import ro.ase.cts.g1098.recap.models.BankAccount;
import ro.ase.cts.g1098.recap.models.Banker;

public class Main {

	public static void main(String[] args) {
		
		Banker bank = new Banker("SDG");
		BankAccount debitAccount = bank.openAccount(AccountType.SAVNGS);
		BankAccount creditAccount = bank.openAccount(AccountType.CURRENT);
		
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(creditAccount);
		accounts.add(debitAccount);
		accounts.add(bank.openAccount(AccountType.SAVNGS));
		
		try {
			debitAccount.deposit(1000);
			debitAccount.withdraw(100);
			debitAccount.transfer(creditAccount, 100);
			
			System.out.println("Final balance = " + debitAccount.getBalance());
			
		} catch (IllegalTransferException e) {
			System.out.println("You can't do that");
			
		} catch (InsufficientFundsException e) {
			System.out.println("You need more money");
		}
	}

}
