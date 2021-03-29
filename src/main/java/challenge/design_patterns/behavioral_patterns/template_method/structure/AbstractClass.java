package challenge.design_patterns.behavioral_patterns.template_method.structure;

public abstract class AbstractClass {
	public final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
	}

	protected abstract void primitiveOperation1();

	protected abstract void primitiveOperation2();
}
