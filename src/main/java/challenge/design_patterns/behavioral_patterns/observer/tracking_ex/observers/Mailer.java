package challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers;

import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.LoginStatus;
import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.User;

public class Mailer implements Observer {

	@Override
	public void update(User user) {
		if (user.getStatus() == LoginStatus.EXPIRED) {
			System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
		}
	}
}