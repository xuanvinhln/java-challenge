package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure.handler;

public abstract class Handler {

	protected Handler successor;

	public Handler() {

	}

	public Handler setSuccessor(Handler successor) {
		this.successor = successor;
		return successor;
	}

	public abstract void handleRequest(String param);
}
