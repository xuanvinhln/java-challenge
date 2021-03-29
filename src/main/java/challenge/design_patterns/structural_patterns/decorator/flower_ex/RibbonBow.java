package challenge.design_patterns.structural_patterns.decorator.flower_ex;

public class RibbonBow extends FlowerBouquetDecorator {
	FlowerBouquet flowerBouquet;

	public RibbonBow(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}

	public String getDescription() {
		return flowerBouquet.getDescription() + ", ribbon bow";
	}

	public double cost() {
		return 6.5 + flowerBouquet.cost();
	}
}