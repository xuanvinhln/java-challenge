package challenge.design_patterns.creational_patterns.factory_method.bank_ex;

import challenge.design_patterns.creational_patterns.factory_method.bank_ex.creator.BankFactory;
import challenge.design_patterns.creational_patterns.factory_method.bank_ex.product.Bank;
import challenge.design_patterns.creational_patterns.factory_method.bank_ex.product.TPBank;

public class Client {
	public static void main(String[] args) {
		Bank bank = BankFactory.getBank(TPBank.class);
		System.out.println(bank.getBankName());

		bank = BankFactory.getBank2(BankType.VIETCOMBANK);
		System.out.println(bank.getBankName());
	}
}
