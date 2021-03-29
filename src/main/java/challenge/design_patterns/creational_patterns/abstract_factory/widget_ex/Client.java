package challenge.design_patterns.creational_patterns.abstract_factory.widget_ex;

import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_factory.MotifWidgetFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_factory.WidgetFactory;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.ScrollBar;
import challenge.design_patterns.creational_patterns.abstract_factory.widget_ex.abstract_product.Window;

public class Client {
	public static void main(String[] args) {
		WidgetFactory widgetFactory = new MotifWidgetFactory();

		ScrollBar scrollBar = widgetFactory.createScrollBar();
		scrollBar.create();

		Window window = widgetFactory.createWindow();
		window.create();
	}
}
