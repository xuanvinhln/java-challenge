package challenge.design_patterns.structural_patterns.adapter.drawing_ex.adapter;

import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adaptee.Manipulator;
import challenge.design_patterns.structural_patterns.adapter.drawing_ex.target.Shape;

public class Line extends Shape {

	@Override
	public void boundingBox() {

	}

	@Override
	public Manipulator createManipulator() {
		return null;
	}

}
