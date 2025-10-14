package factory;

import models.Pants;
import models.PreppyPants;
import models.PreppyShirt;
import models.Shirt;

public class PreppyFactory implements IClothesFactory {

	public PreppyFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new PreppyShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new PreppyPants();
	}

}