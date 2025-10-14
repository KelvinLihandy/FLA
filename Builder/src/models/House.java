package models;

public class House implements Cloneable {

	private int window;
	private int floor;
	private int door;
	private boolean hasGarage, hasSwimmingPool, hasGarden, hasStatue;
	
	public House(int window, int floor, int door, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden,
			boolean hasStatue) {
		super();
		this.window = window;
		this.floor = floor;
		this.door = door;
		this.hasGarage = hasGarage;
		this.hasSwimmingPool = hasSwimmingPool;
		this.hasGarden = hasGarden;
		this.hasStatue = hasStatue;
	}
	
	@Override
	public House clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (House) super.clone();
	}
	
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean isHasGarage() {
		return hasGarage;
	}
	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}
	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}
	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}
	public boolean isHasGarden() {
		return hasGarden;
	}
	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}
	public boolean isHasStatue() {
		return hasStatue;
	}
	public void setHasStatue(boolean hasStatue) {
		this.hasStatue = hasStatue;
	}
	
	
}
