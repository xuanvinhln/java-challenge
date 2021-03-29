package challenge.design_patterns.behavioral_patterns.memento.object_ex;

class MementoExample {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();

		Originator originator = new Originator();
		originator.set("State #1");
		originator.set("State #2");
		careTaker.addMemonto(originator.saveToMemento());
		originator.set("State #3");
		careTaker.addMemonto(originator.saveToMemento());
		originator.set("State #4");

		originator.restoreFromMemento(careTaker.getMemento(0)); // This point need roll back
	}
}