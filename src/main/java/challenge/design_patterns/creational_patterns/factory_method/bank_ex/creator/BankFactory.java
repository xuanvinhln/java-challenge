package challenge.design_patterns.creational_patterns.factory_method.bank_ex.creator;

import java.lang.reflect.InvocationTargetException;

import challenge.design_patterns.creational_patterns.factory_method.bank_ex.BankType;
import challenge.design_patterns.creational_patterns.factory_method.bank_ex.product.Bank;
import challenge.design_patterns.creational_patterns.factory_method.bank_ex.product.TPBank;
import challenge.design_patterns.creational_patterns.factory_method.bank_ex.product.VietcomBank;

public abstract class BankFactory {
	public static <T extends Bank> Bank getBank(Class<T> className) {
		T bank = null;
		try {
			bank = className.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return bank;
	}

	public static Bank getBank2(BankType bankType) {
		switch (bankType) {
		case TPBANK:
			return new TPBank();

		case VIETCOMBANK:
			return new VietcomBank();

		default:
			throw new UnsupportedOperationException("This bank is unsupported ");
		}
	}
}
