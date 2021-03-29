package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.approver_ex.LeaveRequest;

public abstract class Approver {
	protected Approver nextApprover;

	public Approver setNext(Approver nextApprover) {
		this.nextApprover = nextApprover;
		return nextApprover;
	}

	public void approveLeave(LeaveRequest request) {
		System.out.println("Checking permission for " + this.getClass().getSimpleName());

		if (this.canApprove(request.getDays())) {
			this.doApproving(request);
		} else if (nextApprover != null) {
			nextApprover.approveLeave(request);
		}
	}

	protected abstract boolean canApprove(int numberOfDays);

	protected abstract void doApproving(LeaveRequest request);
}
