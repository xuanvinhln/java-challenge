package challenge.design_patterns.structural_patterns.decorator.structure;

public class Decorator implements Component {
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		this.component.operation();
	}
}
