package challenge.design_patterns.behavioral_patterns.command.bank_ex;

public class CloseAccount implements Command {
	private Account receiver;

	public CloseAccount(Account account) {
		this.receiver = account;
	}

	@Override
	public void execute() {
		this.receiver.close();
	}
}
