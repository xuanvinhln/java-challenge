package challenge.design_patterns.structural_patterns.decorator.structure;

public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		this.addedBehavior();
	}

	public void addedBehavior() {

	}
}
