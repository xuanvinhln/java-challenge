package challenge.design_patterns.behavioral_patterns.observer.structure;

public class ConcreteObserver implements Observer {
	private int observerState;

	@Override
	public void update(ConcreteSubject concreteSubject) {
		this.observerState = concreteSubject.getSubjectState();
		System.out.println("ConcreteObserver update " + observerState);
	}
}
