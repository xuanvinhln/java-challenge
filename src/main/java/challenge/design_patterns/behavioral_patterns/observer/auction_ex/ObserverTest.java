package challenge.design_patterns.behavioral_patterns.observer.auction_ex;

import java.math.BigDecimal;

/*
 * Subject (Subject interface): Provides an interface to attach and detach Observer objects.
 * 
 * ConcreteSubject (Product class): Implements the Subject interface. A ConcreteSubject sends notification to Observer objects when its state change.
 * 
 * Observer (Observer interface): Provides an interface for objects that should be notified of changes in a Subject.
 * 
 * ConcreteObserver (Bidder class): Implements Observer to receive notifications from the Subject and keep its state consistent with the state of the Subject.
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject product = new Product("36 inch LED TV", new BigDecimal(350));
		Observer bidder1 = new Bidder("Alex Parker");
		Observer bidder2 = new Bidder("Henry Smith");
		Observer bidder3 = new Bidder("Mary Peterson");

		product.registerObserver(bidder1);
		product.registerObserver(bidder2);
		product.registerObserver(bidder3);

		product.setBidAmount(bidder1, new BigDecimal(375));
		product.removeObserver(bidder2);
		product.setBidAmount(bidder3, new BigDecimal(400));
	}
}