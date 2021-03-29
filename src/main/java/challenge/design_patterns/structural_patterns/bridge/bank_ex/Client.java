package challenge.design_patterns.structural_patterns.bridge.bank_ex;

import challenge.design_patterns.structural_patterns.bridge.bank_ex.abstraction.Bank;
import challenge.design_patterns.structural_patterns.bridge.bank_ex.abstraction.TPBank;
import challenge.design_patterns.structural_patterns.bridge.bank_ex.abstraction.VietcomBank;
import challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor.CheckingAccount;
import challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor.SavingAccount;

public class Client {
	public static void main(String[] args) {
		Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();
 
        Bank tpBank = new TPBank(new SavingAccount());
        tpBank.openAccount();
	}
}
