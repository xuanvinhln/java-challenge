package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.pizza;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping.BaseToppingFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping.SicilianToppingFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.CheesePizza;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.PepperoniPizza;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.Pizza;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.VeggiePizza;

public class SicilianPizzaFactory extends BasePizzaFactory {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		BaseToppingFactory toppingFactory = new SicilianToppingFactory();
		switch (type.toLowerCase()) {
		case "cheese":
			pizza = new CheesePizza(toppingFactory);
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(toppingFactory);
			break;
		case "veggie":
			pizza = new VeggiePizza(toppingFactory);
			break;
		default:
			throw new IllegalArgumentException("No such pizza.");
		}
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}
