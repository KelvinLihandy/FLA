package main;

public class DBConnection {

	private static DBConnection instance = null;
	
	private DBConnection() {
		System.out.println("initialize connection");
	}
	
	public static DBConnection getInstance() {
		if(instance == null) instance = new DBConnection();
		return instance;
	}

}