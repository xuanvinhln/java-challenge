package challenge.design_patterns.behavioral_patterns.observer.tracking_ex.observers;

import challenge.design_patterns.behavioral_patterns.observer.tracking_ex.User;

public class Logger implements Observer {

	@Override
	public void update(User user) {
		System.out.println("Logger: " + user);
	}
}