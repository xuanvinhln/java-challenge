package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.handler.Approver;

public class Client {
	public static void main(String[] args) {
		Approver approver = LeaveRequestWorkFlow.getApprover();
		
		approver.approveLeave(new LeaveRequest(2));
		
		System.out.println("---");
		approver.approveLeave(new LeaveRequest(5));
		
		System.out.println("---");
		approver.approveLeave(new LeaveRequest(7));
	}
}
