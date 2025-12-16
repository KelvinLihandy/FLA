import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import factories.CupcakeFactory;
import factories.TartFactory;
import models.Confectionary;
import models.Cupcake;
import singleton.Database;

public class Main {

    Scanner scan = new Scanner(System.in);
    
    public void Menu(){
        int choice = -1;
        do{
            System.out.println("Nom Nom Co.");
            System.out.println("1. Bake Confectionary");
            System.out.println("2. View Comfectionary Order");
            System.out.println("3. Exir");
            System.out.print(">> ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
            case 1:
                bakeConfectionary();
                break;
            case 2:
                viewConfectionaryOrder();
                break;
            case 3:
                System.out.println("Thank you for using nomnom service!");
                break;
            default:
                break;
        }
        }while(choice != 3);
    }

    public void bakeConfectionary(){
    	String type;
    	String name;
    	String soft;
    	String adding;
    	String topping;
    	ArrayList<String> toppings = new ArrayList<>();
    	double price;
    	String payment;
    	do {
    	    System.out.print("Input confectionary type [Cupcake | Tart][case sensitive]: ");
    	    type = scan.nextLine();
    	} while (!type.equals("Cupcake") && !type.equals("Tart"));

    	do {
    	    System.out.print("Input confectionary name [Length between 5 - 15]: ");
    	    name = scan.nextLine();
    	} while (name.length() < 5 || name.length() > 15);

    	do {
    	    System.out.print("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ");
    	    soft = scan.nextLine();
    	} while (!soft.equals("Fluffy") && !soft.equals("Medium") && !soft.equals("Hard"));

    	do {
    	    System.out.print("Adding additional topping [Y | N][case sensitive]: ");
    	    adding = scan.nextLine();
    	} while (!adding.equals("Y") && !adding.equals("N"));
    	if (adding.equals("Y")) {
    	    for(int i = 1; i <= 3; i++) {
    	    	do {
    	    		System.out.print("Input topping "+ i + " [Length between 1 - 10]: ");
            	    topping = scan.nextLine();
            	    toppings.add(topping);
    	    	}while(topping.length() < 1 || topping.length() > 10);
    	    }
    	}
    	do {
    	    System.out.print("Adding confectionary price [10.0 - 50.0]: ");
    	    price = scan.nextDouble();
    	    scan.nextLine();
    	} while (price < 10.0 || price > 50.0);
    	do {
    	    System.out.print("What kind of payment [Cash | Transfer | Crypto][case sensitive]: ");
    	    payment = scan.nextLine();
    	} while (!payment.equals("Cash") && !payment.equals("Transfer") && !payment.equals("Crypto"));
    	ArrayList<Confectionary> list = Database.getInstance();
    	if(type.equals("Cupcake")) {
    		list.add((new CupcakeFactory()).createConfectionary(name, soft, toppings, price, payment));	
    	}
    	else if(type.equals("Tart")) {
    		list.add((new TartFactory()).createConfectionary(name, soft, toppings, price, payment));
    	}
    	System.out.println("Confectionary Baked!");
    }

    public void viewConfectionaryOrder(){
    	ArrayList<Confectionary> list = Database.getInstance();
    	if(list.size() == 0) {
    		System.out.println("No Confectionary Yet...");
    		return;
    	}
    	for (Confectionary confectionary : list) {
			confectionary.showInfo();
		}

    }

    public Main(){
        Menu();
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
