package challenge.design_patterns.structural_patterns.adapter.drawing_ex.adapter;

import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adaptee.Manipulator;
import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adaptee.TextManipulator;
import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adaptee.TextView;
import challenge.design_patterns.structural_patterns.adapter.drawing_ex.target.Shape;

public class TextShape extends Shape {
	private TextView textView;

	public TextShape(TextView textView) {
		this.textView = textView;
	}

	@Override
	public void boundingBox() {
		this.textView.getExtent();
	}

	@Override
	public Manipulator createManipulator() {
		return new TextManipulator();
	}
}
