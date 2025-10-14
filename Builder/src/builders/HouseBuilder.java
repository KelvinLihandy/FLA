package builders;

import interfaces.IBuilder;
import models.House;

public class HouseBuilder implements IBuilder {
	
	private int window;
	private int floor;
	private int door;
	private boolean hasGarage, hasSwimmingPool, hasGarden, hasStatue;
	
	public HouseBuilder() {
		// TODO Auto-generated constructor stub
		this.reset();
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.window = 0;
		this.door = 0;
		this.floor = 0;
		this.hasGarage = false;
		this.hasGarden = false;
		this.hasStatue = false;
		this.hasSwimmingPool = false;
	}

	@Override
	public IBuilder setWindow(int _window) {
		// TODO Auto-generated method stub 
		this.window = _window;
		return this;
	}

	@Override
	public IBuilder setDoor(int _door) {
		// TODO Auto-generated method stub
		this.door = _door;
		return this;
	}

	@Override
	public IBuilder setFloor(int _floor) {
		// TODO Auto-generated method stub
		this.floor = _floor;
		return this;
	}

	@Override
	public IBuilder setGarage() {
		// TODO Auto-generated method stub
		this.hasGarage = true;
		return this;
	}

	@Override
	public IBuilder setGarder() {
		// TODO Auto-generated method stub
		this.hasGarage = true;
		return this;
	}

	@Override
	public IBuilder setStatue() {
		// TODO Auto-generated method stub
		this.hasStatue = true;
		return this;
	}

	@Override
	public IBuilder serSwimmingPoool() {
		// TODO Auto-generated method stub
		this.hasSwimmingPool = true;
		return this;
	}
	
	public House build() {
		House house = new House(window, floor, door, hasGarage, hasSwimmingPool, hasGarden, hasStatue);
		this.reset();
		return house;
	}

}
