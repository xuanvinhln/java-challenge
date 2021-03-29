package challenge.design_patterns.behavioral_patterns.command.document_ex.commands;

import challenge.design_patterns.behavioral_patterns.command.document_ex.Document;

public class CenterCommand implements Command {
	private Document document;

	public CenterCommand(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		System.out.println(CenterCommand.class.getSimpleName() + " on " + document);
	}
}
