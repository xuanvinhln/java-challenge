package challenge.design_patterns.behavioral_patterns.interpreter.postfix_mathexp_ex;

public class ParserUtil {
	public static boolean isOperator(String symbol) {
		return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*"));
	}

	public static Expression getExpressionObject(Expression firstExpression, Expression secondExpression,
			String symbol) {
		if (symbol.equals("+"))
			return new AdditionExpression(firstExpression, secondExpression);
		else if (symbol.equals("-"))
			return new SubtractionExpression(firstExpression, secondExpression);
		else
			return new MultiplicationExpression(firstExpression, secondExpression);
	}
}