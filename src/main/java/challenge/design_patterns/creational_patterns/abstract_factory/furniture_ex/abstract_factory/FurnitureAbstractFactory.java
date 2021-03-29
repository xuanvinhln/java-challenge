package challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_factory;

import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Chair;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Table;

public abstract class FurnitureAbstractFactory {
	public abstract Chair createChair();

	public abstract Table createTable();

	public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
		FurnitureAbstractFactory furnitureAbstractFactory = null;

		switch (materialType) {
		case FLASTIC:
			furnitureAbstractFactory = new PlasticFactory();
			break;
		case WOOD:
			furnitureAbstractFactory = new WoodFactory();
			break;
		default:
			throw new UnsupportedOperationException("This material is unsupported ");
		}

		return furnitureAbstractFactory;
	}
}
