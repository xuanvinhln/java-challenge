package challenge.design_patterns.structural_patterns.composite.graphic_ex.leaf;

import challenge.design_patterns.structural_patterns.composite.graphic_ex.component.Graphic;

public class Line extends Graphic {

	@Override
	public void draw() {
		System.out.println("draw Line");
	}

	@Override
	public void add(Graphic graphic) {
		
	}

	@Override
	public void remove(int index) {
		
	}

	@Override
	public Graphic getChild(int index) {
		return null;
	}
}
