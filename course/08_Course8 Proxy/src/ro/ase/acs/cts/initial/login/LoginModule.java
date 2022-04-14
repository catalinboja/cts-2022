package ro.ase.acs.cts.initial.login;

public class LoginModule implements LoginInterface {

	@Override
	public boolean login(String username, String password) {
		
		if(username.equals("player1") 
				&& password.equals("1234player"))
			return true;
		else
			return false;
	}

}
