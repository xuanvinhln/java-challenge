package challenge.design_patterns.behavioral_patterns.observer.structure;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int subjectState;

	public int getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(int subjectState) {
		this.subjectState = subjectState;
		this.doNotify();
	}

	@Override
	public void attach(Observer observer) {
		if (!observers.contains(observer)) {
			this.observers.add(observer);
		}
	}

	@Override
	public void detach(Observer observer) {
		if (observers.contains(observer)) {
			this.observers.remove(observer);
		}
	}

	@Override
	public void doNotify() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
