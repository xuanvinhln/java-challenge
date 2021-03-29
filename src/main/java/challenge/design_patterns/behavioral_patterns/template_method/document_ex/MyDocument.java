package challenge.design_patterns.behavioral_patterns.template_method.document_ex;

public class MyDocument extends Document {

	@Override
	public void doRead() {
		System.out.println("MyDocument doRead");
	}
}
