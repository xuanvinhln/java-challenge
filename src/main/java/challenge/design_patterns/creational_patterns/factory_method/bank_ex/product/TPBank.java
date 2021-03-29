package challenge.design_patterns.creational_patterns.factory_method.bank_ex.product;

public class TPBank implements Bank {
	private static String name = "TPBank";
	
	@Override
	public String getBankName() {
		return TPBank.name;
	}

}
