package challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers;

import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.LoginStatus;
import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.User;

public class Protector implements Observer {

	@Override
	public void update(User user) {
		if (user.getStatus() == LoginStatus.INVALID) {
			System.out.println(
					"Protector: User " + user.getEmail() + " is invalid. " + "IP " + user.getIp() + " is blocked");
		}
	}
}