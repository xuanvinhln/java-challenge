package challenge.design_patterns.behavioral_patterns.visitor.code_ex;

public class CodeGeneratingVisitor implements NodeVisitor {

	@Override
	public void visit(AssignmentNode node) {
		System.out.println("CodeGeneratingVisitor visit AssignmentNode");
	}

	@Override
	public void visit(VariableRefNode node) {
		System.out.println("CodeGeneratingVisitor visit VariableRefNode");
	}
}
