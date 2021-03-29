package challenge.design_patterns.structural_patterns.adapter.drawing_ex;

import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adaptee.TextView;
import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adapter.TextShape;
import challenge.design_patterns.structural_patterns.adapter.drawing_ex.target.Shape;

public class DrawingEditor {
	public static void main(String[] args) {
		Shape shape = new TextShape(new TextView());
		shape.boundingBox();
	}
}
