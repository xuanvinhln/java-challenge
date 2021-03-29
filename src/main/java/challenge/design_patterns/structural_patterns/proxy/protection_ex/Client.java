package challenge.design_patterns.structural_patterns.proxy.protection_ex;

public class Client {
	public static void main(String[] args) {
		UserService admin = new UserServiceProxy("gpcoder", "admin");
		admin.load();
		admin.insert();

		UserService customer = new UserServiceProxy("customer", "guest");
		customer.load();
		customer.insert();
	}
}
