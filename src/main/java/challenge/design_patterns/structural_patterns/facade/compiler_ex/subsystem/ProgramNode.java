package challenge.design_patterns.structural_patterns.facade.compiler_ex.subsystem;

public abstract class ProgramNode {
	private Token token;
	private Symbol symbol;

	public ProgramNode(Token token, Symbol symbol) {
		this.token = token;
		this.symbol = symbol;
	}

	public void show() {
		System.out.println(token + " " + symbol);
	}
}
