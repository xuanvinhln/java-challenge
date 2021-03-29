package challenge.design_patterns.creational_patterns.abstract_factory.structure.factory;

import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductA;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductB;

public interface AbstractFactory {
	public AbstractProductA createProductA();

	public AbstractProductB createProductB();

}
