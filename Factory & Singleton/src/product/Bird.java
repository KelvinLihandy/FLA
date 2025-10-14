package product;

public class Bird extends Animal {

	public Bird() {
		System.out.println("New birb");
	}
	
	@Override
	public void move() {
		System.out.println("Fly");
	}
	
	@Override
	public void speak() {
		System.out.println("Awiwir");
	}

}
