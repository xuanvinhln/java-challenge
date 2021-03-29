package challenge.design_patterns.structural_patterns.decorator.coffee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class SteamedMilk extends CondimentDecorator {
	private String name = "SteamedMilk";
	private double cost = 0.10;

	protected SteamedMilk(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return super.getDescription() + ", " + this.name;
	}

	@Override
	public double cost() {
		return super.cost() + this.cost;
	}
}
