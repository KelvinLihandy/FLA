package main;

import java.util.Iterator;

import iterator.IteratableCollection;
import mediator.ChatMediator;
import models.Admin;
import models.Guest;
import models.Member;
import models.Product;
import models.ProductCollection;

public class Main {

	public Main() {
		ChatMediator cm = new ChatMediator();
		Admin admin1 = new Admin("upin", cm);
		Guest guest1 = new Guest("ipin", cm);
		Member member1 = new Member("apin", cm);
		cm.addUser(admin1);
		cm.addUser(guest1);
		cm.addUser(member1);
		admin1.send("ambabidi");
		
		IteratableCollection pc = new ProductCollection();
		Iterator<Product> p1 = pc.createIterator();
		while(p1.hasNext()) {
			System.out.println(p1.next().toString());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
