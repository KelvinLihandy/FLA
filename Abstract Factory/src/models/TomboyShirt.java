package models;

public class TomboyShirt extends Shirt {
	
	private boolean detachableHood;

	public TomboyShirt() {
		// TODO Auto-generated constructor stub
		setName("Tomboy Shirt");
		this.detachableHood = Math.random() < 0.5;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return String.format("%s, the hood is%s detachable", name, detachableHood ? "" : " not");
	}

}
