package challenge.design_patterns.structural_patterns.facade.compiler_ex;

import challenge.design_patterns.structural_patterns.facade.compiler_ex.subsystem.CompilerFacade;

public class Client {
	public static void main(String[] args) {
		CompilerFacade compiler = new CompilerFacade();
		compiler.compile();
	}
}
