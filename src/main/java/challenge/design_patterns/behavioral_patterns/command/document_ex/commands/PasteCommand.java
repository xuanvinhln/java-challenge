package challenge.design_patterns.behavioral_patterns.command.document_ex.commands;

import challenge.design_patterns.behavioral_patterns.command.document_ex.Document;

public class PasteCommand implements Command {
	private Document document;
	
	public PasteCommand(Document document) {
		this.document = document;
	}
	
	@Override
	public void execute() {
		this.document.paste();
	}
}
