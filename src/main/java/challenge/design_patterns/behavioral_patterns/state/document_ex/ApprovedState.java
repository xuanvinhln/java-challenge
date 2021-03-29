package challenge.design_patterns.behavioral_patterns.state.document_ex;

public class ApprovedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Approved");
	}
}
