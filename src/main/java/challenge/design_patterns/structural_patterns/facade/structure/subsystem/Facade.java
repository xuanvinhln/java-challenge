package challenge.design_patterns.structural_patterns.facade.structure.subsystem;

public class Facade {
	private ClassA classA;
	private ClassB classB;
	private ClassC classC;

	public Facade() {
		this.classA = new ClassA();
		this.classB = new ClassB();
		this.classC = new ClassC();
	}

	public void doSomething() {
		this.classA.doSomething();
		this.classB.doSomething();
		this.classC.doSomething();
	}
}
