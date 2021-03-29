package challenge.design_patterns.behavioral_patterns.interpreter.regular_exp_ex;

public class SequenceExpression implements RegularExpression {
	private RegularExpression expression1;
	private RegularExpression expression2;

	public SequenceExpression(RegularExpression expression1, RegularExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public void interpret() {
		System.out.println(expression1 + " && " + expression2);
	}
}
