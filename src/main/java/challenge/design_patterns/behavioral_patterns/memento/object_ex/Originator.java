package challenge.design_patterns.behavioral_patterns.memento.object_ex;

public class Originator {
	private String state;

	public void set(String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento();
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getSavedState();
		System.out.println("Originator: State after restoring from Memento: " + state);
	}

	class Memento {
		private final String state;

		public Memento() {
			state = Originator.this.state;
		}

		public String getSavedState() {
			return state;
		}
	}
}
