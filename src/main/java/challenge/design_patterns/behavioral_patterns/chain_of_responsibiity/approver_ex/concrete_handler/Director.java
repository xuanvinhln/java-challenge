package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.LeaveRequest;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.handler.Approver;

public class Director extends Approver {
	@Override
	protected boolean canApprove(int numberOfDays) {
		return numberOfDays > 5;
	}

	@Override
	protected void doApproving(LeaveRequest request) {
		System.out.println("Leave request approved for " + request.getDays() + " days by Director");
	}
}
