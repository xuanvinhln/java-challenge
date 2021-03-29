package challenge.design_patterns.creational_patterns.builder.order_ex.builder;

import challenge.design_patterns.creational_patterns.builder.order_ex.product.order.Order;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.BreadType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.OrderType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.SauceType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.VegetableType;

public interface OrderBuilder {
	OrderBuilder orderType(OrderType orderType);

	OrderBuilder orderBread(BreadType breadType);

	OrderBuilder orderSauce(SauceType sauceType);

	OrderBuilder orderVegetable(VegetableType vegetableType);

	Order build();
}
