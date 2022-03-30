package ro.ase.csie.cts.course.design.patterns.singleton;

import ro.ase.csie.cts.course.design.patterns.singleton.DBConnection;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * DBConnection dbConnection = new DBConnection( "127.0.0.1", 3306,
		 * "university");
		 */
		
		DBConnection dbConnection = DBConnection.getConnection();
		dbConnection.connect();
		
		DBConnection dbConnection2 = DBConnection.getConnection();
		dbConnection2.connect();
		
		if(dbConnection == dbConnection2) {
			System.out.println("The same object");
		}
		
		DBConnection dbConnection3 = DBConnection.getConnection("10.0.0.1",3306,"university");
		dbConnection3.connect();
		
	}

}
