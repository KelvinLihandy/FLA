package models;

public class TomboyPants extends Pants {
	
	private int pocketCount;

	public TomboyPants() {
		// TODO Auto-generated constructor stub
		setName("Preppy Pants");
		this.pocketCount = (int) (Math.random() * 6);
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return String.format("%s with %d pockets.", name, pocketCount);
	}

}