package challenge.design_patterns.behavioral_patterns.visitor.structure;

public class ConcreteVisitor2 implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		elementA.operationA();
		System.out.println("ConcreteVisitor2 visitConcreteElementA on " + elementA);
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
		elementB.operationB();
		System.out.println("ConcreteVisitor2 visitConcreteElementB on " + elementB);
	}

}
