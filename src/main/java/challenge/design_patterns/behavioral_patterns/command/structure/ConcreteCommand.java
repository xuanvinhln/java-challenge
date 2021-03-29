package challenge.design_patterns.behavioral_patterns.command.structure;

public class ConcreteCommand implements Command {
	private Receiver receiver;
	private String newState;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
		this.newState = "new state";
	}
	
	@Override
	public void execute() {
		this.receiver.action(this.newState);
	}
}
