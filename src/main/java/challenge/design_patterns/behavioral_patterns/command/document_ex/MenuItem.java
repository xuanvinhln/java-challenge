package challenge.design_patterns.behavioral_patterns.command.document_ex;

import challenge.design_patterns.behavioral_patterns.command.document_ex.commands.Command;

public class MenuItem {
	private Command command;
	
	public MenuItem(Command command) {
		this.command = command;
	}
	
	public void clicked() {
		this.command.execute();
	}
}
