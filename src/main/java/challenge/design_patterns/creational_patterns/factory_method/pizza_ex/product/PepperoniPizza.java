package challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product;

public class PepperoniPizza extends Pizza {
	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pepperoni pizza.");
	}
}
