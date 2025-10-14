import java.util.*;

import adapters.QrisAdapter;
import adapters.TransferAdapter;
import models.Cash;
import models.PaymentGateway;
import models.Qris;
import models.Transfer;


//import adapters.SquarePegAdapter;
//import models.RoundHole;
//import models.RoundPeg;
//import models.SquarePeg;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public void buy() {
		String name;
		String sugar;
		String ice;
		do {
			System.out.print("Input name: ");
			name = scan.nextLine();
		}while(name.length() < 5 || name.length() > 50);
		do {
			System.out.print("Input sugar [No | Normal | Less]: ");
			sugar = scan.nextLine();
		}while(!(sugar.equals("No") || sugar.equals("Normal") || sugar.equals("Less")));
		do {
			System.out.print("Input ice [No | Yes]: ");
			ice = scan.nextLine();
		}while(!(ice.equals("No") || ice.equals("Yes")));
		
		int price = 1000 * name.length();
		String payment;
		do {
			System.out.print("Input payment [cash | qris | debit]: ");
			payment = scan.nextLine();
		}while(!(payment.equals("cash") || payment.equals("qris") || payment.equals("tranfer")));
		
		Cash paymentCash;
		if(payment.equals("cash")) {
			paymentCash = new Cash(price);
		}
		else if(payment.equals("qris")) {
			Qris paymentQris = new Qris(price, "bca");
			paymentCash = new QrisAdapter(paymentQris);
		}
		else {
			Transfer paymentTransfer = new Transfer(price, "123");
			paymentCash = new TransferAdapter(paymentTransfer);
		}
		
		PaymentGateway gateway = new PaymentGateway(paymentCash, price);
		System.out.println(gateway.pay(price));
	}
	
	public void view() {
		
	}
	
	public void menu() {
		int choice = -1;
		do {
			System.out.println("1. Buy coffee");
			System.out.println("2. View coffees");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();
			if(choice == 1) buy();
			else if(choice == 2) view();
		}while(choice != 3);
	}

	public Main() {
		// TODO Auto-generated constructor stub
//		RoundHole hole = new RoundHole(10.0);
//		RoundPeg peg = new RoundPeg(8.0);
//		SquarePeg sqrPeg = new SquarePeg(10);
//		System.out.println("fit = " + hole.fits(new SquarePegAdapter(sqrPeg)));
		menu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
