package challenge.design_patterns.behavioral_patterns.command.document_ex.commands;

import challenge.design_patterns.behavioral_patterns.command.document_ex.Application;
import challenge.design_patterns.behavioral_patterns.command.document_ex.Document;

public class OpenCommand implements Command {
	private Application application;
	
	public OpenCommand(Application application) {
		this.application = application;
	}
	
	@Override
	public void execute() {
		String name = this.askUser();
		Document doc = new Document(name);
		this.application.add(doc);
		doc.open();
	}
	
	private String askUser() {
		return "name from user";
	}
}
