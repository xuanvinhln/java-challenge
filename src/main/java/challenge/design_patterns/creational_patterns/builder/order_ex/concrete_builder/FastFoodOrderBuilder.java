package challenge.design_patterns.creational_patterns.builder.order_ex.concrete_builder;

import challenge.design_patterns.creational_patterns.builder.order_ex.builder.OrderBuilder;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.order.Order;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.BreadType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.OrderType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.SauceType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;

	@Override
	public OrderBuilder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	@Override
	public OrderBuilder orderBread(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}

	@Override
	public OrderBuilder orderSauce(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}

	@Override
	public OrderBuilder orderVegetable(VegetableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Order build() {
		return new Order(orderType, breadType, sauceType, vegetableType);
	}
}
