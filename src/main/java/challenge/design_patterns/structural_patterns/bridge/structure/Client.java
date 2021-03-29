package challenge.design_patterns.structural_patterns.bridge.structure;

import challenge.design_patterns.structural_patterns.bridge.structure.abstraction.Abstraction;
import challenge.design_patterns.structural_patterns.bridge.structure.abstraction.RefinedAbstraction;

public class Client {
	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.operation();
	}
}
