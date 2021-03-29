package challenge.design_patterns.structural_patterns.decorator.coffee_ex.concrete_component;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class HouseBlend extends Beverage {
	private double cost = 0.89;

	public HouseBlend() {
		super("HouseBlend");
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
