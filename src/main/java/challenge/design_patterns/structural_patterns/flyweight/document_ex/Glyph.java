package challenge.design_patterns.structural_patterns.flyweight.document_ex;

public abstract class Glyph {
	public abstract void draw(String context);
	public abstract void intersects(int point, String context);
}
