package challenge.design_patterns.creational_patterns.prototype.computer_ex;

public class Client {
	public static void main(String[] args) {
		DellComputer computer1 = new DellComputer("Window 10", "Word 2013", "BKAV", "Chrome v69");
		DellComputer computer2 = (DellComputer) computer1.clone();
		computer2.setOthers("Skype, Teamviewer, FileZilla Client");

		System.out.println(computer1);
		System.out.println(computer2);
	}
}
