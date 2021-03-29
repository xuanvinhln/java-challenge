package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese;

public class MozzarellaCheese implements Cheese {
	public MozzarellaCheese() {
		prepareCheese();
	}

	@Override
	public void prepareCheese() {
		System.out.println("Preparing mozzarella cheese...");
	}
}