package challenge.design_patterns.behavioral_patterns.observer.auction_ex;

import java.math.BigDecimal;

public interface Observer {
	public void update(Observer observer, String productName, BigDecimal bidAmount);
}