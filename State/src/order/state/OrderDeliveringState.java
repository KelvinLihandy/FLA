package order.state;

import order.Order;

public class OrderDeliveringState extends OrderBaseState {

	public OrderDeliveringState(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onEnter() {
		// TODO Auto-generated method stub
		System.out.println("Showing driver's position to screen");
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Update driver's position to screen");
	}

	@Override
	public void onLeave() {
		// TODO Auto-generated method stub
		System.out.println("Mark delivery as done");
	}

}
