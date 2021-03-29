package challenge.design_patterns.behavioral_patterns.strategy.structure;

import challenge.design_patterns.behavioral_patterns.strategy.structure.context.Context;
import challenge.design_patterns.behavioral_patterns.strategy.structure.strategy.ConcreteStratergyA;
import challenge.design_patterns.behavioral_patterns.strategy.structure.strategy.ConcreteStratergyB;
import challenge.design_patterns.behavioral_patterns.strategy.structure.strategy.Strategy;

public class Client {
	public static void main(String[] args) {
		Strategy a = new ConcreteStratergyA();
		Strategy b = new ConcreteStratergyB();

		Context context = new Context(a);
		context.contextInterface();

		context.setStrategy(b);
		context.contextInterface();
	}
}
