package challenge.design_patterns.behavioral_patterns.state.vending_machine_ex;

public interface CandyVendingMachineState {
	void insertCoin();

	void pressButton();

	void dispense();
}