package models;

public abstract class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);

}
