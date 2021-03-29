package challenge.design_patterns.behavioral_patterns.memento.employee_ex;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCaretaker {
	final Deque<EmpMemento> mementos = new ArrayDeque<>();

	public EmpMemento getMemento() {
		EmpMemento empMemento = mementos.pop();
		return empMemento;
	}

	public void addMemento(EmpMemento memento) {
		mementos.push(memento);
	}
}