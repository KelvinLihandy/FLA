package singleton;

import java.util.ArrayList;

import models.Confectionary;

public class Database {
	
	private static ArrayList<Confectionary> confectionaryList = null;
	
	public static ArrayList<Confectionary> getInstance() {
		if(confectionaryList == null) confectionaryList = new ArrayList<>();
		return confectionaryList;
	}
	
}
