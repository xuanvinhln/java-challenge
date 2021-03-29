package challenge.design_patterns.structural_patterns.bridge.structure.abstraction;

import challenge.design_patterns.structural_patterns.bridge.structure.implementor.Implementor;

public abstract class Abstraction {
	private Implementor imp;
	
	public void operation() {
		this.imp.operationImp();
	}
}
