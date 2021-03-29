package challenge.design_patterns.behavioral_patterns.command.editor_ex;

public class ReadCommand implements Command {
	private Document document;

	public ReadCommand(Document document) {
		this.document = document;
	}
	
	@Override
	public void execute() {
		this.document.readDocument();
	}

	@Override
	public void unExecute() {
		System.out.println(ReadCommand.class.getSimpleName() + " do nothing");
	}
}
