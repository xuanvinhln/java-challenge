package challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product;

public class MotifScrollBar implements ScrollBar {

	@Override
	public void create() {
		System.out.println("create MotifScrollBar");
	}
}
