package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.concrete_builder;

import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.builder.TextConverter;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.ASCIIText;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.type.Font;

public class ASCIIConverter extends TextConverter {
	private ASCIIText asciiText;
	
	public ASCIIConverter() {
		this.asciiText = new ASCIIText();
	}

	@Override
	public void convertCharacter(char[] c) {
		char asciiChar = Character.valueOf(c[0]).charValue();
		this.asciiText.append(asciiChar);
	}

	@Override
	public void convertFontChange(Font font) {

	}

	@Override
	public void convertParagraph(String para) {

	}

	public ASCIIText getASCIIText() {
		return asciiText;
	}
}
