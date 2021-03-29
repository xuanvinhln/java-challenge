package challenge.design_patterns.structural_patterns.decorator.structure;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);

		concreteDecoratorB.operation();
	}
}
