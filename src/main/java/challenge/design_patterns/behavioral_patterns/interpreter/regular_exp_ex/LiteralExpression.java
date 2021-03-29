package challenge.design_patterns.behavioral_patterns.interpreter.regular_exp_ex;

public class LiteralExpression implements RegularExpression {
	private String literal;
	
	@Override
	public void interpret() {
		System.out.println(literal);
	}

}
