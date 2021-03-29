package challenge.design_patterns.behavioral_patterns.state.document_ex;

public class NewState implements State {
	@Override
	public void handleRequest() {
		System.out.println("Create a new document");
	}
}
