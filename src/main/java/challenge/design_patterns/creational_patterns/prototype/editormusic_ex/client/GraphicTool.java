package challenge.design_patterns.creational_patterns.prototype.editormusic_ex.client;

import java.util.ArrayList;
import java.util.List;

import challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype.Graphic;

public class GraphicTool implements Tool {
	private Graphic prototype;
	private List<Graphic> drawing = new ArrayList<Graphic>();

	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}

	@Override
	public void manipulate() {
		System.out.println("GraphicTool");
		Graphic p = this.prototype.clone();

		p.draw(0);

		drawing.add(p);
	}

	public Graphic getPrototype() {
		return prototype;
	}

	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}

	public List<Graphic> getDrawing() {
		return drawing;
	}

	public void setDrawing(List<Graphic> drawing) {
		this.drawing = drawing;
	}
}
