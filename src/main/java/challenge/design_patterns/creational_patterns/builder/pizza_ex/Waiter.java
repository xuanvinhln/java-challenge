package challenge.design_patterns.creational_patterns.builder.pizza_ex;

public class Waiter {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
