package models;

import java.util.Random;

public class Crypto {

    private double price;
    private String address;

    public Crypto(double _price){
        super();
        this.price = _price;
        this.address = createAddress();
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double _price){
        this.price = _price;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String _address){
        this.address = _address;
    }
    
    public String createAddress() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder("0x");
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 10; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
