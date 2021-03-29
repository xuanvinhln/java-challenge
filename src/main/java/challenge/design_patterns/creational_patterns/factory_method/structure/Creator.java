package challenge.design_patterns.creational_patterns.factory_method.structure;

public abstract class Creator {
	public abstract Product factoryMethod();

	public void anOperation() {
		Product product = factoryMethod();
		product.doSomething();
	}
}
