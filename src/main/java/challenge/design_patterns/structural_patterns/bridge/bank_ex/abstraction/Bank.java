package challenge.design_patterns.structural_patterns.bridge.bank_ex.abstraction;

import challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor.Account;

public abstract class Bank {
	protected Account account;

	public Bank(Account account) {
		this.account = account;
	}

	public void openAccount() {
		this.account.openAccount();
	}
}
