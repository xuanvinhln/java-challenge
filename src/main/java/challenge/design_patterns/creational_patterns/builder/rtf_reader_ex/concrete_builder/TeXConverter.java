package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.concrete_builder;

import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.builder.TextConverter;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.TeXText;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.type.Font;

public class TeXConverter extends TextConverter {
	private TeXText text;

	public TeXConverter() {
		this.text = new TeXText();
	}

	@Override
	public void convertCharacter(char[] c) {
		char charTmp = Character.valueOf(c[0]).charValue();
		this.text.append(charTmp);
	}

	@Override
	public void convertFontChange(Font font) {
		System.out.println("TeXConverter convertFontChange");
	}

	@Override
	public void convertParagraph(String para) {
		System.out.println("TeXConverter convertParagraph");
	}

	public TeXText getASCIIText() {
		return text;
	}
}
