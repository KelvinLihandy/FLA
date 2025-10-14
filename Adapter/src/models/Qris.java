package models;

public class Qris {

	private int amount;
	private String provider;
	
	public Qris(int amount, String provider) {
		super();
		this.amount = amount;
		this.provider = provider;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
}
