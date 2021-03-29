package challenge.design_patterns.behavioral_patterns.command.document_ex.commands;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {
	private List<Command> listCommand;
	
	public MacroCommand() {
		this.listCommand = new ArrayList<Command>();
	}
	
	public void add(Command command) {
		this.listCommand.add(command);
	}

	@Override
	public void execute() {
		for (Command cmd : listCommand) {
			cmd.execute();
		}
	}
}
