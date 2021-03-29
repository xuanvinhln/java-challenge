package challenge.design_patterns.structural_patterns.facade.ecommerce_ex;

import challenge.design_patterns.structural_patterns.facade.ecommerce_ex.subsystem.ShopFacade;

public class Client {
	public static void main(String[] args) {
		ShopFacade.getInstance().buyProductByCashWithFreeShipping("contact@gpcoder.com");
		ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("gpcodervn@gmail.com", "0988.999.999");
	}
}
