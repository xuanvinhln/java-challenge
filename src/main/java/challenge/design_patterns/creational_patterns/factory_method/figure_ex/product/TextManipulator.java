package challenge.design_patterns.creational_patterns.factory_method.figure_ex.product;

public class TextManipulator implements Manipulator {

	@Override
	public void downClick() {
		System.out.println("TextManipulator: downClick");
	}

	@Override
	public void drag() {
		System.out.println("TextManipulator: drag");
	}

	@Override
	public void upClick() {
		System.out.println("TextManipulator: upClick");
	}

}
