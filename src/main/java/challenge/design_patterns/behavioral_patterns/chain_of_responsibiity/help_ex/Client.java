package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.help_ex;

public class Client {
	public static void main(String[] args) {
		HelpHandler helpHandler = new Dialog();
		helpHandler.setHandler(new Button());
		
		helpHandler.handleHelp(Button.class.getSimpleName());
	}
}
