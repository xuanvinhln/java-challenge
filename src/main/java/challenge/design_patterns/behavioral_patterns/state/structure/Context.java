package challenge.design_patterns.behavioral_patterns.state.structure;

import challenge.design_patterns.behavioral_patterns.state.structure.state.State;

public class Context {
	private State state;

	public void request() {
		this.state.handler();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
