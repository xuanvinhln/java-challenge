package challenge.design_patterns.behavioral_patterns.visitor.book_ex;

public class VisitorImpl implements Visitor {

	@Override
	public void visit(BusinessBook a) {
		System.out.println(a.getPublisher());
	}

	@Override
	public void visit(DesignPatternBook w) {
		System.out.println(w.getBestSeller());
	}

	@Override
	public void visit(JavaCoreBook g) {
		System.out.println(g.getFavouriteBook());
	}

	@Override
	public void visit(OthersBook othersBook) {
		System.out.println(othersBook.getResource());
	}
}