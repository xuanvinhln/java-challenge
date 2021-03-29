package challenge.design_patterns.structural_patterns.decorator.flower_ex;

public abstract class FlowerBouquet {
	String description;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
