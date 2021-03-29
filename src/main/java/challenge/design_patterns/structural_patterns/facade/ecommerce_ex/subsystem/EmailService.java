package challenge.design_patterns.structural_patterns.facade.ecommerce_ex.subsystem;

public class EmailService {
	public void sendMail(String mailTo) {
		System.out.println("Sending an email to " + mailTo);
	}
}
