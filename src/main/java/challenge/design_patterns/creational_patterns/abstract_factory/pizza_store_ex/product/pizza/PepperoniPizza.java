package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping.BaseToppingFactory;

public class PepperoniPizza extends Pizza {
	BaseToppingFactory toppingFactory;

	public PepperoniPizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pepperoni pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}
}
