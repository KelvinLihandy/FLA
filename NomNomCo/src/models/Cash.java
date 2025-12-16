package models;

public class Cash {
    
    private double price;

    public Cash(double _price){
        super();
        this.price = _price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double _price){
        this.price = _price;
    }
}
