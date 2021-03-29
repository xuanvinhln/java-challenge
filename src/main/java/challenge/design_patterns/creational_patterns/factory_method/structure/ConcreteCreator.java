package challenge.design_patterns.creational_patterns.factory_method.structure;

public class ConcreteCreator extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}

}
