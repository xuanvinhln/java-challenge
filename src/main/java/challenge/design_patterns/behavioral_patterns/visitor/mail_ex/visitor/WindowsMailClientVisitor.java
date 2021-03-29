package challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor;

import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.OperaMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.SquirrelMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.ZimbraMailClient;

public class WindowsMailClientVisitor implements MailClientVisitor {
	@Override
	public void visit(OperaMailClient mailClient) {
		System.out.println("Configuration of Opera mail client for Windows complete");
	}

	@Override
	public void visit(SquirrelMailClient mailClient) {
		System.out.println("Configuration of Squirrel mail client for Windows complete");
	}

	@Override
	public void visit(ZimbraMailClient mailClient) {
		System.out.println("Configuration of Zimbra mail client for Windows complete");
	}
}