package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.pizza;

public abstract class Pizza {
	public abstract void addIngredients();

	public void bakePizza() {
		System.out.println("Pizza baked at 400 for 20 minutes.");
	}
}
