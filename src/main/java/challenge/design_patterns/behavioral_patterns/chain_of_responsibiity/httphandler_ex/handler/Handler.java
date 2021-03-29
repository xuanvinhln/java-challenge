package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.Request;

public abstract class Handler {
	private Handler nextHandler;
	protected String apiEndPoint;

	public Handler(String apiEndPoint) {
		this.apiEndPoint = apiEndPoint;
	}

	public void handle(Request request) {
		if (this.handerImp(request)) {
			return;
		} else if (nextHandler != null) {
			nextHandler.handle(request);
		}
	}

	protected abstract boolean handerImp(Request request);

	public Handler addHandler(Handler newHandler) {
		System.out.println("addHandler " + newHandler.getApiEndPoint());

		Handler current = this;
		while (current.getNextHandler() != null) {
			current = current.getNextHandler();
		}
		current.setNextHandler(newHandler);

		return this;
	}

	public String getApiEndPoint() {
		return apiEndPoint;
	}

	public void setApiEndPoint(String apiEndPoint) {
		this.apiEndPoint = apiEndPoint;
	}

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
