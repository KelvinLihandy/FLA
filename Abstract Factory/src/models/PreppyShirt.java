package models;

public class PreppyShirt extends Shirt {
	
	private String sleeveLength;

	public PreppyShirt() {
		// TODO Auto-generated constructor stub
		setName("Preppy Shirt");
		this.sleeveLength = Math.random() < 0.5 ? "medium" : "long";
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return String.format("%s with %s sleeve length.", name, sleeveLength);
	}

}