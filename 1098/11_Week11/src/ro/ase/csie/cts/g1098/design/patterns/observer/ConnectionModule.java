package ro.ase.csie.cts.g1098.design.patterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class ConnectionModule {
	
	boolean isConnectionUp = false;
	
	//observers collection
	ArrayList<ConnectionStatusInterface> clients = new ArrayList<>();
	
	public void register(ConnectionStatusInterface client) {
		this.clients.add(client);
	}
	
	public void unregister(ConnectionStatusInterface client) {
		this.clients.remove(client);
	}
	
	public void notifyClients() {
		for(ConnectionStatusInterface client : clients) {
			client.lostConnectionNotification(System.currentTimeMillis());
		}
	}
	
	
	public void openConnection() {
		System.out.println("Opening connection");
		this.isConnectionUp = true;
		
		this.checkConnectionStatus();
	}
	
	public void checkConnectionStatus() {
		while(true) {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Checking connection....");
			Random random = new Random();
			boolean isUp = random.nextBoolean();
			if(!isUp) {
				System.out.println("!!! Connection lost...");
				
				
				this.notifyClients();
				
				return;
			}
		}
	}

	public boolean isConnectionUp() {
		return isConnectionUp;
	}
	
	
}
