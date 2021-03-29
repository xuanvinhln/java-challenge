package challenge.design_patterns.behavioral_patterns.interpreter.math_ex;

public class AddExpression implements Expression {
	private String expression;

	public AddExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngineContext context) {
		return context.add(expression);
	}
}
