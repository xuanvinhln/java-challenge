package challenge.design_patterns.behavioral_patterns.interpreter.math_ex;

public class Client {
	public static void main(String args[]) {
		System.out.println("20 cong 8 = " + interpret("20 cong 8"));
		System.out.println("10 tru 4 = " + interpret("10 tru 4"));
	}

	private static int interpret(String input) {
		Expression exp = null;

		if (input.contains("cong")) {
			exp = new AddExpression(input);
		} else if (input.contains("tru")) {
			exp = new SubtractExpression(input);
		} else {
			throw new UnsupportedOperationException();
		}

		return exp.interpret(new InterpreterEngineContext());
	}
}
