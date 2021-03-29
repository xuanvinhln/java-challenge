package challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_factory;

import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.ScrollBar;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.Window;

public abstract class WidgetFactory {
	public abstract ScrollBar createScrollBar();

	public abstract Window createWindow();
}
