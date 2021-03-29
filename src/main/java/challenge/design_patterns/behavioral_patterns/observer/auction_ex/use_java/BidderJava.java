package challenge.design_patterns.behavioral_patterns.observer.auction_ex.use_java;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class BidderJava implements Observer {
	ProductJava observable;
	String bidderName;

	public BidderJava(String bidderName) {
		this.bidderName = bidderName;
	}

	@Override
	public void update(Observable observable, Object arg) {
		this.observable = (ProductJava) observable;
		String name = this.observable.getObserver().toString();
		
		if (name.equals(bidderName)) {
			System.out.println("Hello " + bidderName + "! New bid of amount " + this.observable.getBidAmount()
					+ " has been placed on " + this.observable.getProductName() + " by you");
		}
		if (!name.equals(bidderName))
			System.out.println("Hello " + bidderName + "! New bid of amount " + this.observable.getBidAmount()
					+ " has been placed on " + this.observable.getProductName() + " by "
					+ this.observable.getObserver());
	}

	@Override
	public String toString() {
		return bidderName;
	}
}