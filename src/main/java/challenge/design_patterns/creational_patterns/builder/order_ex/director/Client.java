package challenge.design_patterns.creational_patterns.builder.order_ex.director;

import challenge.design_patterns.creational_patterns.builder.order_ex.concrete_builder.FastFoodOrderBuilder;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.order.Order;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.BreadType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.OrderType;
import challenge.design_patterns.creational_patterns.builder.order_ex.product.type.SauceType;

public class Client {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder()
				.orderType(OrderType.ON_SITE)
				.orderBread(BreadType.OMELETTE)
				.orderSauce(SauceType.SOY_SAUCE)
				.build();
		
		System.out.println(order);
	}
}
