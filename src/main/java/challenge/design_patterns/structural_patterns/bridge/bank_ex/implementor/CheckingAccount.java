package challenge.design_patterns.structural_patterns.bridge.bank_ex.implementor;

public class CheckingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Checking Account");
	}
}
