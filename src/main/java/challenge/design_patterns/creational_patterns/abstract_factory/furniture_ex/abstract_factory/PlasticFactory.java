package challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_factory;

import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Chair;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.PlasticChair;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.PlasticTable;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
	@Override
	public Chair createChair() {
		return new PlasticChair();
	}

	@Override
	public Table createTable() {
		return new PlasticTable();
	}
}
