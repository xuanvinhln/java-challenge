package challenge.design_patterns.structural_patterns.decorator.textview_ex;

public class BorderDecorator extends Decorator {
	private int borderWidth;

	public BorderDecorator(VisualComponent component) {
		super(component);
	}

	@Override
	public void draw() {
		super.draw();
		this.drawBorder();
	}

	private void drawBorder() {
		System.out.println("drawBorder width: " + borderWidth);
	}
}
