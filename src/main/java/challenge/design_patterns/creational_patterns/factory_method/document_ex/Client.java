package challenge.design_patterns.creational_patterns.factory_method.document_ex;

import challenge.design_patterns.creational_patterns.factory_method.document_ex.creator.MyApplication;

public class Client {
	public static void main(String[] args) {
		MyApplication myApplication = new MyApplication();
		myApplication.newDocument();
	}
}
 