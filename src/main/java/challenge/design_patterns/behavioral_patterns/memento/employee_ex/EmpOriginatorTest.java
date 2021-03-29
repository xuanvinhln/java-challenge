package challenge.design_patterns.behavioral_patterns.memento.employee_ex;

/*
 * Originator (EmpOriginator): Is a class the state of whose object needs to be saved. It creates a Memento
 *  containing a snapshot of its current state. Originator uses the Memento to restore back its state.
 * 
 * Memento (EmpMemento): Is a class whose objects stores states of the Originator.
 *  Memento denies other objects access to itself except the Originator.
 * 
 * Caretaker (EmpCaretaker): Manages and safeguards Memento.
 */

public class EmpOriginatorTest {
	public static void main(String[] args) {
		EmpCaretaker empCaretaker = new EmpCaretaker();

		EmpOriginator empOriginator = new EmpOriginator(306, "Mark Ferguson", "131011789610", "Sales Manager");
		EmpMemento empMemento = empOriginator.saveToMemento();
		empCaretaker.addMemento(empMemento);

		System.out.println("\n Original EmpOriginator");
		empOriginator.printInfo();

		System.out.println("\n EmpOriginator after updating phone number");
		empOriginator.setEmpPhoneNo("131011888886");
		empMemento = empOriginator.saveToMemento();
		empCaretaker.addMemento(empMemento);
		empOriginator.printInfo();

		System.out.println("\n EmpOriginator after updating designation");
		empOriginator.setEmpDesignation("Senior Sales Manager");
		empMemento = empOriginator.saveToMemento();
		empCaretaker.addMemento(empMemento);
		empOriginator.printInfo();

		System.out.println("\n EmpOriginator after undoing designation update");
		empMemento = empCaretaker.getMemento();
		empOriginator.undoFromMemento(empMemento);
		empMemento = empCaretaker.getMemento();
		empOriginator.undoFromMemento(empMemento);
		empOriginator.printInfo();

		System.out.println("\n Original EmpOriginator after undoing phone number update");
		empMemento = empCaretaker.getMemento();
		empOriginator.undoFromMemento(empMemento);
		empOriginator.printInfo();
	}
}