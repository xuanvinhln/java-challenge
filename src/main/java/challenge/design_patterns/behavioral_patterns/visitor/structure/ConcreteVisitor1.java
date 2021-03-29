package challenge.design_patterns.behavioral_patterns.visitor.structure;

public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		elementA.operationA();
		System.out.println("ConcreteVisitor1 visitConcreteElementA on " + elementA);
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
		elementB.operationB();
		System.out.println("ConcreteVisitor1 visitConcreteElementB on " + elementB);
	}

}
