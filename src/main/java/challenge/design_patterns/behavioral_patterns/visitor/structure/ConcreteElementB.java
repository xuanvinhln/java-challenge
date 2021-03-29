package challenge.design_patterns.behavioral_patterns.visitor.structure;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	public void operationB() {

	};
}
