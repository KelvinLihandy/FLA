package models;

import java.util.ArrayList;

import interfaces.HourChangeEventPublisher;
import interfaces.HourChangeEventSubscriber;

public class Clock implements HourChangeEventPublisher{

	private int hour = 0;
	private ArrayList<HourChangeEventSubscriber> subscribers = new ArrayList<>();
	
	public Clock() {
		
	}
	
	public void continueTime() {
		this.hour = (this.hour + 1) % 24;
		notifyAllSubscriber(this.hour);
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public void notifyAllSubscriber(int hour) {
		// TODO Auto-generated method stub
		for (HourChangeEventSubscriber s: subscribers) {
			s.onNotify(hour);
		}
	}

	@Override
	public void addSubscriber(HourChangeEventSubscriber s) {
		// TODO Auto-generated method stub
		subscribers.add(s);
	}

	@Override
	public void removeSubscriber(HourChangeEventSubscriber s) {
		// TODO Auto-generated method stub
		subscribers.remove(s);
	}

}
