package challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Saving Account");
	}
}
