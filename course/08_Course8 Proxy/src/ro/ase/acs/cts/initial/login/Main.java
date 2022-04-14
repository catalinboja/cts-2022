package ro.ase.acs.cts.initial.login;

public class Main {

	public static void main(String[] args) {
		
		//brute force attack on user account
		String passwordsDictionary[] = new String[]{"123456","1234","player1",
				"root","player11234","1234player","1234"}; 
		
		LoginInterface login = new LoginModule();
		int noAttempts = 0;
		for(String password : passwordsDictionary) {
			noAttempts += 1;
			if(login.login("player1", password)) {
				System.out.println("Found passowrd : " + password);
				System.out.println("No of attempts: " + noAttempts);
				break;
			}
		}
		
		System.out.println("Session terminated");
	}

}
