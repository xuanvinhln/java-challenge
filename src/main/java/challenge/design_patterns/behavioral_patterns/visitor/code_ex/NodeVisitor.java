package challenge.design_patterns.behavioral_patterns.visitor.code_ex;

public interface NodeVisitor {
	void visit(AssignmentNode node);
	void visit(VariableRefNode node);
}
