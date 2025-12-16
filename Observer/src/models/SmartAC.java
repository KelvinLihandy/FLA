package models;

import interfaces.HourChangeEventSubscriber;

public class SmartAC implements HourChangeEventSubscriber {

	private boolean isTurnedOn = false;
	
	public void printState() {
		if(isTurnedOn) System.out.println("AC is turned on");
		else System.out.println("AC is turned off");
	}
	
	public SmartAC() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onNotify(int hour) {
		// TODO Auto-generated method stub
		if((hour >= 18 && hour <= 23) || (hour >= 0 && hour <= 5)) isTurnedOn = true;
		else isTurnedOn = false;
	}

}
