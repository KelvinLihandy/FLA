package main;

import java.util.Scanner;

import models.Clock;
import models.SmartAC;
import models.SmartDoor;
import models.SmartLamp;
import models.SmartWindow;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Clock c = new Clock();
		SmartAC ac = new SmartAC();
		SmartDoor door = new SmartDoor();
		SmartLamp lamp = new SmartLamp();
		SmartWindow window = new SmartWindow();
		c.addSubscriber(ac);
		c.addSubscriber(door);
		c.addSubscriber(lamp);
		c.addSubscriber(window);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("time " + c.getHour());
			ac.printState();
			door.printState();
			lamp.printState();
			window.printState();
			String in = sc.nextLine();
			if(in.equals("exit")) break;
			c.continueTime();
			System.out.println("====================================================");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
