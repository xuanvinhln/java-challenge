package challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.employee_ex.component.EmployeeComponent;

public class TeamMember extends EmployeeDecorator {
	public TeamMember(EmployeeComponent employeeComponent) {
		super(employeeComponent);
	}

	public void reportTask() {
		System.out.println(super.employeeComponent.getName() + " is reporting his assigned tasks.");
	}

	public void coordinateWithOthers() {
		System.out.println(super.employeeComponent.getName() + " is coordinating with other members of his team.");
	}

	@Override
	public void doTask() {
		super.employeeComponent.doTask();
		reportTask();
		coordinateWithOthers();
	}
}
