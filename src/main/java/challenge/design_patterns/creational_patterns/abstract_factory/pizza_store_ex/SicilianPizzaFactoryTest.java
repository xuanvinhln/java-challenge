package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.pizza.BasePizzaFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.pizza.SicilianPizzaFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.Pizza;

public class SicilianPizzaFactoryTest {
	public static void main(String[] args) {
		BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
		
		System.out.println(cheesePizza + " " + pepperoniPizza);
	}
}