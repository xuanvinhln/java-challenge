package challenge.design_patterns.creational_patterns.builder.pizza_ex;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	public void buildDough() {
		pizza.setDough("cross");
	}

	public void buildSauce() {
		pizza.setSauce("mild");
	}

	public void buildTopping() {
		pizza.setTopping("ham + pineapple");
	}
}
