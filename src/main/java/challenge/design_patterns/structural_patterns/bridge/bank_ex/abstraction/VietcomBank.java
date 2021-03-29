package challenge.design_patterns.structural_patterns.bridge.bank_ex.abstraction;

import challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor.Account;

public class VietcomBank extends Bank {

	public VietcomBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.print("Open your account at VietcomBank is a ");
		super.openAccount();
	}
}
