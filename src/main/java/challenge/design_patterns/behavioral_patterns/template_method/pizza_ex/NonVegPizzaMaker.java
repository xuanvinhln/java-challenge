package challenge.design_patterns.behavioral_patterns.template_method.pizza_ex;

public class NonVegPizzaMaker extends PizzaMaker {
	@Override
	public void prepareIngredients() {
		System.out.println("Preparing chicken ham, onion, chicken sausages, and smoked chicken");
	}

	@Override
	public void addToppings() {
		System.out.println("Adding cheese, pepper jelly, and BBQ sauce along with ingredients to crust.");
	}
}