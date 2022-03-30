package ro.ase.csie.cts.g1099.design.patterns.singleton;

public class Main {

	public static void main(String[] args) {
		
		//DBConnection mysql = new DBConnection();
		DBConnection mysql = DBConnection.getConnection();
		DBConnection mysql2 = DBConnection.getConnection();
		
		if(mysql == mysql2) {
			System.out.println("They reference the same object");
		}
	}

}
