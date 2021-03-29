package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.pizza;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.Pizza;

public abstract class BasePizzaFactory {

	public abstract Pizza createPizza(String type);
}
