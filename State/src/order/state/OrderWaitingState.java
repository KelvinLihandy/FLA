package order.state;

import order.Order;

public class OrderWaitingState extends  OrderBaseState {

	public OrderWaitingState(Order order) {
		// TODO Auto-generated constructor stub
		super(order);
	}

	@Override
	public void onEnter() {
		// TODO Auto-generated method stub
		System.out.println("Driver is waiting for " + this.getOrder().getFood());
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLeave() {
		// TODO Auto-generated method stub
		System.out.println("send notif to " + this.getOrder().getReceiver() + " food is coming");
	}

}
