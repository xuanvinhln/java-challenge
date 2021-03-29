package challenge.design_patterns.behavioral_patterns.visitor.book_ex;

public class OthersBook implements ProgramingBook {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getResource() {
		return "Undefined";
	}
}