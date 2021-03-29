package challenge.design_patterns.structural_patterns.flyweight.document_ex;

import java.util.ArrayList;
import java.util.List;

public class Row extends Glyph {
	private List<Glyph> children = new ArrayList<Glyph>();

	@Override
	public void draw(String context) {
		System.out.println("Row draw " + context);
		
		for (Glyph g : children) {
			g.draw("context");
		}
	}

	@Override
	public void intersects(int point, String context) {
		System.out.println("Row intersects " + context);
		
		for (Glyph g : children) {
			g.intersects(0, "context");
		}
	}

}
