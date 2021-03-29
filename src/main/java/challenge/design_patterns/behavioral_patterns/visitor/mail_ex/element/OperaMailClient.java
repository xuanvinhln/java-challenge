package challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element;

import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor.MailClientVisitor;

public class OperaMailClient implements MailClient {
	@Override
	public void sendMail(String[] mailInfo) {
		System.out.println(" OperaMailClient: Sending mail");
	}

	@Override
	public void receiveMail(String[] mailInfo) {
		System.out.println(" OperaMailClient: Receiving mail");
	}

	@Override
	public boolean accept(MailClientVisitor visitor) {
		visitor.visit(this);
		return true;
	}
}