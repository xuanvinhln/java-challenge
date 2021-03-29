package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.help_ex;

public class Button extends Widget {

	@Override
	public void handleHelp(String request) {
		if (request.equals(Button.class.getSimpleName())) {
			System.out.println("Button handleHelp");
			this.showHelp();
		} else {
			super.handleHelp(request);
		}
	}

	private void showHelp() {
		System.out.println("Button showHelp");
	}
}
