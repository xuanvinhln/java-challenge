package challenge.design_patterns.behavioral_patterns.state.structure;

import challenge.design_patterns.behavioral_patterns.state.structure.state.ConcreteStateA;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteStateA());
		context.request();
	}
}
