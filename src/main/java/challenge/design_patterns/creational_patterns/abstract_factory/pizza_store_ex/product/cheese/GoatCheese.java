package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese;

public class GoatCheese implements Cheese {
	public GoatCheese() {
		prepareCheese();
	}

	@Override
	public void prepareCheese() {
		System.out.println("Preparing goat cheese...");
	}
}