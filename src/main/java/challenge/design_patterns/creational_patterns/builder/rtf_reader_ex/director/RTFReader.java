package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.director;

import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.builder.TextConverter;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.Document;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.Token;

public class RTFReader {
	private TextConverter builder;

	public TextConverter getBuilder() {
		return builder;
	}

	public void setBuilder(TextConverter builder) {
		this.builder = builder;
	}

	public RTFReader(TextConverter textConverter) {
		this.builder = textConverter;
	}

	public void parseRTF(Document doc) {
		Token t = doc.getNextToken();

		while (t != null) {
			switch (t.getType()) {
			case CHAR:
				builder.convertCharacter(t.getValue().toCharArray());
				break;

			case FONT:
				builder.convertFontChange(t.getFont());

			case PARAGRAPH:
				builder.convertParagraph(t.getValue());
			}

			t = doc.getNextToken();
		}
	}
}
