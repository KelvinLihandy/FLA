package models;

import java.util.Random;

public class Transfer {

    private double price;
    private String accountNumber;

    public Transfer(double _price){
        super();
        this.price = _price;
        this.accountNumber = createAccountNumber();
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double _price){
        this.price = _price;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String _accountNumber){
        this.accountNumber = _accountNumber;
    }
    
    public String createAccountNumber() {
    	Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }
}
