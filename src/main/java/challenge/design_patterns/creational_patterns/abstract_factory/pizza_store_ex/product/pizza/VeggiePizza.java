package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping.BaseToppingFactory;

public class VeggiePizza extends Pizza {
	BaseToppingFactory toppingFactory;

	public VeggiePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for veggie pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}
}