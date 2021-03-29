package challenge.design_patterns.behavioral_patterns.visitor.book_ex;

public interface Visitor {

	public void visit(BusinessBook book);

	public void visit(DesignPatternBook book);

	public void visit(JavaCoreBook book);

	public void visit(OthersBook othersBook);
}