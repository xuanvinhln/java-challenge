package challenge.design_patterns.behavioral_patterns.command.structure;

public class Invoker {
	private Command command;
	
	public void execute() {
		this.getCommand().execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
}
