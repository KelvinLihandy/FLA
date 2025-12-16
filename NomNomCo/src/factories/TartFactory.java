package factories;

import java.util.ArrayList;
import java.util.List;

import models.Confectionary;
import models.Cupcake;
import models.Tart;

public class TartFactory extends ConfectionaryFactory{
	
	public TartFactory() {
		
	}
	
	@Override
	public Confectionary createConfectionary(String name, String softness, ArrayList<String> toppings, double price, String paymentType) {
		return new Tart(name, softness, toppings, price, paymentType);
	}
	
}
