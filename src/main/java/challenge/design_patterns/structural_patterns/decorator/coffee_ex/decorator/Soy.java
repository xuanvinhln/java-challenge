package challenge.design_patterns.structural_patterns.decorator.coffee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.coffee_ex.component.Beverage;

public class Soy extends CondimentDecorator {
	private String name = "Soy";
	private double cost = 0.15;

	public Soy(Beverage beverage) {
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
