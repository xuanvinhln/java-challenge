package challenge.design_patterns.creational_patterns.factory_method.figure_ex.creator;

import challenge.design_patterns.creational_patterns.factory_method.figure_ex.product.Manipulator;

public abstract class Figure {
	public abstract Manipulator createManipulator();
}
