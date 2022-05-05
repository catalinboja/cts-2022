package ro.ase.cts.design.patterns.proxy;

import java.util.HashMap;

public class LoginFilterProxy implements LoginInterface{

	int noAllowedAttempts;
	private LoginInterface loginModule;
	HashMap<String, Integer> loginCounter = new HashMap<>();
	
	
	public LoginFilterProxy(LoginInterface loginModule, int noAllowedAttempts) {
		super();
		this.loginModule = loginModule;
		this.noAllowedAttempts = noAllowedAttempts;
	}

	@Override
	public boolean checkCredentials(String username, String password) {

		Integer noAttempts = loginCounter.get(username);
		if(noAttempts == null) {
			loginCounter.put(username, 0);
			noAttempts = 0;
		}
		
		if(noAttempts >= noAllowedAttempts) {
			System.out.println("Notify user....");
			return false;
		}
		
		boolean isOk = this.loginModule.checkCredentials(username, password);
		
		if(!isOk) {
			noAttempts += 1;
			loginCounter.put(username, noAttempts);
		}
				
		return isOk;	
	}

}
