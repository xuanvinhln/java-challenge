package challenge.design_patterns.structural_patterns.bridge.bank_ex.abstraction;

import challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor.Account;

public class TPBank extends Bank {

	public TPBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.print("Open your account at TPBank is a ");
		super.openAccount();
	}
}
