package challenge.design_patterns.creational_patterns.factory_method.document_ex.creator;

import java.util.ArrayList;
import java.util.List;

import challenge.design_patterns.creational_patterns.factory_method.document_ex.product.Document;

public abstract class Application {
	public List<Document> docs = new ArrayList<Document>();

	public abstract Document createDocument();

	public void newDocument() {
		Document doc = createDocument();
		docs.add(doc);
		doc.Open();
	}

	public void OpenDocument() {
		Document doc = docs.get(docs.size() - 1);
		doc.Open();
	}
}
