package ro.ase.csie.cts.g1098.design.patterns.observer;

public class NotiticationsModule implements ConnectionStatusInterface{

	@Override
	public void lostConnectionNotification(long timeStamp) {
		System.out.println("Notify player !");
	}

}
