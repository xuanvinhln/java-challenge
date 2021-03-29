package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.pizza.BasePizzaFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.pizza.GourmetPizzaFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza.Pizza;

/* AbstractProduct (Cheese and Sauce): Is an interface or an abstract class whose subclasses are instantiated by the abstract factory objects.
 * 
 * ConcreteProduct (GoatCheese, MozzarellaCheese, TomatoSauce, and CaliforniaOilSauce): Are the concrete subclasses that implement/extend AbstractProduct.
 *  The abstract factory objects instantiate these subclasses.
 * 
 * AbstractFactory (BaseToppingFactory): Is an interface or an abstract class whose subclasses instantiate a family of AbstractProduct objects.
 * 
 * ConcreteFactory (SicillianToppingFactory and GourmetToppingFactory): Are the concrete subclasses that implement/extend AbstractFactory.
 *  An object of this subclass instantiates a family of AbstractProduct objects.
 * 
 * Client: Uses AbstractFactory to get AbstractProduct objects.
 */

public class GourmetPizzaFactoryTest {
	public static void main(String[] args) {
		BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza veggiePizza = pizzaFactory.createPizza("veggie");

		System.out.println(cheesePizza + " " + veggiePizza);
	}
}