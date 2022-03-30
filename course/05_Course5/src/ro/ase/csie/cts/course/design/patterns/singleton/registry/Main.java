package ro.ase.csie.cts.course.design.patterns.singleton.registry;

public class Main {
	
	public static void main(String[] args) {
		
		DBConnection localConnection = 
				DBConnection.getConnection();
		localConnection.connect();
		
		DBConnection localConnection2 = 
				DBConnection.getConnection();
		localConnection2.connect();
		
		DBConnection prodConnection = 
				DBConnection.getConnection("10.0.0.1", 3306, "test");
		prodConnection.connect();
		DBConnection prodConnection2 = 
				DBConnection.getConnection("10.0.0.1", 3306, "test");
		prodConnection2.connect();
		
		DBConnection clientConnection = 
				DBConnection.getConnection("200.0.0.1", 3306, "test");
		clientConnection.connect();
		
	}
	
}
