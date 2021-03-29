package challenge.design_patterns.structural_patterns.decorator.coffee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class Mocha extends CondimentDecorator {
	private String name = "Mocha";
	private double cost = 0.20;

	public Mocha(Beverage beverage) {
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
