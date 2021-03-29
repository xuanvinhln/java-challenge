package challenge.design_patterns.structural_patterns.flyweight.document_ex;

public class Character extends Glyph {
	private char c;

	public Character(char c) {
		this.c = c;
	}

	@Override
	public void draw(String context) {
		System.out.println("Character draw " + context + c);
	}

	@Override
	public void intersects(int point, String context) {
		System.out.println("Character intersects " + context + c);
	}
}
