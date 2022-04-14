package ro.ase.acs.cts.design.patterns.proxy.control.proxy;

import ro.ase.acs.cts.initial.login.LoginModule;
import ro.ase.acs.cts.initial.login.LoginInterface;

public class Main {

	public static void main(String[] args) {
		
		String passwordsDictionary[] = new String[]{"123456","1234","player1",
				"root","player11234","1234player","1234"}; 
		
		LoginInterface proxylogin = new SecureLoginProxy(new LoginModule());
		int noAttempts = 0;
		for(String parola : passwordsDictionary) {
			noAttempts += 1;
			if(proxylogin.login("player1", parola)) {
				System.out.println("Parola gasita : " + parola);
				System.out.println("Numar incercari: " + noAttempts);
				break;
			}
		}
		
		System.out.println("Sesiune terminata");
	}

}
