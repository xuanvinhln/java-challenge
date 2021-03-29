package challenge.design_patterns.behavioral_patterns.visitor.code_ex;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Program program = new Program();
		program.addNode(new AssignmentNode());
		program.addNode(new VariableRefNode());
		NodeVisitor typeCheckingVisitor = new TypeCheckingVisitor();
		NodeVisitor codeGeneratingVisitor = new CodeGeneratingVisitor();

		List<Node> nodes = program.getNodes();
		for (Node e : nodes) {
			e.accept(typeCheckingVisitor);
			e.accept(codeGeneratingVisitor);
		}
	}
}
