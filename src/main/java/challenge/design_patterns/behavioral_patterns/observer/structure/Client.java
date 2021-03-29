package challenge.design_patterns.behavioral_patterns.observer.structure;

public class Client {
	public static void main(String[] args) {
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();

		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(observer1);
		subject.attach(observer2);

		subject.setSubjectState(1);
	}
}
