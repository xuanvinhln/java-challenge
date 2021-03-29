package challenge.design_patterns.structural_patterns.adapter.drawing_ex.target;

import challenge.design_patterns.structural_patterns.adapter.drawing_ex.adaptee.Manipulator;

public abstract class Shape {
	public abstract void boundingBox();

	public abstract Manipulator createManipulator();
}
