package challenge.design_patterns.creational_patterns.factory_method.figure_ex.product;

public class LineManipulator implements Manipulator {

	@Override
	public void downClick() {
		System.out.println("LineManipulator: downClick");
	}

	@Override
	public void drag() {
		System.out.println("LineManipulator: drag");
	}

	@Override
	public void upClick() {
		System.out.println("LineManipulator: upClick");
	}

}
