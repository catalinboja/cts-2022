package ro.ase.csie.cts.course.design.patterns.singleton.enumeration;

public class Main {

	public static void main(String[] args) {
		
		DBConnection connection = DBConnection.LOCAL;
		
		DBConnection connection2 = DBConnection.LOCAL;
		
		connection.connect();
		connection2.connect();
	}

}
