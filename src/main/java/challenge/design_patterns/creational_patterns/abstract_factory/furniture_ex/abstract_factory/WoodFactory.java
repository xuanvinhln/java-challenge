package challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_factory;

import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Chair;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Table;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.WoodChair;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}
}
