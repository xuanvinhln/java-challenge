package challenge.design_patterns.structural_patterns.facade.compiler_ex.subsystem;

public class ProgramNodeBuilder {
	public ProgramNode build(String type) {
		System.out.println("ProgramNode build");

		Token token = new Token();
		Symbol symbol = new Symbol();

		if (type.equals("statement")) {
			return new StatementNode(token, symbol);
		}

		if (type.equals("expresstion")) {
			return new ExpressionNode(token, symbol);
		}

		if (type.equals("variable")) {
			return new VariableNode(token, symbol);
		}

		return null;
	}
}
