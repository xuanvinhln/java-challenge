package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure.concrete_handler.ConcreteHandler1;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure.concrete_handler.ConcreteHandler2;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.structure.handler.Handler;

public class Client {
	public static void main(String[] args) {
		Handler handler = new ConcreteHandler1();
		handler.setSuccessor(new ConcreteHandler2());
		
		handler.handleRequest(ConcreteHandler1.class.getSimpleName());
		handler.handleRequest(ConcreteHandler2.class.getSimpleName());
	}
	
}
