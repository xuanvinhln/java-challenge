package challenge.design_patterns.behavioral_patterns.command.bank_ex;

public class Account {
	private String name;

	public Account(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println("Account [" + name + "] Opened\n");
	}

	public void close() {
		System.out.println("Account [" + name + "] Closed\n");
	}
}
