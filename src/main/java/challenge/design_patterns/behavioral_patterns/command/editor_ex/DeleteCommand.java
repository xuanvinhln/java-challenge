package challenge.design_patterns.behavioral_patterns.command.editor_ex;

public class DeleteCommand implements Command {
	private Document document;
	private int position;
	private String textDeleted;
	
	public DeleteCommand(Document document, int position) {
		this.document = document;
        this.position = position;
	}

	@Override
	public void execute() {
		this.textDeleted = this.document.getWord(position);
		this.document.delete(position);
	}

	@Override
	public void unExecute() {
		this.document.write(textDeleted, position);
	}
}
