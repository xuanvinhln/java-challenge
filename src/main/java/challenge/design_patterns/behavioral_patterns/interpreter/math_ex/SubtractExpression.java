package challenge.design_patterns.behavioral_patterns.interpreter.math_ex;

public class SubtractExpression implements Expression {
	private String expression;

	public SubtractExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngineContext context) {
		return context.subtract(expression);
	}
}
