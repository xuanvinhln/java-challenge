package challenge.design_patterns.creational_patterns.factory_method.pizza_ex;

import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.creator.BasePizzaFactory;
import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.creator.PizzaFactory;
import challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product.Pizza;

/* Product (Pizza): Is an interface or an abstract class whose subclasses are instantiated by the factory method.
 * 
 * ConcreteProduct (CheesePizza, PepperoniPizza, and VeggiePizza): Are the concrete subclasses that implement/extend Product.
 *  The factory method instantiates these subclasses.
 * 
 * Creator (BasePizzaFactory): Is an interface or an abstract class that declares the factory method, which returns an object of type Product.
 * 
 * ConcreteCreator (PizzaFactory): Is a concrete class that implements the factory method to create and return a ConcreteProduct to Client.
 * 
 * Client: Asks the Creator for a Product.
 */

public class PizzaFactoryTest {
	public static void main(String[] args) {
		BasePizzaFactory pizzaFactory = new PizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza veggiePizza = pizzaFactory.createPizza("veggie");

		System.out.println(cheesePizza + " " + veggiePizza);
	}
}