package interfaces;

public interface HourChangeEventPublisher {
	void notifyAllSubscriber(int hour);
	void addSubscriber(HourChangeEventSubscriber s);
	void removeSubscriber(HourChangeEventSubscriber s);
}
