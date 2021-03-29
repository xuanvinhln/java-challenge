package challenge.design_patterns.behavioral_patterns.interpreter.regular_exp_ex;

public class RepetitionExpression implements RegularExpression {
	private RegularExpression repettition;

	public RepetitionExpression(RegularExpression repettition) {
		this.repettition = repettition;
	}

	@Override
	public void interpret() {
		System.out.println(repettition + " * ");
	}
}
