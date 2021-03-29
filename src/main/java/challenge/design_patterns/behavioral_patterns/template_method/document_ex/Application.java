package challenge.design_patterns.behavioral_patterns.template_method.document_ex;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {
	private List<Document> docs = new ArrayList<Document>();

	public void addDocument(Document doc) {
		this.docs.add(doc);
	}

	public final void openDocument() {
		if (!canOpenDocument()) {
			System.out.println("Cannot handle this document");
			return;
		}

		Document doc = doCreateDocument();

		if (doc != null) {
			docs.add(doc);
			aboutToOpenDocument(doc);
			doc.open();
			doc.doRead();
		}
	}

	protected abstract Document doCreateDocument();

	protected abstract boolean canOpenDocument();

	protected abstract void aboutToOpenDocument(Document doc);
}
