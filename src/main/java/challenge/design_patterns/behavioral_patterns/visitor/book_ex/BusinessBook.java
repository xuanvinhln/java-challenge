package challenge.design_patterns.behavioral_patterns.visitor.book_ex;

public class BusinessBook implements Book {
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String getPublisher() {
		return "The publisher of business book";
	}
}