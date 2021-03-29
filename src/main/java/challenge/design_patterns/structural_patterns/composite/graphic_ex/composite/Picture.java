package challenge.design_patterns.structural_patterns.composite.graphic_ex.composite;

import java.util.ArrayList;
import java.util.List;

import challenge.design_patterns.structural_patterns.composite.graphic_ex.component.Graphic;

public class Picture extends Graphic {
	private List<Graphic> components = new ArrayList<>();

	public Picture() {

	}

	public Picture(List<Graphic> components) {
		this.components = components;
	}

	@Override
	public void draw() {
		for (Graphic graphic : components) {
			graphic.draw();
		}
	}

	@Override
	public void add(Graphic graphic) {
		this.components.add(graphic);
	}

	@Override
	public void remove(int index) {
		this.components.remove(index);
	}

	@Override
	public Graphic getChild(int index) {
		return this.components.get(index);
	}
}
