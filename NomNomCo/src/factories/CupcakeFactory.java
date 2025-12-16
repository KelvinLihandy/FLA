package factories;

import java.util.ArrayList;
import java.util.List;

import models.Confectionary;
import models.Cupcake;

public class CupcakeFactory extends ConfectionaryFactory{
	
	public CupcakeFactory() {
		
	}

	@Override
	public Confectionary createConfectionary(String name, String softness, ArrayList<String> toppings, double price, String paymentType) {
		return new Cupcake(name, softness, toppings, price, paymentType);
	}
	
}
