package iterator;

import java.util.Iterator;
import java.util.LinkedList;

import models.Product;

public class ProductIterator implements Iterator<Product> {

	private LinkedList<Product> products;
	private int position;
	
	
	public ProductIterator(LinkedList<Product> products) {
		super();
		this.products = products;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		return position < products.size();
	}

	@Override
	public Product next() {
		return products.get(position++);
	}

}
