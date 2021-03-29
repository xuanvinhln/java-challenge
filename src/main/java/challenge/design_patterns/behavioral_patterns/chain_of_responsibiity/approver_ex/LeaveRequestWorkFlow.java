package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.concrete_handler.DeliveryManager;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.concrete_handler.Director;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.concrete_handler.Supervisor;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.handler.Approver;

public class LeaveRequestWorkFlow {
	public static Approver getApprover() {
		Approver supervisor = new Supervisor();
		Approver manager = new DeliveryManager();
		Approver director = new Director();

		supervisor.setNext(manager);
		manager.setNext(director);
		return supervisor;
	}
}
