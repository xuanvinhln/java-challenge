package challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator;

import challenge.design_patterns.structural_patterns.decorator.employee_ex.component.EmployeeComponent;

public class TeamLeader extends EmployeeDecorator {
	public TeamLeader(EmployeeComponent employeeComponent) {
		super(employeeComponent);
	}
	
	public void planing() {
        System.out.println(super.employeeComponent.getName() + " is planing.");
    }
 
    public void motivate() {
        System.out.println(super.employeeComponent.getName() + " is motivating his members.");
    }
 
    public void monitor() {
        System.out.println(super.employeeComponent.getName() + " is monitoring his members.");
    }
 
    @Override
    public void doTask() {
    	super.employeeComponent.doTask();
        planing();
        motivate();
        monitor();
    }
}
