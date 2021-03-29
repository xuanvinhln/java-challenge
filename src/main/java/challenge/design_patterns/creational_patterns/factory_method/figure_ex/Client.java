package challenge.design_patterns.creational_patterns.factory_method.figure_ex;

import challenge.design_patterns.creational_patterns.factory_method.figure_ex.creator.LineFigure;

public class Client {
	public static void main(String[] args) {
		LineFigure lineFigure = new LineFigure();
		lineFigure.createManipulator().downClick();
	}
}
