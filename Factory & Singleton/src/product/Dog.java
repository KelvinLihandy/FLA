package product;

public class Dog extends Animal {
	
	public Dog(){
		System.out.println("New dog");
	}
	
	@Override
	public void move() {
		System.out.println("Walk");
	}
	
	@Override
	public void speak() {
		System.out.println("Ambabidi");
	}

}
