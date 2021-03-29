package challenge.design_patterns.structural_patterns.facade.compiler_ex.subsystem;

public class CompilerFacade {
	public void compile() {
		Scanner scanner = new Scanner();
		System.out.println(scanner.toString());

		Parser parser = new Parser();
		System.out.println(parser.toString());

		ProgramNodeBuilder builder = new ProgramNodeBuilder();
		builder.build("statement");

		CodeGenerator codeGenerator = new StackMachineCodeGenerator(new BytecodeStream());
		codeGenerator.generate();

		System.out.println("Compile done");
	}
}
