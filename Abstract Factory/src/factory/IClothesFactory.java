package factory;

import models.Pants;
import models.Shirt;

public interface IClothesFactory {

	public Shirt createShirt();
	public Pants createPants();
	
}