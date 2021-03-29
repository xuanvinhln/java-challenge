package challenge.design_patterns.creational_patterns.factory_method.figure_ex.creator;

import challenge.design_patterns.creational_patterns.factory_method.figure_ex.product.Manipulator;
import challenge.design_patterns.creational_patterns.factory_method.figure_ex.product.TextManipulator;

public class TextFigure extends Figure {
	@Override
	public Manipulator createManipulator() {
		return new TextManipulator();
	}
}
