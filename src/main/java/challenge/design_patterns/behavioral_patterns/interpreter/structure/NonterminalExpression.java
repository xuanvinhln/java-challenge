package challenge.design_patterns.behavioral_patterns.interpreter.structure;

import java.util.List;

public class NonterminalExpression implements AbstractExpression {
	private List<AbstractExpression> list;

	@Override
	public void interpret(Context context) {
		for (AbstractExpression e : list) {
			e.interpret(context);
		}
	}
}
