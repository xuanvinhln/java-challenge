package challenge.design_patterns.behavioral_patterns.memento.object_ex;

import java.util.ArrayList;
import java.util.List;

import challenge.design_patterns.behavioral_patterns.memento.object_ex.Originator.Memento;

public class CareTaker {
	private List<Memento> mementos = new ArrayList<Memento>();

	public void addMemonto(Memento memento) {
		this.mementos.add(memento);
	}

	public Memento getMemento(int index) {
		return this.mementos.get(index);
	}
}
