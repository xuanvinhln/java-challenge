package challenge.design_patterns.behavioral_patterns.template_method.structure;

public class Client {
	public static void main(String[] args) {
		ConcreteClass concreteClass = new ConcreteClass();
		concreteClass.templateMethod();
	}
}
