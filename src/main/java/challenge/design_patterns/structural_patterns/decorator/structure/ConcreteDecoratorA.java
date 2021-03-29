package challenge.design_patterns.structural_patterns.decorator.structure;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		super.operation();
		System.out.println(addedState);
	}
}
