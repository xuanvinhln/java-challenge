package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce;

public class CaliforniaOilSauce implements Sauce {
	public CaliforniaOilSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("Preparing california oil sauce..");
	}
}
