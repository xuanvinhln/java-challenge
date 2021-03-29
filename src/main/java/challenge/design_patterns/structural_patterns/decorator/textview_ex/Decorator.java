package challenge.design_patterns.structural_patterns.decorator.textview_ex;

public abstract class Decorator extends VisualComponent {
	protected VisualComponent component; 
	
	public Decorator(VisualComponent component) {
		this.component = component;
	}
	
	@Override
	public void draw() {
		this.component.draw();
	}
}
