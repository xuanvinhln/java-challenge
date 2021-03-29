package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese.Cheese;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese.GoatCheese;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce.CaliforniaOilSauce;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new CaliforniaOilSauce();
	}
}
