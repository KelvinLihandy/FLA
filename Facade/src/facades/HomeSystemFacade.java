package facades;

import systems.Lighting;
import systems.Music;
import systems.Security;
import systems.Thermostat;

public class HomeSystemFacade {
	
	private Security s;
	private Music m;
	private Lighting l;
	private Thermostat t;
	
	public HomeSystemFacade() {
		s = new Security();
		m = new Music();
		l = new Lighting();
		t = new Thermostat();
	}
	
	public void arrive() {
		s.unlock();
		l.turnOn();
		t.setTemperature();
	}
	
	public void leave() {
		s.lock();
		l.turnOff();
		t.setTemperature();
	}
	
	public void playMusic() {
		m.play();
	}

}
