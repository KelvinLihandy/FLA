package factory;

import product.Animal;
import product.Bird;

public class BirdFactory extends AnimalFactory {

	public BirdFactory() {

	}

	@Override
	public Animal createAnimal() {
		return new Bird();
	}

}
