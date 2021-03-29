package challenge.design_patterns.structural_patterns.decorator.flower_ex;

public class PaperWrapper extends FlowerBouquetDecorator {
	FlowerBouquet flowerBouquet;

	public PaperWrapper(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}

	public String getDescription() {
		return flowerBouquet.getDescription() + ", paper wrap";
	}

	public double cost() {
		return 3 + flowerBouquet.cost();
	}
}