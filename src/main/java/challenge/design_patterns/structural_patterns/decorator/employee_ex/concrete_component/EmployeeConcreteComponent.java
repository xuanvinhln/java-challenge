package challenge.design_patterns.structural_patterns.decorator.employee_ex.concrete_component;

import java.util.Date;

import challenge.design_patterns.structural_patterns.decorator.employee_ex.component.EmployeeComponent;

public class EmployeeConcreteComponent implements EmployeeComponent {
	private String name;

	public EmployeeConcreteComponent(String name) {
		this.name = name;
	}

	@Override
	public void doTask() {
		System.out.println(this.getName() + " doTask");
	}

	@Override
	public void join(Date joinDate) {
		System.out.println(this.getName() + " joined on " + formatDate(joinDate));
	}

	@Override
	public void terminate(Date terminateDate) {
		System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
	}

	@Override
	public String getName() {
		return this.name;
	}
}
