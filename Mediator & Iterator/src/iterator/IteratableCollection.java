package iterator;
import models.Product;
import java.util.Iterator;

public interface IteratableCollection {

	public Iterator<Product> createIterator();
	
}
