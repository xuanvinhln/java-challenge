package challenge.design_patterns.creational_patterns.abstract_factory.structure.factory;

import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductA;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductB;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.ProductA1;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
