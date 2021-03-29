package challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.employee_ex.component.EmployeeComponent;

public class Manager extends EmployeeDecorator {
	public Manager(EmployeeComponent employeeComponent) {
		super(employeeComponent);
	}
	
	public void createRequirement() {
        System.out.println(super.employeeComponent.getName() + " is create requirements.");
    }
 
    public void assignTask() {
        System.out.println(super.employeeComponent.getName() + " is assigning tasks.");
    }
 
    public void manageProgress() {
        System.out.println(super.employeeComponent.getName() + " is managing the progress.");
    }
 
    @Override
    public void doTask() {
    	super.employeeComponent.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
