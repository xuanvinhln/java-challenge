package challenge.design_patterns.behavioral_patterns.template_method.pizza_ex;

public abstract class PizzaMaker {
	public final void makePizza() {
		preparePizzaDough();
		preBakeCrust();
		prepareIngredients();
		addToppings();
		bakePizza();
		if (customerWantsPackedPizza()) {
			packPizza();
		}
	}

	protected final void preparePizzaDough() {
		System.out.println(
				"Preparing pizza dough with plain flour, dried yeast, caster sugar, salt, olive oil, and warm water.");
	}

	protected final void preBakeCrust() {
		System.out.println("Pre baking crust at 325 F for 3 minutes.");
	}

	protected abstract void prepareIngredients();

	protected abstract void addToppings();

	protected void bakePizza() {
		System.out.println("Baking pizza at 400 F for 12 minutes.");
	}

	protected void packPizza() {
		System.out.println("Packing pizza in pizza delivery box.");
	}

	protected boolean customerWantsPackedPizza() {
		return true;
	}
}