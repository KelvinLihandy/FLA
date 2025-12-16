package models;

import interfaces.HourChangeEventSubscriber;

public class SmartLamp implements HourChangeEventSubscriber{

	private boolean isOn = false;
	
	public void printState() {
		if(isOn) System.out.println("Lamp is turned on");
		else System.out.println("Lamp is turned off");
	}
	
	public SmartLamp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onNotify(int hour) {
		// TODO Auto-generated method stub
		if(hour >= 7 && hour <= 17) isOn = true;
		else isOn = false;
	}

}
