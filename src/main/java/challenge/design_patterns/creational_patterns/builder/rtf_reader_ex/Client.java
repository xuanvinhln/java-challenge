package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex;

import java.util.ArrayList;

import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.concrete_builder.ASCIIConverter;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.director.RTFReader;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.ASCIIText;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.Document;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.Token;
import challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product.type.TokenType;

public class Client {
	public static void main(String args[]) {
		ArrayList<Token> list = new ArrayList<Token>();
		list.add(new Token(TokenType.CHAR, "c"));
		list.add(new Token(TokenType.FONT, "h"));
		list.add(new Token(TokenType.PARAGRAPH, "u"));
		Document doc = new Document(list);

		RTFReader rtfReader = new RTFReader(new ASCIIConverter());
		rtfReader.parseRTF(doc);
		ASCIIText asciiText = ((ASCIIConverter) rtfReader.getBuilder()).getASCIIText();
		
		asciiText.show();

		System.out.println("This is an example of Builder Pattern");
	}
}
