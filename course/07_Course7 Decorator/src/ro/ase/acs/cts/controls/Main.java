package ro.ase.acs.cts.controls;

import ro.ase.acs.cts.design.patterns.decorator.Button3DDecorator;
import ro.ase.acs.cts.design.patterns.decorator.ImprovedClickDecorator;
import ro.ase.acs.cts.design.patterns.decorator.MouseHoverDecorator;

public class Main {

	public static void main(String[] args) {

		AbstractVisualControl btnLogin = new Button("Login", 1);
		AbstractVisualControl btnLogout = new Button("Logout", 2);
		
		//apply the decorator with the 3 effect
//		Button3DDecorator decorator = new Button3DDecorator(btnLogin, "3d Effect");
//		decorator.click();
		
		btnLogin = new Button3DDecorator(btnLogin, "3d Effect");
		btnLogin = new ImprovedClickDecorator(btnLogin);
		
		btnLogout = new MouseHoverDecorator(btnLogout);
		
		btnLogin.click();
		btnLogout.click();
		
		if(btnLogout instanceof MouseHoverDecorator) {
			((MouseHoverDecorator)btnLogout).mouseHover();
		}
	}

}
