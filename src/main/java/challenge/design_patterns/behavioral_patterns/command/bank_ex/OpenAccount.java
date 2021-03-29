package challenge.design_patterns.behavioral_patterns.command.bank_ex;

public class OpenAccount implements Command {
	private Account receiver;

	public OpenAccount(Account account) {
		this.receiver = account;
	}

	@Override
	public void execute() {
		this.receiver.open();
	}
}
