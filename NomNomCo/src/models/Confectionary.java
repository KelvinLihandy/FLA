package models;

import java.util.*;

public abstract class Confectionary {

    protected String name;
    protected String softness;
    protected ArrayList<String> toppings;
    protected double price;
    protected String paymentType;

    public Confectionary(String name, String softness, ArrayList<String> toppings, double price, String paymentType) {
		super();
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.price = price;
		this.paymentType = paymentType;
	}
    
    public abstract void showInfo();
    
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSoftness() {
        return softness;
    }
    public void setSoftness(String softness) {
        this.softness = softness;
    }
    public ArrayList<String> getToppings() {
        return toppings;
    }
    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
}   