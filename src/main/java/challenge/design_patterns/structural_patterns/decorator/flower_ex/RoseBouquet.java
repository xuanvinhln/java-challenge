package challenge.design_patterns.structural_patterns.decorator.flower_ex;

public class RoseBouquet extends FlowerBouquet {
	public RoseBouquet() {
		description = "Rose bouquet";
	}

	public double cost() {
		return 12.0;
	}
}