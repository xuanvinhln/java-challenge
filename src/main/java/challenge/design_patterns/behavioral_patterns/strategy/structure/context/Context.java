package challenge.design_patterns.behavioral_patterns.strategy.structure.context;

import challenge.design_patterns.behavioral_patterns.strategy.structure.strategy.Strategy;

public class Context {
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void contextInterface() {
		this.strategy.algorithmInterface();
	}
}
