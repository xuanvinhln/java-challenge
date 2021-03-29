package challenge.design_patterns.behavioral_patterns.template_method.document_ex;

public class Client {
	public static void main(String[] args) {
		Application app = new MyApplication();
		app.openDocument();
	}
}
