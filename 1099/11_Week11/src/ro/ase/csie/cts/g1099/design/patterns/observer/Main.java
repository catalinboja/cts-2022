package ro.ase.csie.cts.g1099.design.patterns.observer;

public class Main {

	public static void main(String[] args) {
		
		ConnectionModule conModule = new ConnectionModule("10.0.0.1");
		
		BackupModule backup = new BackupModule();
		NotificationsModule notifications = new NotificationsModule();
		
		conModule.register(backup);
		conModule.register(notifications);
		
		conModule.connect();
		
		conModule.unregister(notifications);
		
		conModule.connect();
		
	}

}
