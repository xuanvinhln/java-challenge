package challenge.design_patterns.structural_patterns.composite.graphic_ex;

import challenge.design_patterns.structural_patterns.composite.graphic_ex.composite.Picture;
import challenge.design_patterns.structural_patterns.composite.graphic_ex.leaf.Line;
import challenge.design_patterns.structural_patterns.composite.graphic_ex.leaf.Rectangle;
import challenge.design_patterns.structural_patterns.composite.graphic_ex.leaf.Text;

public class Client {
	public static void main(String[] args) {
		Picture picture = new Picture();
		picture.add(new Line());
		picture.add(new Rectangle());
		picture.add(new Text());

		picture.draw();
	}
}
