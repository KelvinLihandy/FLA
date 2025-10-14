import java.util.*;

import builders.HouseBuilder;
import interfaces.IBuilder;
import models.House;

public class Main {
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		menu();
		IBuilder builder = new HouseBuilder();
		builder.reset();
		House house = ((HouseBuilder) builder.setDoor(1).setFloor(3).setGarage()).build();
		House house2 = null;
		try {
			
			house2 = house.clone();			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		house.setDoor(1);
		house2.setDoor(100);
		System.out.println(house.getDoor());
		System.out.println(house2.getDoor());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public void menu() {
		int choice = -1;
		House house = null;
		do {
			System.out.println("1. New House");
			System.out.println("2. View House");
			System.out.println("3. Exit");
			System.out.print(">>> ");
			choice = scan.nextInt();
			scan.nextLine();
		} while (choice < 1 || choice > 3);
		switch(choice) {
			case 1: {
				IBuilder houseBuilder = new HouseBuilder();
				HouseBuilder build = (HouseBuilder) houseBuilder.setDoor(1).setFloor(10).setWindow(4);
				house = build.build();
				break;
			}
			case 2: {
				if(house == null) {
					System.out.println("There is no house");
				}
				else {
					System.out.println(house.getDoor());
					System.out.println(house.getFloor());
					System.out.println(house.getWindow());
				}
				break;
			}
			case 3:
			default:
		}
	}

}
