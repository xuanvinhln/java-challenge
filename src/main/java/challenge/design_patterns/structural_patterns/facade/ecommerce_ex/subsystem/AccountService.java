package challenge.design_patterns.structural_patterns.facade.ecommerce_ex.subsystem;

public class AccountService {
	public void getAccount(String email) {
		System.out.println("Getting the account of " + email);
	}
}
