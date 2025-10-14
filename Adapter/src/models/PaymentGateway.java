package models;

public class PaymentGateway {
	
	Cash cash;
	int price;

	public PaymentGateway(Cash cash, int price) {
		super();
		this.cash = cash;
		this.price = price;
	}
	
	public boolean pay(int price) {
		return this.cash.getAmount() >= price;
	}
	
}
