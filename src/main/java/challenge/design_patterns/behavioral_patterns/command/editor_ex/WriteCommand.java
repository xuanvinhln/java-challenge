package challenge.design_patterns.behavioral_patterns.command.editor_ex;

public class WriteCommand implements Command {
	private Document document;
	private String text;
	private int position;

	public WriteCommand(Document document, String text, int position) {
		this.document = document;
		this.text = text;
		this.position = position;
	}

	@Override
	public void execute() {
		this.document.write(text, position);
	}

	@Override
	public void unExecute() {
		this.document.delete(position);
	}
}
