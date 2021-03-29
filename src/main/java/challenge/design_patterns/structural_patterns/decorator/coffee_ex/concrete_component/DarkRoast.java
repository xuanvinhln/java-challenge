package challenge.design_patterns.structural_patterns.decorator.coffee_ex.concrete_component;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class DarkRoast extends Beverage {
	private double cost = 0.99;

	public DarkRoast() {
		super("DaskRoast");
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
