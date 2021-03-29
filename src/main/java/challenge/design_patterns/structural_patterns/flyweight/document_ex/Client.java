package challenge.design_patterns.structural_patterns.flyweight.document_ex;

public class Client {
	public static void main(String[] args) {
		Glyph glyph = GlyphFactory.getInstance().getGlyph("c");
		glyph.draw("context");
	}
}
