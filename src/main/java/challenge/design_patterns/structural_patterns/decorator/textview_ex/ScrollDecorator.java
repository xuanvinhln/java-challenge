package challenge.design_patterns.structural_patterns.decorator.textview_ex;

public class ScrollDecorator extends Decorator {
	private int scrollPosition;

	public ScrollDecorator(VisualComponent component) {
		super(component);
	}

	@Override
	public void draw() {
		super.component.draw();
		this.scrollTo();
	}

	private void scrollTo() {
		System.out.println("scrollTo: " + this.scrollPosition);
	}
}
