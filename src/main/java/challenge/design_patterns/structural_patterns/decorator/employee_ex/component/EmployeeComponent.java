package challenge.design_patterns.structural_patterns.decorator.employee_ex.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {
	public void doTask();

	public void join(Date joinDate);

	public void terminate(Date terminateDate);

	public String getName();

	public default String formatDate(Date theDate) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(theDate);
	}

	public default void showBasicInformation() {
		System.out.println("-------");
		System.out.println("The basic information of " + getName());

		join(Calendar.getInstance().getTime());

		Calendar terminateDate = Calendar.getInstance();
		terminateDate.add(Calendar.MONTH, 6);
		terminate(terminateDate.getTime());
	}
}
