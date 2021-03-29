package challenge.design_patterns.behavioral_patterns.mediator.structure;

public class ConcreteColleague2 implements Colleague {
	private Mediator mediator;

	public ConcreteColleague2(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void handler1() {
		System.out.println("ConcreteColleague2 handler1");
		this.mediator.cooperativeBehavior(this);
	}

	@Override
	public void handler2() {
		System.out.println("ConcreteColleague2 handler2");
	}
}
