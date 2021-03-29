package challenge.design_patterns.behavioral_patterns.state.document_ex;

public class DocumentContext {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void applyState() {
		this.state.handleRequest();
	}
}
