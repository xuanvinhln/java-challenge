package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product;

import java.util.Iterator;
import java.util.List;

public class Document {
	private List<Token> listToken;
	private Iterator<Token> iter;
	
	public Document(List<Token> listToken) {
		this.listToken = listToken;
		this.iter = this.listToken.iterator();
	}
	
	public Token getNextToken() {
		if (this.iter.hasNext()) {
			return this.iter.next();
		} else {
			return null;
		}
	}
}
