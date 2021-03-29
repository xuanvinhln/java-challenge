package challenge.design_patterns.structural_patterns.decorator.flower_ex;

public class OrchidBouquet extends FlowerBouquet {
	public OrchidBouquet() {
		description = "Orchid bouquet";
	}

	public double cost() {
		return 29.0;
	}
}