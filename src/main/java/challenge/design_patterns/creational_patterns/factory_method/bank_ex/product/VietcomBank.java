package challenge.design_patterns.creational_patterns.factory_method.bank_ex.product;

public class VietcomBank implements Bank {
	private static String name = "VietcomBank";
	
	@Override
	public String getBankName() {
		return VietcomBank.name;
	}

}
