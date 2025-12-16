package systems;

import java.time.LocalTime;

public class Thermostat {

	public Thermostat() {
		
	}
	
	public void setTemperature() {
		int hour = LocalTime.now().getHour();
		if(hour > 6 && hour < 18) System.out.println("Setting temp to 20");
		else System.out.println("Setting temp to 25");
	}
	
}
