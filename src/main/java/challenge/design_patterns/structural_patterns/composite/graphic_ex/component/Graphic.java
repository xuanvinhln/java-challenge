package challenge.design_patterns.structural_patterns.composite.graphic_ex.component;

public abstract class Graphic {
	public abstract void draw();

	public abstract void add(Graphic graphic);

	public abstract void remove(int index);

	public abstract Graphic getChild(int index);
}
