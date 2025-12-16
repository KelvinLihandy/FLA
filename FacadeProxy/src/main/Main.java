package main;

import java.lang.reflect.Proxy;
import java.util.Scanner;

import facades.HomeSystemFacade;
import proxies.IProtectionProxy;
import proxies.ProtectionProxy;

public class Main {
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		boolean isAuth = false;
		String name = "", pass = "";
		int choice = -1;
		
		while(true) {
			System.out.print("Name : ");
			name = scan.nextLine();
			System.out.print("Pass : ");
			pass = scan.nextLine();
			IProtectionProxy proxy = new ProtectionProxy(name, pass);
			try {
				isAuth = proxy.login();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(isAuth) break;
			while(isAuth) {
				System.out.println("1. Arrive");
				System.out.println("2. Leave");
				System.out.println("3. Exit");
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();
				if(choice == 3) {
					isAuth = false;
					break;
				}
				else if(choice == 1){
					try {
						proxy.arrive();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else if(choice == 2) {
					try {
						proxy.leave();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
