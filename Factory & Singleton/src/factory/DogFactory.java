package factory;

import product.Animal;
import product.Dog;

public class DogFactory extends AnimalFactory {

	public DogFactory() {

	}

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
