package challenge.design_patterns.creational_patterns.prototype.structure;

public class Client {
	Prototype prototype;

	public Client(Prototype prototype) {
		this.prototype = prototype;
	}

	public void operation() {
		Prototype objNew = (Prototype) prototype.clone();
		objNew.toString();
	}

	public static void main(String[] args) {
		ConcretePrototype1 prototype1 = new ConcretePrototype1();

		Client client = new Client(prototype1);
		client.operation();
	}
}
