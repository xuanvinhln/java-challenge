package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.help_ex;

public abstract class HelpHandler {
	protected HelpHandler handler;

	public void handleHelp(String request) {
		if (this.handler != null) {
			this.handler.handleHelp(request);
		}
	}

	public void setHandler(HelpHandler handler) {
		this.handler = handler;
	}
}
