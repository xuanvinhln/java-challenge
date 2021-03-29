package challenge.design_patterns.behavioral_patterns.visitor.mail_ex;

import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.OperaMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.SquirrelMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.element.ZimbraMailClient;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor.LinuxMailClientVisitor;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor.MacMailClientVisitor;
import challenge.design_patterns.behavioral_patterns.visitor.mail_ex.visitor.WindowsMailClientVisitor;

/*
 * Element (MailClient): Is an interface that contains accept() method that takes a visitor as an argument.
 * ConcreteElement (OperaMailClient, SquirrelMailClient, and ZimbraMailClient): Implements the accept() method declared in Element.
 * Visitor (MailClientVisitor): Is an interface that declares a visit() method for each class of ConcreteElement in the object structure.
 * ConcreteVisitor (MacMailClientVisitor, WindowsMailClientVisitor, and LinuxMailClientVisitor): Are the concrete classes that implements each method declared by Visitor.
 */
public class MailClientVisitorTest {
	private MacMailClientVisitor macVisitor;
	private LinuxMailClientVisitor linuxVisitor;
	private WindowsMailClientVisitor windowsVisitor;
	private OperaMailClient operaMailClient;
	private SquirrelMailClient squirrelMailClient;
	private ZimbraMailClient zimbraMailClient;

	public void setup() {
		macVisitor = new MacMailClientVisitor();
		linuxVisitor = new LinuxMailClientVisitor();
		windowsVisitor = new WindowsMailClientVisitor();
		operaMailClient = new OperaMailClient();
		squirrelMailClient = new SquirrelMailClient();
		zimbraMailClient = new ZimbraMailClient();
	}

	public void testOperaMailClient() throws Exception {
		System.out.println("-----Testing Opera Mail Client for different environments-----");
		System.out.println(operaMailClient.accept(macVisitor));
		System.out.println(operaMailClient.accept(linuxVisitor));
		System.out.println(operaMailClient.accept(windowsVisitor));
	}

	public void testSquirrelMailClient() throws Exception {
		System.out.println("\n-----Testing Squirrel Mail Client for different environments-----");
		System.out.println(squirrelMailClient.accept(macVisitor));
		System.out.println(squirrelMailClient.accept(linuxVisitor));
		System.out.println(squirrelMailClient.accept(windowsVisitor));
	}

	public void testZimbraMailClient() throws Exception {
		System.out.println("\n-----Testing Zimbra Mail Client for different environments-----");
		System.out.println(zimbraMailClient.accept(macVisitor));
		System.out.println(zimbraMailClient.accept(linuxVisitor));
		System.out.println(zimbraMailClient.accept(windowsVisitor));
	}

	public static void main(String[] args) {
		MailClientVisitorTest test = new MailClientVisitorTest();
		test.setup();
		try {
			test.testOperaMailClient();
			test.testSquirrelMailClient();
			test.testZimbraMailClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}