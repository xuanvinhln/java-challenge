package challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_factory;

import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.MotifScrollBar;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.MotifWindow;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.ScrollBar;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.Window;

public class MotifWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	@Override
	public Window createWindow() {
		return new MotifWindow();
	}
}
