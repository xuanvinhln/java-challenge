package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure.handler.Handler;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(String param) {
		if (param.equals(ConcreteHandler1.class.getSimpleName())) {
			System.out.println("ConcreteHandler1 handleRequest");
		} else {
			if (super.successor != null) {
				this.successor.handleRequest(param);
			}
		}
	}
}
