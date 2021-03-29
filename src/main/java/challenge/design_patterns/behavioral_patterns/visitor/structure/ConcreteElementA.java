package challenge.design_patterns.behavioral_patterns.visitor.structure;

public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	public void operationA() {

	};
}
