package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese.Cheese;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce.Sauce;

public abstract class BaseToppingFactory {
	public abstract Cheese createCheese();

	public abstract Sauce createSauce();
}