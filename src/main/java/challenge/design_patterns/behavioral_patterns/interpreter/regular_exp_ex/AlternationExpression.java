package challenge.design_patterns.behavioral_patterns.interpreter.regular_exp_ex;

public class AlternationExpression implements RegularExpression {
	private RegularExpression alternative1;
	private RegularExpression alternative2;

	public AlternationExpression(RegularExpression alternative1, RegularExpression alternative2) {
		this.alternative1 = alternative1;
		this.alternative2 = alternative2;
	}

	@Override
	public void interpret() {
		System.out.println(alternative1 + " | " + alternative2);
	}

}
