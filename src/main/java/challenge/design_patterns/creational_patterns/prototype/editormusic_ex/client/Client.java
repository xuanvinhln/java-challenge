package challenge.design_patterns.creational_patterns.prototype.editormusic_ex.client;

import challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype.HalfNote;
import challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype.WholeNote;

public class Client {
	public static void main(String[] args) {
		WholeNote wholeNote = new WholeNote();
		HalfNote halfNote = new HalfNote();

		GraphicTool tool1 = new GraphicTool(wholeNote);
		tool1.manipulate();

		tool1.setPrototype(halfNote);
		tool1.manipulate();
	}
}
