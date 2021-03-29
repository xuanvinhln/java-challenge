package challenge.design_patterns.behavioral_patterns.mediator.structure;

public class Client {
	public static void main(String[] args) {
		ConcreteMediator concreteMediator = new ConcreteMediator();

		Colleague colleague1 = new ConcreteColleague1(concreteMediator);
		Colleague colleague2 = new ConcreteColleague2(concreteMediator);

		concreteMediator.addColleague(colleague1);
		concreteMediator.addColleague(colleague2);

		colleague1.handler1();
		colleague2.handler1();
	}
}
