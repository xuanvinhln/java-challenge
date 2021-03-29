package challenge.design_patterns.behavioral_patterns.template_method.document_ex;

public class MyApplication extends Application {

	@Override
	protected Document doCreateDocument() {
		return new MyDocument();
	}

	@Override
	protected boolean canOpenDocument() {
		return true;
	}

	@Override
	protected void aboutToOpenDocument(Document doc) {
		System.out.println(MyDocument.class.getName());
	}
}
