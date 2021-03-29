package challenge.design_patterns.creational_patterns.abstract_factory.structure;

import challenge.design_patterns.creational_patterns.abstract_factory.structure.factory.AbstractFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.factory.ConcreteFactory1;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.factory.ConcreteFactory2;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductA;
import challenge.design_patterns.creational_patterns.abstract_factory.structure.product.AbstractProductB;

public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory;
		AbstractProductA abstractProductA;
		AbstractProductB abstractProductB;

		abstractFactory = new ConcreteFactory1();
		abstractProductA = abstractFactory.createProductA();
		abstractProductB = abstractFactory.createProductB();
		abstractProductA.toString();
		abstractProductB.toString();

		abstractFactory = new ConcreteFactory2();
		abstractProductA = abstractFactory.createProductA();
		abstractProductB = abstractFactory.createProductB();
		abstractProductA.toString();
		abstractProductB.toString();
	}
}
