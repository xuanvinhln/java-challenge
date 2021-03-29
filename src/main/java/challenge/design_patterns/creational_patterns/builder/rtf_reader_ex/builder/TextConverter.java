package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.builder;

import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.type.Font;

public abstract class TextConverter {
	public abstract void convertCharacter(char[] c);
	public abstract void convertFontChange(Font font);
	public abstract void convertParagraph(String paragraph);
}
