package challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.factory.topping;

import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese.Cheese;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.cheese.MozzarellaCheese;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce.Sauce;
import challenge.design_patterns.creational_patterns.abstract_factory.pizza_store_ex.product.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}
}
