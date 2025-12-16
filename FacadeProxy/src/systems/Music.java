package systems;

import java.time.LocalTime;

public class Music {

	public Music() {
		
	}
	
	public void play() {
		int hour = LocalTime.now().getHour();
		if(hour > 6 && hour < 18) System.out.println("Playing songs from ambabidi playlist");
		else System.out.println("Playing songs from dubidi playlist");
	}
	
}
