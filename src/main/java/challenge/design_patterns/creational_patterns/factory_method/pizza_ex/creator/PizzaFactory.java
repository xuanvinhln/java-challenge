package challenge.design_patterns.creational_patterns.factory_method.pizza_ex.creator;

import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product.CheesePizza;
import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product.PepperoniPizza;
import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product.Pizza;
import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;

		switch (type.toLowerCase()) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "pepperoni":
			pizza = new PepperoniPizza();
			break;
		case "veggie":
			pizza = new VeggiePizza();
			break;
		default:
			throw new IllegalArgumentException("No such pizza.");
		}

		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}