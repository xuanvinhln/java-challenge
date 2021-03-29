package challenge.design_patterns.behavioral_patterns.observer.auction_ex.use_java;

import java.math.BigDecimal;

public class ObservableJavaAPITest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ProductJava product = new ProductJava("L340 Digital Camera", new BigDecimal(325));
		BidderJava bidder1 = new BidderJava("Shally Ferguson");
		BidderJava bidder2 = new BidderJava("Dwayne Bravo");
		BidderJava bidder3 = new BidderJava("Craig Dawson");

		product.addObserver(bidder1);
		product.addObserver(bidder2);
		product.addObserver(bidder3);

		product.setBidAmount(bidder1, new BigDecimal(350));
		product.deleteObserver(bidder2);
		product.setBidAmount(bidder3, new BigDecimal(375));
	}
}