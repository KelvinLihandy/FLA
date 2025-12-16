package models;

import java.util.Iterator;
import java.util.LinkedList;

import iterator.IteratableCollection;
import iterator.ProductIterator;

public class ProductCollection implements IteratableCollection {
	
	private LinkedList<Product> products;

	public ProductCollection() {
		products = new LinkedList<>();
		products.add(new Product("adadasdasda", 1999));
		products.add(new Product("adadasdasd", 1999));
		products.add(new Product("adadasdaa", 1999));
		products.add(new Product("adadasda", 1999));
		products.add(new Product("asdasda", 1999));
		products.add(new Product("adasda", 1999));
		products.add(new Product("dasda", 1999));
		products.add(new Product("asda", 1999));
		products.add(new Product("ada", 1999));
	}



	@Override
	public Iterator<Product> createIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(products);
	}

}
