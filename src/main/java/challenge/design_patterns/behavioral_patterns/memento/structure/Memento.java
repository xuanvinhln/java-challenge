package challenge.design_patterns.behavioral_patterns.memento.structure;

public class Memento {
	private int state;

	public Memento(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
