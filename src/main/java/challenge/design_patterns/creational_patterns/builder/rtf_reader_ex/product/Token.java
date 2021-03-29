package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product;

import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.type.Font;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.type.TokenType;

public class Token {
	private TokenType type;
	private Font font;
	private String value;

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public Token(TokenType type, String value) {
		this.type = type;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setType(TokenType type) {
		this.type = type;
	}

	public TokenType getType() {
		return this.type;
	}
}
