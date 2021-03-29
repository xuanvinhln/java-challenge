package challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex;

import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_factory.FurnitureAbstractFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_factory.MaterialType;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Chair;
import challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product.Table;

public class Client {
	public static void main(String[] args) {
		FurnitureAbstractFactory factory = FurnitureAbstractFactory.getFactory(MaterialType.FLASTIC);
		Chair chair = factory.createChair();
		chair.create();
		Table table = factory.createTable();
		table.create();

		factory = FurnitureAbstractFactory.getFactory(MaterialType.WOOD);
		chair = factory.createChair();
		chair.create();
		table = factory.createTable();
		table.create();
	}
}
