package challenge.design_patterns.behavioral_patterns.command.editor_ex;

import java.util.ArrayList;
import java.util.List;

public class DocumentInvoker {
	private List<Command> historyList;
	private int currentIndex;
	private Document document;

	public DocumentInvoker(Document document) {
		this.historyList = new ArrayList<Command>();
		this.currentIndex = 0;
		this.document = document;
	}

	public void undo() {
		System.out.println(DocumentInvoker.class.getSimpleName() + " undo");

		if (!historyList.isEmpty() && (this.currentIndex - 1) >= 0) {
			Command cmd = historyList.get(this.currentIndex - 1);
			cmd.unExecute();

			this.currentIndex--;
		} else {
			System.out.println("Nothing to undo");
		}
	}

	public void redo() {
		System.out.println(DocumentInvoker.class.getSimpleName() + " redo");

		if (!historyList.isEmpty() && currentIndex < historyList.size()) {
			Command cmd = historyList.get(this.currentIndex);
			cmd.execute();

			this.currentIndex++;
		} else {
			System.out.println("Nothing to redo");
		}
	}

	public void delete(int position) {
		Command cmd = new DeleteCommand(document, position);
		cmd.execute();

		this.historyList.add(cmd);
		this.currentIndex++;
	}

	public void write(String text, int position) {
		Command cmd = new WriteCommand(document, text, position);
		cmd.execute();

		this.historyList.add(cmd);
		this.currentIndex++;
	}

	public void read() {
		Command cmd = new ReadCommand(document);
		cmd.execute();
	}

	public List<Command> getHistoryList() {
		return historyList;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}
}
