package challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element;

import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor.MailClientVisitor;

public interface MailClient {
	void sendMail(String[] mailInfo);

	void receiveMail(String[] mailInfo);

	boolean accept(MailClientVisitor visitor);
}
