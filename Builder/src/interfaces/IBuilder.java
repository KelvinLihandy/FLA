package interfaces;

public interface IBuilder {
	
	public void reset();
	public IBuilder setWindow(int _window);
	public IBuilder setDoor(int _door);
	public IBuilder setFloor(int _floor);
	public IBuilder setGarage();
	public IBuilder setGarder();
	public IBuilder setStatue();
	public IBuilder serSwimmingPoool();
	
}
