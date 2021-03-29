package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce;

public class TomatoSauce implements Sauce {
	public TomatoSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("Preparing tomato sauce..");
	}
}
