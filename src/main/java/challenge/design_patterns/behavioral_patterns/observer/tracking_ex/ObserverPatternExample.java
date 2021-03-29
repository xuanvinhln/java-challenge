package challenge.design_patterns.behavioral_patterns.observer.tracking_ex;

import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers.Logger;
import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers.Mailer;
import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers.Protector;
import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.subject.AccountService;

public class ObserverPatternExample {
	private static Logger logger = new Logger();
	private static Mailer mailer = new Mailer();
	private static Protector protector = new Protector();

	public static void main(String[] args) {
		AccountService account1 = createAccount("contact@gpcoder.com", "127.0.0.1");
		account1.login();
		account1.changeStatus(LoginStatus.EXPIRED);

		System.out.println("---");
		AccountService account2 = createAccount("contact@gpcoder.com", "116.108.77.231");
		account2.login();
	}

	private static AccountService createAccount(String email, String ip) {
		AccountService account = new AccountService(email, ip);
		account.attach(logger);
		account.attach(mailer);
		account.attach(protector);
		return account;
	}
}