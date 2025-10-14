import factory.IClothesFactory;
import factory.PreppyFactory;
import factory.TomboyFactory;
import models.Pants;
import models.Shirt;

public class Main {

	private IClothesFactory cf;
	private Shirt shirt;
	private Pants pants;
	
	public Main() {
		cf = new PreppyFactory();
		shirt = cf.createShirt();
		pants = cf.createPants();
		System.out.println(shirt.getDetails());
		System.out.println(pants.getDetails());
		
		cf = new TomboyFactory();
		shirt = cf.createShirt();
		pants = cf.createPants();
		System.out.println(shirt.getDetails());
		System.out.println(pants.getDetails());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
