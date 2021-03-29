package challenge.design_patterns.creational_patterns.factory_method.pizza_ex.product;

public abstract class Pizza {
	public abstract void addIngredients();

	public void bakePizza() {
		System.out.println("Pizza baked at 400 for 20 minutes.");
	}
}
