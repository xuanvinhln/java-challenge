package challenge.design_patterns.behavioral_patterns.state.vending_machine_ex;

public class NoCandyState implements CandyVendingMachineState{
    CandyVendingMachine machine;
    public NoCandyState(CandyVendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
     System.out.println("No candies available");
    }
    @Override
    public void pressButton() {
        System.out.println("No candies available");
    }
    @Override
    public void dispense() {
        System.out.println("No candies available");
    }
    @Override
    public String toString(){
        return "NoCandyState";
    }
}
