package challenge.design_patterns.behavioral_patterns.observer.auction_ex.use_java;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class ProductJava extends Observable {
	private String productName;
	private BigDecimal bidAmount;
	private Observer observer;

	public Observer getObserver() {
		return observer;
	}

	public BigDecimal getBidAmount() {
		return bidAmount;
	}

	public String getProductName() {
		return productName;
	}

	public ProductJava(String productName, BigDecimal bidAmount) {
		this.productName = productName;
		this.bidAmount = bidAmount;
	}

	public void setBidAmount(Observer observer, BigDecimal newBidAmount) {
		System.out.println("-----------------New bid placed----------------");
		int res = bidAmount.compareTo(newBidAmount);
		if (res == -1) {
			this.observer = observer;
			this.bidAmount = newBidAmount;
			setChanged();
			notifyObservers();
		} else {
			System.out.println("New bid amount cannot be less or equal to current bid amount: " + this.bidAmount);
		}
	}
}