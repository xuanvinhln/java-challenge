package challenge.design_patterns.structural_patterns.decorator.coffee_ex.concrete_component;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class Espresso extends Beverage {
	private double cost = 1.99;

	public Espresso() {
		super("Espresso");
	}

	@Override
	public String getDescription() {
		return super.description;
	}

	@Override
	public double cost() {
		return this.cost;
	}
}
