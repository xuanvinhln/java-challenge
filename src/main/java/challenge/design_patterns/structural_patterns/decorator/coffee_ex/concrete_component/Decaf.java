package challenge.design_patterns.structural_patterns.decorator.coffee_ex.concrete_component;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class Decaf extends Beverage {
	private double cost = 1.05;

	public Decaf() {
		super("Decaf");
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
