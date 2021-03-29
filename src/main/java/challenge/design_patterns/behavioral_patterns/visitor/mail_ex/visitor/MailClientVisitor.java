package challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor;

import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.OperaMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.SquirrelMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.ZimbraMailClient;

public interface MailClientVisitor {

	void visit(OperaMailClient operaMailClient);

	void visit(SquirrelMailClient squirrelMailClient);

	void visit(ZimbraMailClient zimbraMailClient);

}
