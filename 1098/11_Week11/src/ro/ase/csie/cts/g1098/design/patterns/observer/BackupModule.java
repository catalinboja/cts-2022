package ro.ase.csie.cts.g1098.design.patterns.observer;

public class BackupModule implements ConnectionStatusInterface{

	@Override
	public void lostConnectionNotification(long timeStamp) {
		System.out.println("Backing up the game data");
	}

}
