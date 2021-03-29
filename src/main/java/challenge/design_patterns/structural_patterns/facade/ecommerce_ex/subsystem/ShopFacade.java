package challenge.design_patterns.structural_patterns.facade.ecommerce_ex.subsystem;

public class ShopFacade {
	private static volatile ShopFacade instance;

	private AccountService accountService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private EmailService emailService;
	private SmsService smsService;

	private ShopFacade() {
		accountService = new AccountService();
		paymentService = new PaymentService();
		shippingService = new ShippingService();
		emailService = new EmailService();
		smsService = new SmsService();
	}

	public static ShopFacade getInstance() {
		if (instance == null) {
			synchronized (ShopFacade.class) {
				if (instance == null) {
					return new ShopFacade();
				}
			}
		}

		return instance;
	}

	public void buyProductByCashWithFreeShipping(String email) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShipping();
		emailService.sendMail(email);
		System.out.println("Done\n");
	}

	public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
		accountService.getAccount(email);
		paymentService.paymentByPaypal();
		shippingService.standardShipping();
		emailService.sendMail(email);
		smsService.sendSMS(mobilePhone);
		System.out.println("Done\n");
	}
}
