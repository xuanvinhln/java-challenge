package challenge.design_patterns.behavioral_patterns.interpreter.postfix_mathexp_ex;

public class NumberExpression implements Expression {
	private int number;

	public NumberExpression(int number) {
		this.number = number;
	}

	public NumberExpression(String number) {
		this.number = Integer.parseInt(number);
	}

	@Override
	public int interpret() {
		return this.number;
	}
}
