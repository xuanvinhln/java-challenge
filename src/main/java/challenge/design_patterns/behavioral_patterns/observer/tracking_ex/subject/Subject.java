package challenge.design_patterns.behavioral_patterns.observer.tracking_ex.subject;

import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers.Observer;

public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();
}
