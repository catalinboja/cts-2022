package ro.ase.csie.cts.g1098.design.patterns.singleton;

public class DBConnection {
	
	private static DBConnection connection;
	
	String iPAddress;
	String userName;
	String userPass;
	
	private DBConnection(String iPAddress, String userName, String userPass) {
		super();
		this.iPAddress = iPAddress;
		this.userName = userName;
		this.userPass = userPass;
	}
	
	private DBConnection() {
		
	}
	
	public static synchronized DBConnection getInstance() {
		if(connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}
	
	
	

}
