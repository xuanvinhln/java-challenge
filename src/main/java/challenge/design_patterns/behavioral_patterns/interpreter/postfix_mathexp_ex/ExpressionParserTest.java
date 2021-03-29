package challenge.design_patterns.behavioral_patterns.interpreter.postfix_mathexp_ex;

public class ExpressionParserTest {
	/*
	 * AbstractExpression (Expression): Declares an interpret() operation that all
	 * nodes (terminal and nonterminal) in the AST overrides.
	 * 
	 * TerminalExpression (NumberExpression): Implements the interpret() operation
	 * for terminal expressions.
	 * 
	 * NonterminalExpression (AdditionExpression, SubtractionExpression, and
	 * MultiplicationExpression): Implementoperations the interpret() operation for
	 * all nonterminal expressions.
	 * 
	 * Context (String): Contains information that is global to the interpreter. It
	 * is this String expression with the Postfix notation that has to be
	 * interpreted and parsed.
	 * 
	 * Client (ExpressionParser): Builds (or is provided) the AST assembled from
	 * TerminalExpression and NonTerminalExpression. The Client invokes the
	 * interpret() operation.
	 * 
	 * Abstract Syntax Tree, which we will refer as AST.
	 */

	public static void main(String[] args) {
		String input = "2 1 5 + *";
		ExpressionParser expressionParser = new ExpressionParser();

		int result = expressionParser.parse(input);
		System.out.println("Final result: " + result);
	}
}