package challenge.design_patterns.creational_patterns.abstract_factory.structure.factory;

import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductA;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductB;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.ProductA2;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.ProductB2;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
