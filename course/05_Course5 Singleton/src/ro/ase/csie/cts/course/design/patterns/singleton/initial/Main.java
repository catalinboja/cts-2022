package ro.ase.csie.cts.course.design.patterns.singleton.initial;

public class Main {

	public static void main(String[] args) {
		
		DBConnection dbConnection = 
				new DBConnection( "127.0.0.1", 3306, "university");
		dbConnection.connect();
		
		CoursesModule courses = new CoursesModule(dbConnection);
		UsersModule users = new UsersModule(dbConnection);
		
		DBConnection dbConnection2 = 
				new DBConnection( "127.0.0.1", 3306, "university");
		dbConnection.connect();

	}

}
