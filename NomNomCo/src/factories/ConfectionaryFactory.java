package factories;

import java.util.ArrayList;

import models.Confectionary;

public abstract class ConfectionaryFactory {
	
	public abstract Confectionary createConfectionary(String name, String softness, ArrayList<String> toppings, double price, String paymentType);
	
}
