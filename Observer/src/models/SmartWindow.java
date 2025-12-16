package models;

import interfaces.HourChangeEventSubscriber;

public class SmartWindow implements HourChangeEventSubscriber{

	private boolean isOpen = false;
	
	public void printState() {
		if(isOpen) System.out.println("Window is open");
		else System.out.println("Window is closed");
	}
	public SmartWindow() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onNotify(int hour) {
		// TODO Auto-generated method stub
		if(hour >= 7 && hour <= 19) isOpen = true;
		else isOpen = false;
	}

}
