package challenge.design_patterns.structural_patterns.decorator.coffee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	private static String description = "CondimentDecorator";
	protected Beverage beverage;

	protected CondimentDecorator(Beverage beverage) {
		super(description);
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	}

	@Override
	public double cost() {
		return this.beverage.cost();
	}
}
