package challenge.design_patterns.behavioral_patterns.memento.structure;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private List<Memento> mementos = new ArrayList<Memento>();

	public void add(Memento memento) {
		this.mementos.add(memento);
	}

	public Memento get(int index) {
		return this.mementos.get(index);
	}
}
