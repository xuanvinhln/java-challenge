package challenge.design_patterns.behavioral_patterns.template_method.pizza_ex;

/*
 * AbstractClass (PizzaMaker): Is an abstract class that contains a template method
 *	defining the skeleton of an algorithm. The template method calls methods to perform the steps of an algorithm.
 *	The methods can be both common across and specific to different algorithm implementations.
 * ConcreteClass (VegPizzaMaker, NonVegPizzaMaker, and InHouseAssortedPizzaMaker):
 *  Are concrete subclasses of AbstractClass that implements the operations to carry out the algorithm-specific primitive steps.
 */
public class PizzaMakerTest {
	public static void main(String[] args) {
		System.out.println("-----Making Veg Pizza-----");
		PizzaMaker vegPizzaMaker = new VegPizzaMaker();
		vegPizzaMaker.makePizza();
		
		System.out.println("-----Making Non Veg Pizza-----");
		PizzaMaker nonVegPizzaMaker = new NonVegPizzaMaker();
		nonVegPizzaMaker.makePizza();
		
		System.out.println("-----Making In-House Assorted Pizza-----");
		PizzaMaker inHouseAssortedPizzaMaker = new InHouseAssortedPizzaMaker();
		inHouseAssortedPizzaMaker.makePizza();
	}
}