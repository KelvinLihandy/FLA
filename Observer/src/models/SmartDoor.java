package models;

import interfaces.HourChangeEventSubscriber;

public class SmartDoor implements HourChangeEventSubscriber{

	private boolean isOpen = false;
	
	public SmartDoor() {
		// TODO Auto-generated constructor stub
	}
	
	public void printState() {
		if (isOpen) System.out.println("Door is open");
		else System.out.println("Door is closed");
	}

	@Override
	public void onNotify(int hour) {
		// TODO Auto-generated method stub
		if(hour >= 7 && hour <= 19) isOpen = true;
		else isOpen = false;
	}

}
