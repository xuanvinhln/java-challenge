package challenge.design_patterns.structural_patterns.facade.structure;

import challenge.design_patterns.structural_patterns.facade.structure.subsystem.Facade;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doSomething();
	}

}
