package challenge.design_patterns.behavioral_patterns.memento.structure;

public class Client {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();

		Originator originator = new Originator();
		caretaker.add(originator.createMemento());

		originator.setState(3);
		caretaker.add(originator.createMemento());
		
		originator.setMemento(caretaker.get(0));
		originator.showState();
	}
}
