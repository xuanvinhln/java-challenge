package challenge.design_patterns.creational_patterns.factory_method.figure_ex.creator;

import challenge.design_patterns.creational_patterns.factory_method.figure_ex.product.LineManipulator;
import challenge.design_patterns.creational_patterns.factory_method.figure_ex.product.Manipulator;

public class LineFigure extends Figure {
	@Override
	public Manipulator createManipulator() {
		return new LineManipulator();
	}
}
