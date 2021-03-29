package challenge.design_patterns.creational_patterns.factory_method.pizza_ex.creator;

import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product.Pizza;

public abstract class BasePizzaFactory {
	public abstract Pizza createPizza(String type);
}
