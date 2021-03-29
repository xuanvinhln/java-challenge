package challenge.design_patterns.creational_patterns.builder.pizza_ex;

public class Client {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
		pizza.showInfo();
		
		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();
		pizza = waiter.getPizza();
		pizza.showInfo();
	}
}
