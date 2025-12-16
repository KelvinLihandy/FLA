package models;

import mediator.Mediator;

public class Member extends User {

	private Mediator mediator;
	
	public Member(String name, Mediator mediator) {
		setName(name);
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		mediator.send(this, message);
	}

	@Override
	public void receive(String message) {
		System.out.println("Member receive " + message);
	}

}
