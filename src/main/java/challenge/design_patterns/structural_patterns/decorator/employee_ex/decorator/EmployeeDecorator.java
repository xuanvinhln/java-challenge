package challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator;

import java.util.Date;

import challenge.design_patterns.structural_patterns.decorator.employee_ex.component.EmployeeComponent;

public abstract class EmployeeDecorator implements EmployeeComponent {
	protected EmployeeComponent employeeComponent;

	protected EmployeeDecorator(EmployeeComponent employeeComponent) {
		this.employeeComponent = employeeComponent;
	}

	public EmployeeComponent getEmployeeComponent() {
		return employeeComponent;
	}

	@Override
	public void doTask() {
		this.employeeComponent.doTask();
	}

	@Override
	public void join(Date joinDate) {
		this.employeeComponent.join(joinDate);
	}

	@Override
	public void terminate(Date terminateDate) {
		this.employeeComponent.terminate(terminateDate);
	}

	@Override
	public String getName() {
		return this.employeeComponent.getName();
	}
}
