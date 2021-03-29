package challenge.design_patterns.behavioral_patterns.memento.structure;

public class Originator {
	private int state;

	public void setMemento(Memento m) {
		this.state = m.getState();
	}

	public void setState(int state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}

	public void showState() {
		System.out.println(this.state);
	}
}
