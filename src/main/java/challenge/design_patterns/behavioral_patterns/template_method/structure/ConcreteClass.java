package challenge.design_patterns.behavioral_patterns.template_method.structure;

public class ConcreteClass extends AbstractClass {

	@Override
	protected void primitiveOperation1() {
		System.out.println("primitiveOperation1");
	}

	@Override
	protected void primitiveOperation2() {
		System.out.println("primitiveOperation2");
	}

}
