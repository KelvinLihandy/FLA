package main;

import java.util.Scanner;

import facades.HomeSystemFacade;

public class Main {
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		String name;
		int level = (int)(Math.random()*3 + 1);
		do {
			System.out.print("Input your name: ");
			name = scan.nextLine();
		}while(name.length() < 5);
		System.out.print("Created player " + name + " level = " + level);
		int choice = -1;
		do {
			System.out.println("1. Play");
			System.out.println("2. View Stats");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();
		}while(choice != 3);
		if(choice == 1) {
			
		}
		else if(choice == 2) {
			System.out.println("Player Stats");
			System.out.println("Player Name  : " + name);
			System.out.println("Player Level : " + level);
			System.out.println("\nAvailable heroes");
			System.out.println("==========================");
		}
//		HomeSystemFacade facade = new HomeSystemFacade();
//		facade.arrive();
//		facade.leave();
//		facade.playMusic();
	}

	public static void main(String[] args) {
		new Main();
	}

}
