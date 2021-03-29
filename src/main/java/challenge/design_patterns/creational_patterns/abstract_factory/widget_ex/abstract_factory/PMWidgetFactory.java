package challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_factory;

import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.PMScrollBar;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.PMWindow;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.ScrollBar;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.Window;

public class PMWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

	@Override
	public Window createWindow() {
		return new PMWindow();
	}
}
