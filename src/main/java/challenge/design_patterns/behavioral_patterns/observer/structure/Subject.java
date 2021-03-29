package challenge.design_patterns.behavioral_patterns.observer.structure;

public interface Subject {
	public void attach(Observer observer);

	public void detach(Observer observer);

	public void doNotify();
}
