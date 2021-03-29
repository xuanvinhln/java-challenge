package challenge.design_patterns.creational_patterns.factory_method.document_ex.creator;

import challenge.design_patterns.creational_patterns.factory_method.document_ex.product.Document;
import challenge.design_patterns.creational_patterns.factory_method.document_ex.product.MyDocument;

public class MyApplication extends Application {
	@Override
	public Document createDocument() {
		return new MyDocument();
	}
}
