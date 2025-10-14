package models;

public class PreppyPants extends Pants {
	
	private String material;

	public PreppyPants() {
		// TODO Auto-generated constructor stub
		setName("Preppy Pants");
		this.material = Math.random() < 0.5 ? "Linen" : "Cotton";
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return String.format("%s made with 100%% %s.", name, material);
	}

}
