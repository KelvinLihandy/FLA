package models;

import mediator.Mediator;

public class Admin extends User {

	private Mediator mediator;
	
	public Admin(String name, Mediator mediator) {
		setName(name);
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		mediator.send(this, message);
	}

	@Override
	public void receive(String message) {
		System.out.println("Admin receive " + message);
	}

}
