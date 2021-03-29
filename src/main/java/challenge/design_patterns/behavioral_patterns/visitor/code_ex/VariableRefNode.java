package challenge.design_patterns.behavioral_patterns.visitor.code_ex;

public class VariableRefNode implements Node {

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}
}
