package models;

import java.util.ArrayList;

import adapters.CryptoAdapter;
import adapters.TransferAdapter;

public class Cupcake extends Confectionary{

	public Cupcake(String name, String softness, ArrayList<String> toppings, double price, String paymentType) {
		super(name, softness, toppings, price, paymentType);
	}

	@Override
	public void showInfo() {
		System.out.println("Name : " + this.name + " (Cupcake)");
		System.out.println("Softness: " + this.softness);
		System.out.print("Topping :");
		if(toppings.size() == 0) System.out.print(" -");
		else {
			for (String topping : toppings) {
				System.out.print(" " + topping);
			}
		}
		System.out.println();
		System.out.println("Payment Type : " + this.paymentType);
		System.out.print("Price : ");
		if(this.paymentType.equals("Cash")) {
			System.out.println("$" + String.format("%.2f", this.price));
		}
		else if(this.paymentType.equals("Transfer")) {
			Transfer transfer = new Transfer(this.price);
			Cash adapter = new TransferAdapter(transfer);
			System.out.println("$" + String.format("%.2f", adapter.getPrice()) + " with Account Number : " + transfer.getAccountNumber());
		}
		else if(this.paymentType.equals("Crypto")) {
			Crypto crypto = new Crypto(this.price);
			Cash adapter = new CryptoAdapter(crypto);
			System.out.println("ADA " + String.format("%.2f", adapter.getPrice()) + " with Address : " + crypto.getAddress());
		}
		System.out.println("===============================================");
	}
	
}
