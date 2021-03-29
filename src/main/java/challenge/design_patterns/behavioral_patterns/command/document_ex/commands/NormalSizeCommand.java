package challenge.design_patterns.behavioral_patterns.command.document_ex.commands;

import challenge.design_patterns.behavioral_patterns.command.document_ex.Document;

public class NormalSizeCommand implements Command {
	private Document document;
	
	public NormalSizeCommand(Document document) {
		this.document = document;
	}
	
	@Override
	public void execute() {
		System.out.println(NormalSizeCommand.class.getSimpleName() + " on " + document);
	}
}
