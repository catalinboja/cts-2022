package ro.ase.csie.cts.course.design.patterns.singleton.eager;


public class DBConnection {
	
	//singleton reference
	public static final DBConnection connection = 
			new DBConnection( "127.0.0.1", 3306, "university");;
	
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
	
	/*
	 * public static DBConnection getConnection() { return DBConnection.connection;
	 * }
	 */
	
}
