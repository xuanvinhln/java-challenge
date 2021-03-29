package challenge.design_patterns.structural_patterns.decorator.coffee_ex.component;

public abstract class Beverage {
	public String description = "Unknown Beverage";

	public Beverage(String description) {
		this.description = description;
	}

	public abstract String getDescription();

	public abstract double cost();
}
