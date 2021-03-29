package challenge.design_patterns.structural_patterns.facade.ecommerce_ex.subsystem;

public class SmsService {
	public void sendSMS(String mobilePhone) {
		System.out.println("Sending an mesage to " + mobilePhone);
	}
}
