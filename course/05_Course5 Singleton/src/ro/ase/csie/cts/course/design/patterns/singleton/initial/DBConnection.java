package ro.ase.csie.cts.course.design.patterns.singleton.initial;

public class DBConnection {
	
	String serverIP;
	int serverPort;
	String database;
	
	
	public DBConnection(String serverIP, int serverPort, String database) {
		super();
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		this.database = database;
	}
	
	public void connect() {
		System.out.println("Connecting to " + this.serverIP);
	}
	
	

}
