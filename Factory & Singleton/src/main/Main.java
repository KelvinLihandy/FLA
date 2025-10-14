package main;

import factory.AnimalFactory;
import factory.DogFactory;
import product.Animal;

public class Main {

	public Main() {
		DBConnection instance = DBConnection.getInstance();
		DBConnection instance1 = DBConnection.getInstance();
		
		AnimalFactory af = null;
		Animal a = null;
		af = new DogFactory();
		a = af.createAnimal();
	}

	public static void main(String[] args) {
		new Main();
	}

}
