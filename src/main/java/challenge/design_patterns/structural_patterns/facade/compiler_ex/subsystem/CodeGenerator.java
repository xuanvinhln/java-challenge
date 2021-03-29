package challenge.design_patterns.structural_patterns.facade.compiler_ex.subsystem;

public abstract class CodeGenerator {
	private BytecodeStream bytecodeStream;

	public CodeGenerator(BytecodeStream bytecodeStream) {
		this.bytecodeStream = bytecodeStream;
	}

	public void generate() {
		System.out.println("CodeGenerator generate");
		this.bytecodeStream.hashCode();
	}
}
