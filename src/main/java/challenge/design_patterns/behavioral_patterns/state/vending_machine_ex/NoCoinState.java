package challenge.design_patterns.behavioral_patterns.state.vending_machine_ex;

public class NoCoinState implements CandyVendingMachineState {
	CandyVendingMachine machine;

	public NoCoinState(CandyVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		machine.setState(machine.getContainsCoinState());
	}

	@Override
	public void pressButton() {
		System.out.println("No coin inserted");
	}

	@Override
	public void dispense() {
		System.out.println("No coin inserted");
	}

	@Override
	public String toString() {
		return "NoCoinState";
	}
}