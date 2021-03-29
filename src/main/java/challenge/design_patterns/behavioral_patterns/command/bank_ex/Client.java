package challenge.design_patterns.behavioral_patterns.command.bank_ex;

public class Client {
	public static void main(String[] args) {
		Account account = new Account("gpcoder");

		Command open = new OpenAccount(account);
		Command close = new CloseAccount(account);
		BankApp bankApp = new BankApp(open, close);

		bankApp.clickOpenAccount();
		bankApp.clickCloseAccount();
	}
}
