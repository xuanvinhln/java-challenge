package challenge.design_patterns.behavioral_patterns.mediator.structure;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
	private List<Colleague> colleagues;

	public ConcreteMediator() {
		this.colleagues = new ArrayList<Colleague>();
	}

	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
	}

	@Override
	public void cooperativeBehavior(Colleague colleague) {
		for (Colleague colleagueTmp : colleagues) {
			if (colleagueTmp != colleague) {
				colleagueTmp.handler2();
			}
		}
	}
}
