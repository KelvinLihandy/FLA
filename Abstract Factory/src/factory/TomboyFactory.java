package factory;

import models.Pants;
import models.Shirt;
import models.TomboyPants;
import models.TomboyShirt;

public class TomboyFactory implements IClothesFactory {

	public TomboyFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new TomboyShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new TomboyPants();
	}

}