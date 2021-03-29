package challenge.design_patterns.behavioral_patterns.interpreter.sql_ex;

import java.util.List;

public interface Expression {
	public List<String> interpret(Context ctx);
}
