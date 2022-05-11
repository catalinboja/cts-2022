package ro.ase.csie.cts.g1099.design.patterns.observer;

public class NotificationsModule implements ConnectionEventInterface{

	@Override
	public void connectionDown(long timeStamp) {

		System.out.println("Notify user: Connection lost");
	}

}
