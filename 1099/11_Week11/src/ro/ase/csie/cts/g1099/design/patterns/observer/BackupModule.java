package ro.ase.csie.cts.g1099.design.patterns.observer;

public class BackupModule implements ConnectionEventInterface{

	@Override
	public void connectionDown(long timeStamp) {
		System.out.println("Auto-saving game data....");
	}

}
