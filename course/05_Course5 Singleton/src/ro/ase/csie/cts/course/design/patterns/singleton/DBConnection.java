package ro.ase.csie.cts.course.design.patterns.singleton;

import ro.ase.csie.cts.course.design.patterns.singleton.DBConnection;

public class DBConnection {
	
	//singleton reference
	private static DBConnection connection = null;
	
	String serverIP;
	int serverPort;
	String database;
	
	boolean isOpen = false;
	
	
	private DBConnection(String serverIP, int serverPort, String database) {
		super();
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		this.database = database;
	}
	
	public void connect() {
		if(!isOpen) {
			System.out.println("Connecting to " + this.serverIP);
			this.isOpen = true;
		} else 
		{
			System.out.println("You are already connected to " + this.serverIP);
		}
	}
	
	public static synchronized DBConnection getConnection() {
		if(DBConnection.connection == null) {
			DBConnection.connection = 
					new DBConnection( "127.0.0.1", 3306, "university");
		}
		return DBConnection.connection;
	}
	
	public static synchronized DBConnection getConnection(
			String ip, int port, String database) {
		if(DBConnection.connection == null) {
			DBConnection.connection = 
					new DBConnection( ip, port, database);
		}
		return DBConnection.connection;
	}
}
