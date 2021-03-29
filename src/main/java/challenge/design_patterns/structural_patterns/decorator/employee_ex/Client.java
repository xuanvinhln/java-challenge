package challenge.design_patterns.structural_patterns.decorator.employee_ex;

import challenge.design_patterns.structural_patterns.decorator.employee_ex.component.EmployeeComponent;
import challenge.design_patterns.structural_patterns.decorator.employee_ex.concrete_component.EmployeeConcreteComponent;
import challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator.EmployeeDecorator;
import challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator.Manager;
import challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator.TeamLeader;
import challenge.design_patterns.structural_patterns.decorator.employee_ex.decorator.TeamMember;

public class Client {
	public static void main(String[] args) {
		System.out.println("NORMAL EMPLOYEE: ");
		EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
		employee.showBasicInformation();
		employee.doTask();

		System.out.println("\nTEAM MEMBER: ");
		EmployeeComponent teamMember = new TeamMember(employee);
		teamMember.showBasicInformation();
		teamMember.doTask();
		
		System.out.println("\nTEAM LEADER: ");
		EmployeeComponent teamLeader = new TeamLeader(employee);
		teamLeader.showBasicInformation();
		teamLeader.doTask();

		System.out.println("\nMANAGER: ");
		EmployeeComponent manager = new Manager(employee);
		manager.showBasicInformation();
		manager.doTask();

		System.out.println("\nTEAM LEADER AND MANAGER: ");
		EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
		teamLeaderAndManager.showBasicInformation();
		teamLeaderAndManager.doTask();
		
		System.out.println("\nTEAM MEMBER AND MANAGER: ");
		EmployeeComponent teamMemberAndManager = new Manager(teamMember);
		teamMemberAndManager.showBasicInformation();
		teamMemberAndManager.doTask();
		
		System.out.println("\nTEAM MEMBER AND MANAGER -> TEAM MEMBER: ");
		EmployeeDecorator teamMember2 = (EmployeeDecorator) teamMemberAndManager;
		teamMember2.getEmployeeComponent().showBasicInformation();
		teamMember2.getEmployeeComponent().doTask();
	}
}
